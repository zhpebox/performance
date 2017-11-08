package com.jedis.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.performance.redis.Book;
import com.performance.redis.BookDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={//"classpath:conftest/spring.xml",
		"classpath:conftest/spring-redis.xml"})    
public class BookRedisTest {

	@Autowired
	BookDao bookDao;
	
	@Test
	public void crud(){
		String bid = "b123457";
		String bname = "中华五千年";
		Book book1 = new Book(bid,bname);
		
		bookDao.save(book1);
		
		Book book2 = bookDao.read(bid);
		
		Assert.assertEquals(book1.getBname(), book2.getBname());
		
		
		String bnames = "明朝那些事";
		book2.setBname(bnames);
		bookDao.save(book2);
		
		Assert.assertEquals(bnames, bookDao.read(bid).getBname());
		
		bookDao.delete(bid);
		Book book3 = bookDao.read(bid);
		Assert.assertNull(book3);
		
	}
	
}
