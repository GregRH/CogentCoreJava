package com.cogent.empspringboot;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmpspringbootApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(EmpspringbootApplication.class, args);
		DataSource dataSource = applicationContext.getBean(DataSource.class);
		
		System.out.println(dataSource!=null);
	}

}