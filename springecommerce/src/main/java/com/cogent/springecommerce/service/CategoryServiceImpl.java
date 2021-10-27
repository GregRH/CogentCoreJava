package com.cogent.springecommerce.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springecommerce.dto.Category;
import com.cogent.springecommerce.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository repository;// = CategoryRepositoryImpl.getInstance();
//	private static CategoryService categoryService;
//	private CategoryServiceImpl() {}
//	public static CategoryService getInstance() {
//		if(categoryService==null) {
//			synchronized (CategoryServiceImpl.class) {
//				if(categoryService==null) {
//					categoryService=new CategoryServiceImpl();
//					return categoryService;
//				}
//			}
//		}
//		
//		return categoryService;
//	}
	@Override
	public String addCategory(Category category) {
		// TODO Auto-generated method stub
		return repository.addCategory(category);
	}
	@Override
	public String deleteCategoryById(String Id) {
		// TODO Auto-generated method stub
		return repository.deleteCategoryById(Id);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}
	@Override
	public Optional<Category> getCategoryById(String Id) {
		// TODO Auto-generated method stub
		return repository.getCategoryById(Id);
	}
	@Override
	public String updateCategory(String Id, Category category) {
		// TODO Auto-generated method stub
		return repository.updateCategory(Id, category);
	}
}
