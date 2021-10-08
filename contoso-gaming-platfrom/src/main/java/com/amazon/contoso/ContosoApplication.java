package com.amazon.contoso;

import static com.amazon.contoso.constants.ApplicationConstants.HTTPS;
import static com.amazon.contoso.constants.ApplicationConstants.HTTP;
import static com.amazon.contoso.constants.ApplicationConstants.SWAGGER_PAC;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ContosoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ContosoApplication.class, args);
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).protocols(Stream.of(HTTPS, HTTP).collect(Collectors.toSet()))
				.select().apis(RequestHandlerSelectors.basePackage(SWAGGER_PAC)).build();
	}
}
