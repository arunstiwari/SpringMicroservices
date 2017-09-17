```
1. Basic Example to show how to write the Reactive Microservice

2. Create a Spring Boot Application In Eclipse. Choose Java8, spring-boot version and reactive web as dependency.

3. Pom has following important entry

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.0.0.M4</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	
	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-webflux</artifactId>
	</dependency>
	
4. Implement a simple HelloWorldController

5. Run the Spring Boot App. Go to the browser http://localhost:8080/ 
	You should see the message in browser "Hello World!"
