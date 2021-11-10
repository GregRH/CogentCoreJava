package com.cogent.springecommerce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.springecommerce.dto.Cart;
import com.cogent.springecommerce.dto.Orders;
import com.cogent.springecommerce.service.CartService;
import com.cogent.springecommerce.service.UserService;

@SpringBootApplication
public class SpringecommerceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(SpringecommerceApplication.class, args);
	
	}
}
