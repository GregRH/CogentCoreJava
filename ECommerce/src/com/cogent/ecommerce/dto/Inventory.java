package com.cogent.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Inventory {
	private String Inv_ID;
	private String User_ID;
	private String Product_ID;;
	private int Product_qty;
	private double Product__price;
}
