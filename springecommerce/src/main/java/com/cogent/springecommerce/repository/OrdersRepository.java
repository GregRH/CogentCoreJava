package com.cogent.springecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.springecommerce.dto.Orders;
@Repository
public interface OrdersRepository extends JpaRepository<Orders, String> {
//	public String addOrders(Orders orders);
//	public String deleteOrdersById(String Id);
//	public void deleteAll();
//	public Optional<Orders> getOrdersById(String Id);
//	public String updateOrders(String Id, Orders orders);
}
