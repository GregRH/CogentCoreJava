package com.cogent.ecommerceJDBC.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerceJDBC.dto.Orders;
import com.cogent.ecommerceJDBC.repository.OrdersRepository;

@Service
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	private OrdersRepository repository;// = OrdersRepositoryImpl.getInstance();
//	private static OrdersService orderService;
//	private OrdersServiceImpl() {}
//	public static OrdersService getInstance() {
//		if(orderService==null) {
//			synchronized (OrdersServiceImpl.class) {
//				if(orderService==null) {
//					orderService=new  OrdersServiceImpl();
//					return orderService;
//				}
//			}
//		}
//		
//		return orderService;
//	}
	@Override
	public String addOrders(Orders orders) {
		// TODO Auto-generated method stub
		return repository.addOrders(orders);
	}
	@Override
	public String deleteOrdersById(String Id) {
		// TODO Auto-generated method stub
		return repository.deleteOrdersById(Id);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}
	@Override
	public Optional<Orders> getOrdersById(String Id) {
		// TODO Auto-generated method stub
		return repository.getOrdersById(Id);
	}
	@Override
	public String updateOrders(String Id, Orders orders) {
		// TODO Auto-generated method stub
		return repository.addOrders(orders);
	}
}
