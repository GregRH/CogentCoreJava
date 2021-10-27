package com.cogent.springecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
	private String cartID;
	private String userID;
	private String invID;
	private String productID;;
	private int productQty;
	private double productPrice;
	private double totalPrice;
	
}
