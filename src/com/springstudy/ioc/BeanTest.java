package com.springstudy.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		//创建spring容器 此后容器会预初始化对象的和依赖关系的建立
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		//获取Chinese实例，返回对应的接口
		Person person = ctx.getBean("chinese", Person.class);
		//通过接口调用
		person.useAxe();
		
	}
}
