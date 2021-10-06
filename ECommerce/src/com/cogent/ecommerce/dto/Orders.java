package com.cogent.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
	private String orderID;
	private String userID;
	private String invID;
	private String productID;;
	private int productQty;
	private double productPrice;
	private double totalPrice;
	private double grandTotalPrice;
}
