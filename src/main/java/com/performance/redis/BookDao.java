package com.performance.redis;

public interface BookDao {
	void save(Book book);
	Book read(String bid);
	void delete(String bid);
}
