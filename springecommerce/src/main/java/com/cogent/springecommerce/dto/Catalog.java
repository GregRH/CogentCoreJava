package com.cogent.springecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Catalog {
	private String productID;
	private String productName;
	private String catID;
	private String productDescription;
	private String productImage;
}