package com.cogent.springecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springecommerce.dto.Catalog;
import com.cogent.springecommerce.repository.CatalogRepository;
@Service
public class CatalogServiceImpl implements CatalogService {
	@Autowired
	private CatalogRepository repository;// = CatalogRepositoryImpl.getInstance();

	@Override
	public String addCatalog(Catalog catalog) {
		Catalog added = repository.save(catalog);
		if(added!=null)
			return "success";
		else
			return "fail";
	}

	@Override
	public String deleteCatalogById(String Id) {
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
	public Optional<Catalog> getCatalogById(String Id) {
		Catalog cat = repository.getById(Id);
		return Optional.ofNullable(cat);
	}

	@Override
	public String updateCatalog(String Id, Catalog catalog) {
		if(repository.existsById(Id)) {
			repository.save(catalog);
			return "Success";
		}
		return "ID not found";
	}

	@Override
	public Optional<List<Catalog>> getAllCatalog() {
		return Optional.ofNullable(repository.findAll());
	}

}
