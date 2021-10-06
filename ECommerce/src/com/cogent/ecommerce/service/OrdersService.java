package com.cogent.ecommerce.service;

import com.cogent.ecommerce.dto.Orders;

public interface OrdersService {
	public boolean addOrders(Orders orders);
	public boolean deleteOrdersById(String Id);
	public void deleteAll();
	public Orders getOrdersById(String Id);
	public boolean updateOrders(String Id, Orders orders);
}
