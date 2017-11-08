package com.performance.redis;

import java.io.Serializable;

public class Book implements Serializable{
	
	private static final long serialVersionUID = -1883151155726138927L;
	
	private String bid;
	private String bname;
	
	public Book(String bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	
	
}
