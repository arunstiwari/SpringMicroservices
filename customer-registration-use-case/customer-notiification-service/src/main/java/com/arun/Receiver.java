package com.arun;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.arun.component.Mailer;

@Component
public class Receiver {
	
	@Autowired
	Mailer mailer;

	
	@Bean
	public Queue queue() {
		return new Queue("CustomerQ",false);
	}
	
	@RabbitListener(queues="CustomerQ")
	public void processMessage(String email) {
		System.out.println(email);
		mailer.send(email);
	}
}
