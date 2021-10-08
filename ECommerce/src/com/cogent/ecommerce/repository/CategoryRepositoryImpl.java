package com.cogent.ecommerce.repository;

import com.cogent.ecommerce.dto.Category;

public class CategoryRepositoryImpl implements CategoryRepository {
	public static CategoryRepository categoryRepository;
	private CategoryRepositoryImpl() {}
	public static CategoryRepository getInstance() {
		if(categoryRepository==null) {
			synchronized (CategoryRepositoryImpl.class) {
				if(categoryRepository==null) {
					categoryRepository=new CategoryRepositoryImpl();
					return categoryRepository;
				}
			}
		}
		
		return categoryRepository;
	}
	@Override
	public boolean addCategory(Category category) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteCategoryById(String Id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Category getCategoryById(String Id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean updateCategory(String Id, Category category) {
		// TODO Auto-generated method stub
		return false;
	}
}
