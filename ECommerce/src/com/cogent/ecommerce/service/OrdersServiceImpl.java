package com.cogent.ecommerce.service;

import com.cogent.ecommerce.repository.OrdersRepository;
import com.cogent.ecommerce.repository.OrdersRepositoryImpl;

public class OrdersServiceImpl implements OrdersService {
	private OrdersRepository repository = OrdersRepositoryImpl.getInstance();
	private static OrdersService orderService;
	private OrdersServiceImpl() {}
	public static OrdersService getInstance() {
		if(orderService==null)
			orderService=new  OrdersServiceImpl();
		return orderService;
	}
}
