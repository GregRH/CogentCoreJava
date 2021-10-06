package com.cogent.ecommerce.service;

import com.cogent.ecommerce.dto.Cart;
import com.cogent.ecommerce.repository.CartRepository;
import com.cogent.ecommerce.repository.CartRepositoryImpl;

public class CartServiceImpl implements CartService {
	private CartRepository repository = CartRepositoryImpl.getInstance();
	private static CartService cartService;
	private CartServiceImpl() {}
	public static CartService getInstance() {
		if(cartService==null)
			cartService=new CartServiceImpl();
		return cartService;
	}
	@Override
	public boolean addCart(Cart cart) {
		// TODO Auto-generated method stub
		return repository.addCart(cart);
	}
	@Override
	public boolean deleteCartById(String Id) {
		// TODO Auto-generated method stub
		return repository.deleteCartById(Id);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}
	@Override
	public Cart getCartById(String Id) {
		// TODO Auto-generated method stub
		return repository.getCartById(Id);
	}
	@Override
	public boolean updateCart(String Id, Cart cart) {
		// TODO Auto-generated method stub
		return repository.updateCart(Id, cart);
	}
}
