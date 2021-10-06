package com.cogent.ecommerce.service;

import com.cogent.ecommerce.dto.Catalog;

public interface CatalogService {
	public boolean addCatalog(Catalog catalog);
	public boolean deleteCatalogById(String Id);
	public void deleteAll();
	public Catalog getCatalogById(String Id);
	public boolean updateCatalog(String Id, Catalog catalog);
}
