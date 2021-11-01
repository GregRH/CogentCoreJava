package com.cogent.springecommerce.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springecommerce.dto.Category;
import com.cogent.springecommerce.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository repository;// = CategoryRepositoryImpl.getInstance();

	@Override
	public String addCategory(Category category) {
		Category added = repository.save(category);
		if(added!=null)
			return "success";
		else
			return "fail";
	}

	@Override
	public String deleteCategoryById(String Id) {
		if(repository.existsById(Id)) {
			repository.deleteById(Id);
			return "Success";
		}
		return "Id not found";
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
		
	}

	@Override
	public Optional<Category> getCategoryById(String Id) {
		Category data = repository.getById(Id);
		return Optional.ofNullable(data);
	}

	@Override
	public String updateCategory(String Id, Category category) {
		if(repository.existsById(Id)) {
			repository.save(category);
			return "Success";
		}
		return "ID not found";
	}

	@Override
	public Optional<List<Category>> getAllCategory() {
		return Optional.ofNullable(repository.findAll());
	}

}
