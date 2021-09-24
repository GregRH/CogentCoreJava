package com.cogent.productmanagement.service;

import com.cogent.productmanagement.model.Product;

public interface ProductService {
	public String addProduct(Product product);
	public String updateProduct(String productId, Product product);
	public Product getProductById(String id);
	public Product[] getProducts();
	public String deleteProductsById(String id);
	public void deleteAllProducts();
}
