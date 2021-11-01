package com.cogent.springecommerce.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data//@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="orders")
public class Orders {
	@Id
	private String orderID;
	private String userID;
	private String invID;
	private String productID;;
	private int productQty;
	private double productPrice;
	private double totalPrice;
	private double grandTotalPrice;
	@ManyToOne
	private Cart cart;
}
