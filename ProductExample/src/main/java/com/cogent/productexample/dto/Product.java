package com.cogent.productexample.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name="product")
public class Product {
	@Id
	private int productCode;
	private String productName;
	private double price;
	private int quantity;
}
