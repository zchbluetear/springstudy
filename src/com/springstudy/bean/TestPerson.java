package com.springstudy.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springstudy/bean/beans.xml");
		Person person = ctx.getBean("person", Person.class);
		person.sayHi("zhangchenhui");
	}
}
