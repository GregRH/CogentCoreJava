package com.cogent.ecommerceJDBC.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DBConfig.class)
public class Config {

}

