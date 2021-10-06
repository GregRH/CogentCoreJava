package com.cogent.ecommerce.repository;

import com.cogent.ecommerce.dto.Catalog;

public interface CatalogRepository {
	public boolean addCatalog(Catalog catalog);
	public boolean deleteCatalogById(String Id);
	public void deleteAll();
	public Catalog getCatalogById(String Id);
	public boolean updateCatalog(String Id, Catalog catalog);
}
