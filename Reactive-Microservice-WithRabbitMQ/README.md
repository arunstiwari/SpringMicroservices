```
1. Basic Example to show how to write the Reactive Microservice using Spring Boot and RabbitMQ


2. Create a Spring Boot Application In Eclipse. Choose Java8, spring-boot version and AMQP as dependency.

3. Pom has following important entry

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.0.0.M4</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	
	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-amqp</artifactId>
	</dependency>
	
4. Implement a simple Sender and Receiver

5. Add the properties related to RabbitMQ server.

6. Start the rabbitmq server

7. Run the Spring Boot App. You shold see the message "Hello Welcome to RabbitMQ Based Microservice"