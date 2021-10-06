package com.cogent.ecommerce.repository;


public class CartRepositoryImpl implements CartRepository {
	
	private static CartRepository cartRepository;
	private CartRepositoryImpl() {}
	public static CartRepository getInstance() {
		if(cartRepository==null)
			cartRepository=new CartRepositoryImpl();
		return cartRepository;
	}
	
}
