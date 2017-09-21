package com.arun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CustomerNotiificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerNotiificationServiceApplication.class, args);
	}
	
	@RestController
	class NotificationServiceController{
		
		
		@RequestMapping(path="/notify",method=RequestMethod.POST)
		public String notify(@RequestBody String message) {
			return "Message Sent";
		}
	}
}
