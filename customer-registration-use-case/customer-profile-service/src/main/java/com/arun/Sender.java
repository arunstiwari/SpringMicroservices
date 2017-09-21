package com.arun;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;



@Component
@Lazy
public class Sender {

	private static final String CUSTOMER_Q = "CustomerQ";
	
	@Autowired
	RabbitMessagingTemplate template;
	
	@Bean
	Queue queue() {
		return new Queue(CUSTOMER_Q,false);
	}
	
	public void send(String message) {
		template.convertAndSend(CUSTOMER_Q,message);
		System.out.println("Message sent to email :"+message);
	}
}
