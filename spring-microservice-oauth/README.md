```
1. Basic Example to show how to configure the OAuth2 Security for the Microservices

2. Create a Spring Boot Application In Eclipse. Choose Java8, spring-boot version and Web as dependency.

3. Pom has following important entry

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.0.0.M3</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	
	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
	</dependency>
	<dependency>
          <groupId>org.springframework.security.oauth</groupId>
          <artifactId>spring-security-oauth2</artifactId>
        </dependency>

        <!-- below dependency is explicitly required when
         testing OAuth2 with Spring Boot 2.0.0.M1 -->
        <dependency>
          <groupId>org.springframework.security</groupId>
          <artifactId>spring-security-crypto</artifactId>
        </dependency> 
	
4. Implement a simple HelloWorldController

5. Add two new annotations @EnableResourceServer and @EnableAuthorizationServer on the SpringBootApplicaiton class

6. Add the new properties in the application.properties file

5. Add the user security property in the application.properties

6. Run the Spring Boot App. Go to the browser http://localhost:8080/ 
	It should prompt for the Login credential. Use the username and password you have set in the application.properties file.
	
	You should see the message in browser "Hello World!"
