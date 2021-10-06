package com.cogent.ecommerce.service;

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
}
