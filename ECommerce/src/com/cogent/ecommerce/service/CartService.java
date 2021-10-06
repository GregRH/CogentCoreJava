package com.cogent.ecommerce.service;

import com.cogent.ecommerce.dto.Cart;

public interface CartService {
	public boolean addCart(Cart cart);
	public boolean deleteCartById(String Id);
	public void deleteAll();
	public Cart getCartById(String Id);
	public boolean updateCart(String Id, Cart cart);
}
