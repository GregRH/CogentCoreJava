package com.cogent.springecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springecommerce.dto.Cart;
import com.cogent.springecommerce.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartRepository repository;// = CartRepositoryImpl.getInstance();
//	private static CartService cartService;
//	private CartServiceImpl() {}
//	public static CartService getInstance() {
//		if(cartService==null) {
//			synchronized (CartServiceImpl.class) {
//				if(cartService==null) {
//					cartService=new CartServiceImpl();
//					return cartService;
//				}
//			}
//		}
//		
//		return cartService;
//	}
	@Override
	public String addCart(Cart cart) {
		// TODO Auto-generated method stub
		return repository.addCart(cart);
	}
	@Override
	public String deleteCartById(String Id) {
		// TODO Auto-generated method stub
		return repository.deleteCartById(Id);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}
	@Override
	public Optional<Cart> getCartById(String Id) {
		// TODO Auto-generated method stub
		return repository.getCartById(Id);
	}
	@Override
	public String updateCart(String Id, Cart cart) {
		// TODO Auto-generated method stub
		return repository.updateCart(Id, cart);
	}
}
