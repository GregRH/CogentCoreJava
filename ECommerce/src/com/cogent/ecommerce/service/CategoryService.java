package com.cogent.ecommerce.service;

import com.cogent.ecommerce.dto.Category;

public interface CategoryService {
	public boolean addCategory(Category category);
	public boolean deleteCategoryById(String Id);
	public void deleteAll();
	public Category getCategoryById(String Id);
	public boolean updateCategory(String Id, Category category);
}
