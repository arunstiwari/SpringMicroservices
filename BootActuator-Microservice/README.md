```
1. Basic Example to show how to write the Actuator  using Spring Boot 


2. Create a Spring Boot Application In Eclipse. Choose Java8, Web, HAL Browser, Hateoas, Actuator as dependency.

3. Pom has following important entry

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.0.0.M1</version>
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
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
	
4. Implement a HelloWorldController

5. Add the properties related to management endpoint within application.properties


6. Run the Spring Boot App. Go to the url http://localhost:8080/application