package com.cogent.ecommerce.repository;

import com.cogent.ecommerce.dto.Category;

public interface CategoryRepository {
	public boolean addCategory(Category category);
	public boolean deleteCategoryById(String Id);
	public void deleteAll();
	public Category getCategoryById(String Id);
	public boolean updateCategory(String Id, Category category);
}
