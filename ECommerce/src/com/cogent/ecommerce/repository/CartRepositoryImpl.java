package com.cogent.ecommerce.repository;

import com.cogent.ecommerce.dto.Cart;

public class CartRepositoryImpl implements CartRepository {
	
	private static CartRepository cartRepository;
	private CartRepositoryImpl() {}
	public static CartRepository getInstance() {
		if(cartRepository==null)
			cartRepository=new CartRepositoryImpl();
		return cartRepository;
	}
	@Override
	public boolean addCart(Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteCartById(String Id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Cart getCartById(String Id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean updateCart(String Id, Cart cart) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
