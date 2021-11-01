package com.cogent.empspringboot.dto;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
@Entity
@Table(name="Product")
public class Product {
	/*productcode,
	 * barcode,
	 * price
	 * 
	 */
	
	
	private int productprice;
	@Column(name="Price")
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}	
	
	@EmbeddedId//Can be used for Composite key
	//@Id
	//it will specify that primary key 
	//should be treated as object 
	
	private ProductCompositeData prdk;
	public ProductCompositeData getPrdk() {
		return prdk;
	}
	public void setPrdk(ProductCompositeData prdk) {
		this.prdk = prdk;
	}

}

