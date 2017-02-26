package com.springstudy.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springstudy/bean/beans.xml");
		System.out.println(ctx.getBean("person") == ctx.getBean("person"));
		System.out.println(ctx.getBean("prototype") == ctx.getBean("prototype"));
		
		System.out.println("single date is " + ctx.getBean("date"));
		Thread.sleep(1000);
		System.out.println("After the 1s,single date is " + ctx.getBean("date"));
	}
}
