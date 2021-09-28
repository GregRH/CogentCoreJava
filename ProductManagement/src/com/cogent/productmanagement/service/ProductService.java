package com.cogent.productmanagement.service;

import com.cogent.productmanagement.exception.InvalidProductIdException;
import com.cogent.productmanagement.model.Product;

public interface ProductService {
	public String addProduct(Product product);
	public String updateProduct(String productId, Product product) throws InvalidProductIdException;
	public Product getProductById(String id) throws InvalidProductIdException;
	public Product[] getProducts();
	public String deleteProductsById(String id) throws InvalidProductIdException;
	public void deleteAllProducts();
}
