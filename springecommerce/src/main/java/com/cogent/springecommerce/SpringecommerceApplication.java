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
		UserService us = applicationContext.getBean(UserService.class);
		//us.addUser(new User("u01", "Brad", "*89*", "1s3f@ecommerce.net", "admin"));
//		Role r1 = new Role();
//		r1.setRoleName("Admin");
//		r1.setRoleID("01");
//		us.addUser(new User(new UserCompositeKey("AAAA","AAA@mail.net"),"A","AA","user",r1));
		
		//us.deleteAll();
		Cart cart = new Cart();
		Orders o1 = new Orders("o1","U1","inv1","p1",10,20.0,200.0,200.0,null);
		Orders o2 = new Orders("o2","U1","inv1","p1",100,20.0,2000.0,2000.0,null);
		List<Orders> orderList = new ArrayList<Orders>();
		orderList.add(o1);
		orderList.add(o2);
		cart.setCartID("c1");
		cart.setInvID("inv1");
		cart.setOrders(orderList);
		cart.setUserID("U1");
		cart.setProductID("p1");
		cart.setProductPrice(200);
		cart.setTotalPrice(2000);
		CartService cs = applicationContext.getBean(CartService.class);
		cs.addCart(cart);
	}
}
