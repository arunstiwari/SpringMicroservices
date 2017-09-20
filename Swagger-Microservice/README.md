```
1. Basic Example to show how to integrate the Swagger with Microservices

2. Add following dependency to pom for Swagger requirement

	<dependency>
      <groupId>io.springfox</groupId>
      <artifactId>springfox-swagger2</artifactId>
      <version>2.6.1</version>
    </dependency> 

    <dependency>
      <groupId>io.springfox</groupId>
      <artifactId>springfox-swagger-ui</artifactId>
      <version>2.6.1</version>
    </dependency>
	
3. Add annotation @EnableSwagger2 on the SpringBoot Application class

4. Run the Spring Boot App. Go to the browser http://localhost:8080/ui-swagger.html 
	You will see the documentation detail
