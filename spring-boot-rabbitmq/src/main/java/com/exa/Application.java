package com.exa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * @author 43313
 *
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(Application.class);
	    }

	 public static void main(String[] args) {
		     LOGGER.info("***********************   Rabbit Mq Application Start  *******************");
	        SpringApplication.run(Application.class, args);
	        LOGGER.info("***********************   Rabbit Mq Application End  *******************");
	 }

}
