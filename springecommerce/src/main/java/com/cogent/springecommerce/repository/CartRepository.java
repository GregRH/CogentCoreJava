package com.cogent.springecommerce.repository;

import java.util.Optional;

import com.cogent.springecommerce.dto.Cart;

public interface CartRepository {
	public String addCart(Cart cart);
	public String deleteCartById(String Id);
	public void deleteAll();
	public Optional<Cart> getCartById(String Id);
	public String updateCart(String Id, Cart cart);

}
