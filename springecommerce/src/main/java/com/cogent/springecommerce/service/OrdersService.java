package com.cogent.springecommerce.service;

import java.util.Optional;

import com.cogent.springecommerce.dto.Orders;

public interface OrdersService {
	public String addOrders(Orders orders);
	public String deleteOrdersById(String Id);
	public void deleteAll();
	public Optional<Orders> getOrdersById(String Id);
	public String updateOrders(String Id, Orders orders);
}
