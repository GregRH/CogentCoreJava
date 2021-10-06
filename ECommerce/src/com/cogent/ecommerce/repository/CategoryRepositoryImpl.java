package com.cogent.ecommerce.repository;

public class CategoryRepositoryImpl implements CategoryRepository {
	public static CategoryRepository categoryRepository;
	private CategoryRepositoryImpl() {}
	public static CategoryRepository getInstance() {
		if(categoryRepository==null)
			categoryRepository=new CategoryRepositoryImpl();
		return categoryRepository;
	}
}
