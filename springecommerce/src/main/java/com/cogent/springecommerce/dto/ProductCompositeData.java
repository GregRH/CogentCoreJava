package com.cogent.springecommerce.dto;

import java.io.Serializable;

import java.io.*;
import javax.persistence.*;
@Embeddable
public class ProductCompositeData implements Serializable{
	private int barcode;
	private int productcode;
	public int getBarcode() {
		return barcode;
	}
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	public int getProductcode() {
		return productcode;
	}
	public void setProductcode(int productcode) {
		this.productcode = productcode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + barcode;
		result = prime * result + productcode;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductCompositeData other = (ProductCompositeData) obj;
		if (barcode != other.barcode)
			return false;
		if (productcode != other.productcode)
			return false;
		return true;
	}
	
	
}
