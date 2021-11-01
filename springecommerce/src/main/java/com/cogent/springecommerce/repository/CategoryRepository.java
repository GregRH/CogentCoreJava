package com.cogent.springecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.springecommerce.dto.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
//	public String addCategory(Category category);
//	public String deleteCategoryById(String Id);
//	public void deleteAll();
//	public Optional<Category> getCategoryById(String Id);
//	public String updateCategory(String Id, Category category);
}
