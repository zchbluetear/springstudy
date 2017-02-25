package com.sprinfstudy.MessageResouce;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//ApplicationContext实现资源化
public class MessageResource {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/sprinfstudy/MessageResouce/resource.xml");
		String hello = ctx.getMessage("hello", new String[]{"孙悟空"}, Locale.getDefault(Locale.Category.FORMAT));
		System.out.println(hello);
	}
}
