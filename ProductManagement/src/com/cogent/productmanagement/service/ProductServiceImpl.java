package com.cogent.productmanagement.service;

import com.cogent.productmanagement.exception.InvalidProductIdException;
import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.repository.ProductRepository;
import com.cogent.productmanagement.repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {
	private ProductRepository productRepository = ProductRepositoryImpl.getInstance();
	private static ProductService productService;
	private ProductServiceImpl() {}
	public static ProductService getInstance() {
		if(productService==null)
			productService=new ProductServiceImpl();
		return productService;
	}
	@Override
	public String addProduct(Product product) {
		return productRepository.addProduct(product);
	}

	@Override
	public String updateProduct(String productId, Product product) throws InvalidProductIdException {
		return productRepository.updateProduct(productId, product);
	}

	@Override
	public Product getProductById(String id) throws InvalidProductIdException {
		return productRepository.getProductById(id);
	}

	@Override
	public Product[] getProducts() {
		return productRepository.getProducts();
	}

	@Override
	public String deleteProductsById(String id) throws InvalidProductIdException {
		return productRepository.deleteProductsById(id);
	}

	@Override
	public void deleteAllProducts() {
		productRepository.deleteAllProducts();

	}

}
