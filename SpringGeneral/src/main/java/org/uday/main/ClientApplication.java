package org.uday.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.uday.configuration.DIConfiguration;
import org.uday.consumer.MyApplication;

public class ClientApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		
		app.processMessage("Hi Uday", "uday.rajpurohit@gmail.com");
		context.close();
	}
}
