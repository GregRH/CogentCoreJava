package com.cogent.productmanagement.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	private String productId;
	private String productName;
	private float price;
	private long qty;
	private Date createdDate; 
	private Date expiryDate;
	private String batchNo;
	
}
