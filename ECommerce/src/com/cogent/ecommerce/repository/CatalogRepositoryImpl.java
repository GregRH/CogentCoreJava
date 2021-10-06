package com.cogent.ecommerce.repository;

public class CatalogRepositoryImpl implements CatalogRepository {
	private static CatalogRepository catalogRepository;
	private CatalogRepositoryImpl() {}
	public static CatalogRepository getInstance() {
		if(catalogRepository==null)
			catalogRepository=new CatalogRepositoryImpl();
		return catalogRepository;
	}
}
