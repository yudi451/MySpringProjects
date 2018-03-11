package com.uday.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.ejb.HibernatePersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.uday.repository")
@PropertySource("classpath:database.properties")
public class DataConfig {
	
	private final String PROPERTY_DRIVER = "driver";
	private final String PROPERTY_URL = "url";
	private final String PROPERTY_USERNAME = "username";
	private final String PROPERTY_PASSWORD = "password";
	private final String PROPERTY_SHOWSQL = "hibernate.show_sql";
	private final String PROPERTY_DIALECT = "hibernate.dialect";
	
	@Autowired
	private Environment env;
	
	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean lfb = new LocalContainerEntityManagerFactoryBean();
		lfb.setDataSource(dataSource());
		lfb.setPersistenceProviderClass(HibernatePersistence.class);
		lfb.setPackagesToScan("com.uday.model");
		lfb.setJpaProperties(hibernateProps());
		return lfb;
	}
	
	Properties hibernateProps() {
		Properties properties = new Properties();
		properties.setProperty(PROPERTY_DIALECT, env.getProperty(PROPERTY_DIALECT));
		properties.setProperty(PROPERTY_SHOWSQL, env.getProperty(PROPERTY_SHOWSQL));
		return properties;
	}
	
	@Bean
	DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty(PROPERTY_DRIVER));
		ds.setUrl(env.getProperty(PROPERTY_URL));
		ds.setUsername(env.getProperty(PROPERTY_USERNAME));
		ds.setPassword(env.getProperty(PROPERTY_PASSWORD));
		return ds;
	}
	
	@Bean
	JpaTransactionManager jpaTransactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}
	
}
