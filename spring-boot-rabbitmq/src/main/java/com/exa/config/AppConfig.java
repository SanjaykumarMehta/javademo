package com.exa.config;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.yaml.SpringProfileDocumentMatcher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StringUtils;

import com.exa.utils.ApplicationConstants;

/**
 * @author 43313
 *
 */
@Configuration
public class AppConfig {
	private static final Logger LOGGER = LoggerFactory.getLogger(AppConfig.class);
	
	 @Bean
	    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
	        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
	        Properties ymlProperties = getProperties();
	        LOGGER.info("ymlProperties:"+ymlProperties.toString());
	        LOGGER.info("ymlProperties:");
	        propertySourcesPlaceholderConfigurer.setProperties(ymlProperties);
	        System.setProperty(ApplicationConstants.ACTIVE_PROFILE,ymlProperties.getProperty("spring.profiles"));

	        //propertySourcesPlaceholderConfigurer.setLocations(new ClassPathResource("application-db.properties"));
	        //propertySourcesPlaceholderConfigurer.setIgnoreUnresolvablePlaceholders(true);
	        //propertySourcesPlaceholderConfigurer.setIgnoreResourceNotFound(true);

	        return propertySourcesPlaceholderConfigurer;
	    }

	   private static Properties getProperties(){
	     String ymlFile = System.getenv(ApplicationConstants.YML_FILELOC);
	   //  File ymlInputFile = new File(ymlFile);
	     LOGGER.info("ymlFile:"+ymlFile);
	     String activeProfile = System.getenv(ApplicationConstants.SPRING_PROFILE_ACTIVE);
	      if(StringUtils.isEmpty(activeProfile)){
	        activeProfile = ApplicationConstants.SPRING_PROFILE_DEFAULT;
	      }
	      LOGGER.info("SPRING_PROFILE_ACTIVE:"+activeProfile);
	     YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
	     yaml.setDocumentMatchers(new SpringProfileDocumentMatcher(activeProfile));
	     yaml.setResources(new ClassPathResource(ymlFile));
	 
	      //propertyConfig.setProperties(yaml.getObject());
	      return yaml.getObject();
	   }

}
