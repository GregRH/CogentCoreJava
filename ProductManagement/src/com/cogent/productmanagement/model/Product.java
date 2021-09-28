package com.cogent.productmanagement.model;

import java.util.Date;

import com.cogent.productmanagement.exception.InvalidProductNameException;
import com.cogent.productmanagement.exception.InvalidProductPriceException;

//import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class Product {
	private String productId;
	private String productName;
	private float price;
	private long qty;
	private Date createdDate; 
	private Date expiryDate;
	private String batchNo;
	
	public void setPrice(float price) throws InvalidProductPriceException {
		if(price>0)
			this.price=price;
		else
			throw new InvalidProductPriceException("Price must be greater than 0");
	}
	public void setProductName(String name) throws InvalidProductNameException {
		if(name!=null&&name!="")
			this.productName=name;
		else
			throw new InvalidProductNameException("Product name must be non null and not empty");
	}
	public Product(String productId, String productName, float price, long qty, Date createdDate, Date expiryDate,
			String batchNo) throws InvalidProductPriceException, InvalidProductNameException {
		super();
		this.productId = productId;
		this.setProductName(productName);
		this.setPrice(price);
		this.qty = qty;
		this.createdDate = createdDate;
		this.expiryDate = expiryDate;
		this.batchNo = batchNo;
		
	}
	
}
