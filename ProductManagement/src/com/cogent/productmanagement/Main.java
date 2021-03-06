package com.cogent.productmanagement;


import java.util.Date;

import com.cogent.productmanagement.exception.InvalidProductIdException;
import com.cogent.productmanagement.exception.InvalidProductNameException;
import com.cogent.productmanagement.exception.InvalidProductPriceException;
import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.service.ProductService;
import com.cogent.productmanagement.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args) {
		ProductService productService = ProductServiceImpl.getInstance();
		Date created = new Date();
		Date expiry = new Date();
		try {
			productService.addProduct(new Product("01", "Product", 10.0f, 10, created, expiry, "0001"));
			productService.addProduct(new Product("02", "Product", 10.0f, 10, created, expiry, "0001"));
			productService.addProduct(new Product("03", "Product", 10.0f, 10, created, expiry, "0001"));
			productService.addProduct(new Product("04", "Product", 10.0f, 10, created, expiry, "0001"));
			productService.addProduct(new Product("05", "Product", 10.0f, 10, created, expiry, "0001"));
			productService.addProduct(new Product("06", "Product", 10.0f, 10, created, expiry, "0001"));
			productService.addProduct(new Product("07", "Product", 10.0f, 10, created, expiry, "0001"));
			productService.addProduct(new Product("09", "Product", 10.0f, 10, created, expiry, "0001"));
			productService.addProduct(new Product("10", "Product", 10.0f, 10, created, expiry, "0001"));
			productService.addProduct(new Product("11", "Product", 10.0f, 10, created, expiry, "0001"));
			productService.addProduct(new Product("12", "Product", 10.0f, 10, created, expiry, "0001"));
		} catch (InvalidProductPriceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvalidProductNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(productService.getProductById("01"));
		} catch (InvalidProductIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("full array");
		printAllProducts(productService.getProducts());
		try {
			productService.deleteProductsById("05");
		} catch (InvalidProductIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			productService.updateProduct("10", new Product("13", "Product", 10.0f, 10, created, expiry, "0001"));
		} catch (InvalidProductIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidProductPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidProductNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("delete id 05 and update id 10 to 13");
		printAllProducts(productService.getProducts());
		try {
			productService.addProduct(new Product("05", "Product", 10.0f, 10, created, expiry, "0001"));
		} catch (InvalidProductPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidProductNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("add 5 back");
		printAllProducts(productService.getProducts());
		productService.deleteAllProducts();
		System.out.println("will not print");
		printAllProducts(productService.getProducts());

	}

	public static void printAllProducts(Product products[]) {
		if (products != null)
			for (Product product : products) {
				System.out.println(product);
			}
	}

}
