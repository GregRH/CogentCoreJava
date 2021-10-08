package com.cogent.ecommerce.repository;

import com.cogent.ecommerce.dto.Catalog;

public class CatalogRepositoryImpl implements CatalogRepository {
	private static CatalogRepository catalogRepository;
	private CatalogRepositoryImpl() {}
	public static CatalogRepository getInstance() {
		if(catalogRepository==null) {
			synchronized (CatalogRepositoryImpl.class) {
				if(catalogRepository==null) {
					catalogRepository=new CatalogRepositoryImpl();
					return catalogRepository;
				}
			}
		}
		return catalogRepository;
	}
	@Override
	public boolean addCatalog(Catalog catalog) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteCatalogById(String Id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Catalog getCatalogById(String Id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean updateCatalog(String Id, Catalog catalog) {
		// TODO Auto-generated method stub
		return false;
	}
}
