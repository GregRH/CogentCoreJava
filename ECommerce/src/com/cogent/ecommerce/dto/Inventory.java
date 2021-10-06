package com.cogent.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
	private String invID;
	private String userID;
	private String productID;;
	private int productQty;
	private double productPrice;
}
