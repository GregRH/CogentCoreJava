package com.cogent.ecommerce.repository;

public class OrdersRepositoryImpl implements OrdersRepository {
	private static OrdersRepository ordersRepository;
	private OrdersRepositoryImpl() {}
	public static OrdersRepository getInstance() {
		if(ordersRepository==null)
			ordersRepository=new OrdersRepositoryImpl();
		return ordersRepository;
	}
}
