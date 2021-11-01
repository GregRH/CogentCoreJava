package com.cogent.springecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springecommerce.dto.Cart;
import com.cogent.springecommerce.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartRepository repository;

	@Override
	public String addCart(Cart cart) {
		Cart added = repository.save(cart);
		if(added!=null)
			return "success";
		else
			return "fail";
	}

	@Override
	public String deleteCartById(String Id) {
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
	public Optional<Cart> getCartById(String Id) {
		Cart data = repository.getById(Id);
		return Optional.ofNullable(data);
	}

	@Override
	public String updateCart(String Id, Cart cart) {
		if(repository.existsById(Id)) {
			repository.save(cart);
			return "Success";
		}
		return "ID not found";
	}

	@Override
	public Optional<List<Cart>> getAllCart() {
		return Optional.ofNullable(repository.findAll());
	}

}
