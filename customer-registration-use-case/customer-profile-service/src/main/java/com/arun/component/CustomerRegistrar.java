package com.arun.component;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.arun.Sender;
import com.arun.entity.Customer;
import com.arun.repository.CustomerRepository;

import reactor.core.publisher.Mono;

@Component
public class CustomerRegistrar {
	
	CustomerRepository customerRepository;
	private Sender sender;
	
	
	public CustomerRegistrar(CustomerRepository customerRepository, Sender sender) {
		this.customerRepository = customerRepository;
		this.sender = sender;
	}

	public Mono<Customer> register(Customer customer) {
		if(customerRepository.findByName(customer.getName()).isPresent()) {
			System.out.println("Duplicate Customer. No Action required");
		} else {
			customerRepository.save(customer);
			sender.send(customer.getEmail());
		}
		return Mono.just(customer);
	}

}
