package com.cogent.springecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springecommerce.dto.Orders;
import com.cogent.springecommerce.exception.InvalidIdException;
import com.cogent.springecommerce.repository.OrdersRepository;

@Service
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	private OrdersRepository repository;// = OrdersRepositoryImpl.getInstance();

	@Override
	public String addOrders(Orders orders) {
		Orders added = repository.save(orders);
		if(added!=null)
			return "success";
		else
			return "fail";
	}

	@Override
	public String deleteOrdersById(String Id) {
		if(repository.existsById(Id)) {
			repository.deleteById(Id);
			return "Success";
		}
		return "Id not found";
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
		
	}

	@Override
	public Optional<Orders> getOrdersById(String Id) {
		
		return repository.findById(Id);
		
	}

	@Override
	public String updateOrders(String Id, Orders orders) {
		if(repository.existsById(Id)) {
			repository.save(orders);
			return "Success";
		}
		return "ID not found";
	}

	@Override
	public Optional<List<Orders>> getAllOrders() {
		return Optional.ofNullable(repository.findAll());
	}
	
}
