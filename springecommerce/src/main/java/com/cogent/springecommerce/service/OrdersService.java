package com.cogent.springecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cogent.springecommerce.dto.Orders;
//@Service
public interface OrdersService {
	public String addOrders(Orders orders);
	public String deleteOrdersById(String Id);
	public void deleteAll();
	public Optional<Orders> getOrdersById(String Id);
	public String updateOrders(String Id, Orders orders);
	public Optional<List<Orders>> getAllOrders();
}
