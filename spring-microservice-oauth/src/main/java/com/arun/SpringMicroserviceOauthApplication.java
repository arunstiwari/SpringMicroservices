package com.arun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableResourceServer
@EnableAuthorizationServer
@SpringBootApplication
public class SpringMicroserviceOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceOauthApplication.class, args);
	}
	
	
	@RestController
	class HelloWorldController {

		@RequestMapping("/")
		public Greet hello() {
			return new Greet("Hello World!");
		}
	}
}
