package com.springstudy.eventListener;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class EmailEvent extends ApplicationEvent{

	@SuppressWarnings("unused")
	private String address;
	@SuppressWarnings("unused")
	private String content;
	
	public EmailEvent(Object source) {
		super(source);
	}
	
	public EmailEvent(Object source,String address,String content) {
		super(source);
		this.address = address;
		this.content	 = content;
	}

	public String getAddress() {
		return this.address;
	}
	
	public String getContent() {
		return this.content;
	}
}
