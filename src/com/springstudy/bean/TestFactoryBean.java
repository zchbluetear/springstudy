package com.springstudy.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springstudy/bean/FactoryBean.xml");
		//返回的是Bean实例的getObject方法
		//基于此，我们可以重写getObject()让Spring getBean返回指定的内容
		System.out.println(ctx.getBean("north"));
		//返回FactoryBean本身
		System.out.println(ctx.getBean("&north"));
	}
}
