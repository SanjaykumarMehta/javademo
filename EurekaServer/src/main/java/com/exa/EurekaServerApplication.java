package com.exa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



/**
 * @author 43313
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(EurekaServerApplication.class);
	 public static void main(String[] args) {
		    LOGGER.info("***********************   EurekaServer Application Start  *******************");
		    //new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
		    SpringApplication.run(EurekaServerApplication.class, args);
	        LOGGER.info("***********************   EurekaServer Application End  *******************");
	 }

}
