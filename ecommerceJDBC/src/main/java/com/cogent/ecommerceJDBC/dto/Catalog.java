package com.cogent.ecommerceJDBC.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Catalog {
	private String productID;
	private String productName;
	private String catID;
	private String productDescription;
	private String productImage;
}
