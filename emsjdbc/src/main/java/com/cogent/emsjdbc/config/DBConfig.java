package com.cogent.emsjdbc.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class DBConfig {
	@Autowired//Gets environment object from spring
	Environment environment;
	@Bean//creates singleton
	@Scope("prototype")//No singleton
	public DataSource dataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl(environment.getProperty("db.url"));
		basicDataSource.setUsername(environment.getProperty("db.username"));
		basicDataSource.setPassword(environment.getProperty("db.password"));
		basicDataSource.setDriverClassName(environment.getProperty("db.className"));
		return basicDataSource;
	}
}
