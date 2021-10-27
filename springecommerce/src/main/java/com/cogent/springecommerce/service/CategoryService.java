package com.cogent.springecommerce.service;

import java.util.Optional;

import com.cogent.springecommerce.dto.Category;

public interface CategoryService {
	public String addCategory(Category category);
	public String deleteCategoryById(String Id);
	public void deleteAll();
	public Optional<Category> getCategoryById(String Id);
	public String updateCategory(String Id, Category category);
}
