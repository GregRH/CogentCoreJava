package com.cogent.productmanagement.repository;

import java.util.ArrayList;

import com.cogent.productmanagement.exception.InvalidProductIdException;
import com.cogent.productmanagement.model.Product;

public class ProductRepositoryALImpl implements ProductRepository {
	private ArrayList<Product> products = new ArrayList<>();
	private static ProductRepository projectRepository;
	private ProductRepositoryALImpl() {
	}
	public static ProductRepository getInstance() {
		if(projectRepository==null)
			projectRepository=new ProductRepositoryALImpl();
		return projectRepository;
			
	}
	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		boolean status = products.add(product);
		if(status)
			return "success";
		else
				return "fail";
	}

	@Override
	public String updateProduct(String productId, Product product) throws InvalidProductIdException {
		// TODO not correct
		boolean success = true;
		products.set(products.indexOf(this.getProductById(productId)),product);

		if(success)
			return "success";
		else
			return "failure";
	}

	@Override
	public Product getProductById(String id) throws InvalidProductIdException {
		// TODO Auto-generated method stub
		for (Product product : products) {
			if(id.equals(product.getProductId()))
				return product;
		}
		throw new InvalidProductIdException("Invalid product id");
	}

	@Override
	public Product[] getProducts(){
		// TODO Auto-generated method stub
		if(products != null) {
		Product p[] = new Product[products.size()];
		p= products.toArray(p);
		System.out.println(p[0]);
		return  p;
		}
		else
			return null;
	}

	@Override
	public String deleteProductsById(String id) throws InvalidProductIdException {
		// TODO Auto-generated method stub
		boolean success = products.remove(this.getProductById(id));
		if(success)
			return "success";
		else
			return "failure";
	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub
		products = null;

	}

}
