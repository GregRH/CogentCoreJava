package com.cogent.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Catalog {
	private String Product_ID;
	private String Product_Name;
	private String Cat_ID;
	private String Product_Description;
	private String Product_Image;
}
