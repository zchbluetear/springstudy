package com.springstudy.eventListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListenerTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springstudy/eventListener/listener.xml");
		//ApplicationContext显示的发布事件
		
		//EmailEvent emailEvent = new EmailEvent("test","1414490125@qq.com","this is a event");
		//ctx.publishEvent(emailEvent);
		
		EmailEvent emailevent = ctx.getBean("emailevent",EmailEvent.class);
		ctx.publishEvent(emailevent);
		
		//自定义事件必须显示的去发布
	}
}
