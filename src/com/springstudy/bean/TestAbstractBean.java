package com.springstudy.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAbstractBean {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springstudy/bean/abstractbean.xml");
		Chinese chinese = ctx.getBean("chinese",Chinese.class);
		American ame = ctx.getBean("american", American.class);
		System.out.println(chinese.getFeature());
		System.out.println(ame.getFeature());
	}
}
