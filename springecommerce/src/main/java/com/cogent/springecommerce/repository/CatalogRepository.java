package com.cogent.springecommerce.repository;

import java.util.Optional;

import com.cogent.springecommerce.dto.Catalog;

public interface CatalogRepository {
	public String addCatalog(Catalog catalog);
	public String deleteCatalogById(String Id);
	public void deleteAll();
	public Optional<Catalog> getCatalogById(String Id);
	public String updateCatalog(String Id, Catalog catalog);
}
