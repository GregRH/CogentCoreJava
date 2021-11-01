package com.cogent.springecommerce.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="catalog")
public class Catalog {
	@Id
	private String productID;
	private String productName;
	private String catID;
	private String productDescription;
	private String productImage;
}
