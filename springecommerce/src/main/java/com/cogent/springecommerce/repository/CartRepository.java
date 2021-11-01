package com.cogent.springecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.springecommerce.dto.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart, String> {
//	public String addCart(Cart cart);
//	public String deleteCartById(String Id);
//	public void deleteAll();
//	public Optional<Cart> getCartById(String Id);
//	public String updateCart(String Id, Cart cart);

}
