package com.cogent.productmanagement.repository;


import com.cogent.productmanagement.model.Product;

public class ProductRepositoryImpl implements ProductRepository {
	private Product products[]=new Product[10];
	private static ProductRepository projectRepository;
	private int counter=-1;
	private ProductRepositoryImpl() {
	}
	public static ProductRepository getInstance() {
		if(projectRepository==null)
			projectRepository=new ProductRepositoryImpl();
		return projectRepository;
			
	}
	@Override
	public String addProduct(Product product) {
		if(counter<products.length) {
			products[++counter]=product;
			return "success";
		}
		return "Array is full";
	}

	@Override
	public String updateProduct(String productId, Product product) {
		if(this.getIndex(this.getProductById(productId))!=-1) {
			products[this.getIndex(this.getProductById(productId))]=product;
			return "Success";
		}
		return "Not found";
	}
	
	@Override
	public Product getProductById(String id) {
		for (Product product : products) {
			if(product!=null&&id.equals(product.getProductId()))
				return product;
		}
		return null;
	}

	@Override
	public Product[] getProducts() {
		return products;
	}

	@Override
	public String deleteProductsById(String id) {
		Product product = this.getProductById(id);
		if (product!=null) {
			int pos=this.getIndex(product);
			if(pos!=-1) {
				products[pos]=null;
				for(int i=pos;i<counter;i++) {
					products[i]=products[i+1];
				}
				products[counter]=null;
				counter--;
				return "Success";
			}
		}
			return "Not found";
	}

	@Override
	public void deleteAllProducts() {
		counter=-1;
		products=null;
	}
	private int getIndex(Product product) {
		for (int i = 0; i < products.length; i++) {
			if(product.equals(products[i]))
				return i;
		}
		return -1;
	}

}
