package org.uday.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.uday.services.MessageService;

@Component
public class MyApplication {
	
	private MessageService service;
	
	@Autowired
	public void setService(MessageService svc) {
		this.service = svc;
	}
	
	public boolean processMessage(String msg, String rec) {
		return this.service.sendMessage(msg, rec);
	}
}
