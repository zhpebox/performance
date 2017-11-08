package com.performance.redis;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BooKDaoImpl implements BookDao {
	
	@Autowired
	RedisTemplate<Serializable, Serializable> redisTemplate;
	
	 @Resource(name = "redisTemplate")
	 private ValueOperations<String, Object> vOps;
	
	@Override
	public void save(Book book) {
		redisTemplate.execute(new RedisCallback<Object>() {

			@Override
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				connection.set(redisTemplate.getStringSerializer().serialize("book.bookid."+book.getBid()),
						redisTemplate.getStringSerializer().serialize(book.getBname()));
				
				return null;
			}
		});
	}

	@Override
	public Book read(String bid) {
		return redisTemplate.execute(new RedisCallback<Book>() {

			@Override
			public Book doInRedis(RedisConnection connection)
					throws DataAccessException {
				byte[] key = redisTemplate.getStringSerializer().serialize(
						"book.bookid."+bid);
				if(connection.exists(key)){
					byte[] value = connection.get(key);
					String bname = redisTemplate.getStringSerializer().deserialize(
							value);
					Book book = new Book(bid,bname);
					return book;
				}
				return null;
			}
			
		});
	}

	@Override
	public void delete(String bid) {
		redisTemplate.execute(new RedisCallback<Object>() {

			@Override
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				connection.del(redisTemplate.getStringSerializer().serialize("book.bid."+bid));
				connection.del("b123457".getBytes());
				return null;
			}
			
		});

	}

}
