package com.arun;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.arun.Greet;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.DEFINED_PORT)
public class ReactiveSpringMicroserviceApplicationTests {
	
	WebTestClient client;
	
	@Before
	public void before() {
		client = WebTestClient.bindToServer().baseUrl("http://localhost:8080").build();
	}

	@Test
	public void testEndpoint() {
		client.get().uri("/")
			.accept(MediaType.APPLICATION_JSON)
			.exchange()
			.expectStatus().isOk()
			.expectBody(Greet.class).returnResult()
			.getResponseBody().getMessage().equals("Hello World!");
	}

}
