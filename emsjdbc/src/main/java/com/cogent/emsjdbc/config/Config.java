package com.cogent.emsjdbc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

import com.cogent.emsjdbc.utils.BeanOne;
import com.cogent.emsjdbc.utils.BeanTwo;

@Configuration
@ComponentScan("com.cogent.emsjdbc")
@Import(DBConfig.class)
public class Config {
	@Autowired
	BeanTwo beanTwo;

	@Bean("beanOne")
	// @Lazy(value = true)
	public BeanOne getBeanOne() {
		return new BeanOne(beanTwo);
	}

	@Bean("beanTwo")
	public BeanTwo getBeanTwo() {
		return new BeanTwo();
	}
}
