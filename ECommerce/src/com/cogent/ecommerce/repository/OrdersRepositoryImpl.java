package com.cogent.ecommerce.repository;

import com.cogent.ecommerce.dto.Orders;

public class OrdersRepositoryImpl implements OrdersRepository {
	private static OrdersRepository ordersRepository;
	private OrdersRepositoryImpl() {}
	public static OrdersRepository getInstance() {
		if(ordersRepository==null) {
			synchronized (OrdersRepositoryImpl.class) {
				if(ordersRepository==null) {
					ordersRepository=new OrdersRepositoryImpl();
					return ordersRepository;
				}
			}
		}
		
		return ordersRepository;
	}
	@Override
	public boolean addOrders(Orders orders) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteOrdersById(String Id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Orders getOrdersById(String Id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean updateOrders(String Id, Orders orders) {
		// TODO Auto-generated method stub
		return false;
	}
}
