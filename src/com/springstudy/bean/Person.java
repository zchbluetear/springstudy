package com.springstudy.bean;

import java.util.Locale;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements ApplicationContextAware{
	ApplicationContext ctx;
	

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ctx = applicationContext;
	}
	
	public void sayHi(String name) {
		System.out.println(ctx.getMessage("hello",new String[]{name},Locale.getDefault(Locale.Category.FORMAT)));
	}

}
