```
1. Basic Example to show HATEOAS implementation

2. Create a Spring Boot Application In Eclipse. Choose Java8, spring-boot version and Web, HATEOAS and Rest Repositores HAL Browser as dependency.

3. Pom has following important entry

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.0.0.M4</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	
	<dependency>
		<groupId>org.springframework.data</groupId>
		<artifactId>spring-data-rest-hal-browser</artifactId>
	</dependency>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-hateoas</artifactId>
	</dependency>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
	
4. Implement a simple GreetingController.
		linkTo and methodOn are the method of ControllerLinkBuilder class.

5. Greet class should extend ResourceSupport

6. Run the Spring Boot App. Go to the browser http://localhost:8080/ 
	You should see the message in browser "Hello World!"
