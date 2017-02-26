package com.springstudy.eventListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailListener implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof EmailEvent) {
			EmailEvent emailevent = (EmailEvent)event;
			System.out.println("address is :" + emailevent.getAddress());
			System.out.println("content is :" + emailevent.getContent());
		}else {
			System.out.println("else event :" + event);
		}
	}
	
}
