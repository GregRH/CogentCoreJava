package com.cogent.springecommerce.service;

import java.util.List;
import java.util.Optional;

import com.cogent.springecommerce.dto.Catalog;

public interface CatalogService {
	public String addCatalog(Catalog catalog);
	public String deleteCatalogById(String Id);
	public void deleteAll();
	public Optional<Catalog> getCatalogById(String Id);
	public String updateCatalog(String Id, Catalog catalog);
	public Optional<List<Catalog>>getAllCatalog();
}
