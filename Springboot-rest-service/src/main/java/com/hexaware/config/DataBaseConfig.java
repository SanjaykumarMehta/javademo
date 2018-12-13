/*package com.hexaware.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.hexaware.utils.ApplicationConstants;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.hexaware.repositories"},entityManagerFactoryRef ="entityManagerFactory")
public class DataBaseConfig {
	

	@Value("${datasource.url}") 
    String url;
	
	@Value("${datasource.driver-class-name}") 
    String driverClassName;   
    
    @Value("${datasource.username}") 
    String username;
    
    @Value("${datasource.password}") 
    String password;
    
    @Value("${datasource.schema}") 
    String schemaName;
    
    @Bean(name = "dataSource")
    public DriverManagerDataSource  getDataSource() {
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
    	dataSource.setUrl(url);
    	DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username, password);
    	dataSource.setDriverClassName(driverClassName);    	
        return dataSource;
    }
    
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    	LocalContainerEntityManagerFactoryBean managerFactoryBean = new LocalContainerEntityManagerFactoryBean();
    	managerFactoryBean.setPersistenceUnitName("persistenceData");
    	managerFactoryBean.setDataSource(getDataSource());
    	managerFactoryBean.setJpaVendorAdapter(vendorAdapter());
    	managerFactoryBean.setJpaProperties(jpaProperties());
    	
        return managerFactoryBean;
    } 
    
    @Bean(name = "vendorAdapter")
    public JpaVendorAdapter  vendorAdapter() {
    	HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
    	adapter.setShowSql(true);    	
    	adapter.setDatabasePlatform("databasePlatform");
		return adapter;
    	
    }
    
    @Bean(name = "jpaProperties")
    public Properties  jpaProperties() {
    	Properties  jpaProperties = new Properties();
    	//jpaProperties.setProperty(ApplicationConstants.HIBERNATE_DEFAULT_SCHEMA, schemaName);
    	jpaProperties.setProperty(ApplicationConstants.HIBERNATE_FORMAT_SQL,ApplicationConstants.TRUE);
    	jpaProperties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
    	//jpaProperties.setProperty("hibernate.dialect", ApplicationConstants.DIALECT);
		return jpaProperties;
    	
    }
    

}
*/