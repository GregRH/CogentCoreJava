package com.cogent.ecommerceJDBC.service;

import java.util.Optional;

import com.cogent.ecommerceJDBC.dto.Orders;

public interface OrdersService {
	public String addOrders(Orders orders);
	public String deleteOrdersById(String Id);
	public void deleteAll();
	public Optional<Orders> getOrdersById(String Id);
	public String updateOrders(String Id, Orders orders);
}
