package com.hexaware.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

import com.google.common.collect.Sets;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class SwaggerConfig {


    @Bean
    public Docket api() {       
        return new Docket(DocumentationType.SWAGGER_2)
                .produces(Sets.newHashSet(MediaType.APPLICATION_JSON_VALUE))
                .consumes(Sets.newHashSet(MediaType.APPLICATION_JSON_VALUE))
                .protocols(Sets.newHashSet("http", "https"))
                .apiInfo(apiInfo())
                .forCodeGeneration(true)
                .select()
                // controller
                .apis(RequestHandlerSelectors.basePackage("com.hexaware.controller"))
                // .paths(PathSelectors.ant("/hexaware/*"))
                .paths(PathSelectors.any())
                .build();
    }
    

    private ApiInfo apiInfo() {
        String description = "Spring Boot REST Service example";
        return new ApiInfoBuilder()
                .title("Spring Boot REST Service")
                .description(description)
                .termsOfServiceUrl("github")
                .license("")
                .licenseUrl("")
                .contact(new Contact("Any issue please contect Nt team","","sanjaykumarm@hexaware.com"))
                .version("1.0")
                .build(); 
    }

}
