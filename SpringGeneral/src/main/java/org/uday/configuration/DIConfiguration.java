package org.uday.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.uday.services.MessageService;
import org.uday.services.TwitterService;

@Configuration
@ComponentScan(value = {"org.uday.consumer"})
public class DIConfiguration {

	@Bean
	public MessageService getMessageService() {
		return new TwitterService();
	}
}
