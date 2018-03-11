package com.udaysingh.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.ejb.HibernatePersistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.uday.dao")
public class DataConfig {
	
	@Bean
	DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/sqlTest?autoReconnect=true");
		ds.setUsername("root");
		ds.setPassword("uday");
		return ds;
	}
	
	@Bean
	LocalContainerEntityManagerFactoryBean entitymanagerFactory() {
		LocalContainerEntityManagerFactoryBean lfb = new LocalContainerEntityManagerFactoryBean();
		lfb.setDataSource(getDataSource());
		lfb.setPersistenceProviderClass(HibernatePersistence.class);
		lfb.setPackagesToScan("com.uday.model");
		lfb.setJpaProperties(hibernateProps());
		return lfb;
	}
	
	@Bean
	HibernateJpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter jpa = new HibernateJpaVendorAdapter();
		jpa.setShowSql(true);
		jpa.setGenerateDdl(true);
		return jpa;
	}

	Properties hibernateProps() {
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "true");
//		props.setProperty("hibernate.hbm2ddl.auto", "validate");
		props.setProperty("hibernate.show_sql", "true");
//		props.setProperty("hibernate.format_sql", "false");
		return props;
	}
	
	@Bean
	JpaTransactionManager jpaTransactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entitymanagerFactory().getObject());
		return transactionManager;
	}
}
