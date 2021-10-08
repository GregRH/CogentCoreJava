package com.cogent.ecommerce.service;


import com.cogent.ecommerce.dto.Category;
import com.cogent.ecommerce.repository.CategoryRepository;
import com.cogent.ecommerce.repository.CategoryRepositoryImpl;

public class CategoryServiceImpl implements CategoryService {
	private CategoryRepository repository = CategoryRepositoryImpl.getInstance();
	private static CategoryService categoryService;
	private CategoryServiceImpl() {}
	public static CategoryService getInstance() {
		if(categoryService==null) {
			synchronized (CategoryServiceImpl.class) {
				if(categoryService==null) {
					categoryService=new CategoryServiceImpl();
					return categoryService;
				}
			}
		}
		
		return categoryService;
	}
	@Override
	public boolean addCategory(Category category) {
		// TODO Auto-generated method stub
		return repository.addCategory(category);
	}
	@Override
	public boolean deleteCategoryById(String Id) {
		// TODO Auto-generated method stub
		return repository.deleteCategoryById(Id);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}
	@Override
	public Category getCategoryById(String Id) {
		// TODO Auto-generated method stub
		return repository.getCategoryById(Id);
	}
	@Override
	public boolean updateCategory(String Id, Category category) {
		// TODO Auto-generated method stub
		return repository.updateCategory(Id, category);
	}
}
