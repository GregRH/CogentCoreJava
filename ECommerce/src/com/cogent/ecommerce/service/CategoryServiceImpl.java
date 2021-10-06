package com.cogent.ecommerce.service;


import com.cogent.ecommerce.repository.CategoryRepository;
import com.cogent.ecommerce.repository.CategoryRepositoryImpl;

public class CategoryServiceImpl implements CategoryService {
	private CategoryRepository repository = CategoryRepositoryImpl.getInstance();
	private static CategoryService categoryService;
	private CategoryServiceImpl() {}
	public static CategoryService getInstance() {
		if(categoryService==null)
			categoryService=new CategoryServiceImpl();
		return categoryService;
	}
}
