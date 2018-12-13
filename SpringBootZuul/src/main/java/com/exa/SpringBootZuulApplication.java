package com.exa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * @author 43313
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class SpringBootZuulApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootZuulApplication.class);
	 public static void main(String[] args) {
		    LOGGER.info("***********************   Zull Service Application Start  *******************");
	        SpringApplication.run(SpringBootZuulApplication.class, args);
	        LOGGER.info("***********************   Zull Service Application End  *******************");
	 }

}
