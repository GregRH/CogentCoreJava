package com.cogent.ecommerce.service;

import com.cogent.ecommerce.dto.Orders;
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
	@Override
	public boolean addOrders(Orders orders) {
		// TODO Auto-generated method stub
		return repository.addOrders(orders);
	}
	@Override
	public boolean deleteOrdersById(String Id) {
		// TODO Auto-generated method stub
		return repository.deleteOrdersById(Id);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}
	@Override
	public Orders getOrdersById(String Id) {
		// TODO Auto-generated method stub
		return repository.getOrdersById(Id);
	}
	@Override
	public boolean updateOrders(String Id, Orders orders) {
		// TODO Auto-generated method stub
		return repository.addOrders(orders);
	}
}
