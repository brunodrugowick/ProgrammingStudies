# Dependency Injection - Spring Context

This application is showing how the Spring Context works.

Notice how I'm getting a context from SpringApplication.run and asking that context to give me a bean from the class MyController.

I'm not running a "new" on the class. I'm asking the context to give me a bean, putting it on a variable "controller" and then calling the hello() method, which successfully prints hello to the console.

Notice also as this application runs normally and exits at the end, unlike a web Spring Boot application would.

By only adding:
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
to the pom.xml, I would make it a web application.

It works, I tested it!