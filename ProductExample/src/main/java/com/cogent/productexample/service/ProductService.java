package com.cogent.productexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.productexample.dto.Product;
import com.cogent.productexample.exception.ResourceNotFoundException;
import com.cogent.productexample.repository.ProductRepository;
@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	public void insertProduct(Product product) {
		productRepository.save(product);
	}
	public void deleteData(int product_id) {
		productRepository.deleteById(product_id);
	}
	public void updateData(int product_id, Product product) {
		Optional<Product> prod = productRepository.findById(product_id);
		if(prod.isPresent()) {
			Product p1 = prod.get();
			p1.setProductName(product.getProductName());
			p1.setQuantity(product.getQuantity());
			p1.setPrice(product.getPrice());
			productRepository.save(product);
		}
	}
	public List<Product> findAllProducts(){
		return  productRepository.findAll();
	}
	public Product findById(int id) throws ResourceNotFoundException {
		return productRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Product Not Found"));
	}
}
