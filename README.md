# Java Demo
#### 1.1.0
 - 2018-12-28 - [](https://github.com/SanjaykumarMehta/javademo/) by [Sanjay Mehta](https://github.com/SanjaykumarMehta/javademo/) (1) - published to [![Bintray](https://github.com/SanjaykumarMehta/javademo/)](https://github.com/SanjaykumarMehta/javademo)
 * Demo For:
   * 1: Spring Boot
     *  **Micro Service**

= Spring Boot image:["Build Status", link=""]


Spring Boot makes it easy to create Spring-powered, production-grade applications and
services with absolute minimum fuss. It takes an opinionated view of the Spring platform
so that new and existing users can quickly get to the bits they need.


----
	import org.springframework.boot.*;
	import org.springframework.boot.autoconfigure.*;
	import org.springframework.web.bind.annotation.*;

	@RestController
	@SpringBootApplication
	public class Example {

		@RequestMapping("/")
		String home() {
			return "Hello World!";
		}

		public static void main(String[] args) throws Exception {
			SpringApplication.run(Example.class, args);
		}

	}
----

== Modules
overview:



=== spring-boot


* The `SpringApplication` class, providing static convenience methods that make it easy
to write a stand-alone Spring Application. Its sole job is to create and refresh an
appropriate Spring `ApplicationContext`
* Embedded web applications with a choice of container (Tomcat, Jetty or Undertow)
* First class externalized configuration support
* Convenience `ApplicationContext` initializers, including support for sensible logging
defaults


TIP: The generated documentation is available from ``
