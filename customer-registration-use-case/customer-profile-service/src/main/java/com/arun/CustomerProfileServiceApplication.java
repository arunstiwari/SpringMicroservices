package com.arun;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.arun.entity.Customer;
import com.arun.repository.CustomerRepository;

@SpringBootApplication
public class CustomerProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerProfileServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(CustomerRepository repo) {
		return (evt) -> {
			repo.save(new Customer("ABC","ABC@emergentconsulting.com"));
			repo.save(new Customer("CDE","CDE@emergentconsulting.com"));
			repo.save(new Customer("EFG","EFG@emergentconsulting.com"));
			repo.save(new Customer("GHI","GHI@emergentconsulting.com"));
		};
	}
}
