package com.jvs.resthibernate.entity;

public class Greeting extends BaseEntityImpl {
	
	private long id;
	private String content;

	public Greeting() {		
	}

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
