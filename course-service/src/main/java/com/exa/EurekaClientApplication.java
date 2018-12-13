package com.exa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(EurekaClientApplication.class);

	 public static void main(String[] args) {	       
	        LOGGER.info("***********************   Course Service Application Start  *******************");
	        SpringApplication.run(EurekaClientApplication.class, args);
	        LOGGER.info("***********************   Course Service Application End  *******************");
	 }

}
