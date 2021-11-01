package com.cogent.springecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.springecommerce.dto.Catalog;
@Repository
public interface CatalogRepository extends JpaRepository<Catalog, String> {
//	public String addCatalog(Catalog catalog);
//	public String deleteCatalogById(String Id);
//	public void deleteAll();
//	public Optional<Catalog> getCatalogById(String Id);
//	public String updateCatalog(String Id, Catalog catalog);
}
