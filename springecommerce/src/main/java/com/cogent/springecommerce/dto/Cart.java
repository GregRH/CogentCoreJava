package com.cogent.springecommerce.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data//@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cart")
public class Cart {
	@Id
	private String cartID;
	private String userID;
	private String invID;
	private String productID;;
	private int productQty;
	private double productPrice;
	private double totalPrice;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Orders>orders;
	
}
