package com.cogent.ecommerce.service;

import com.cogent.ecommerce.dto.Catalog;
import com.cogent.ecommerce.repository.CatalogRepository;
import com.cogent.ecommerce.repository.CatalogRepositoryImpl;

public class CatalogServiceImpl implements CatalogService {
	private CatalogRepository repository = CatalogRepositoryImpl.getInstance();
	private static CatalogService catalogService;
	private CatalogServiceImpl() {}
	public static CatalogService getInstance() {
		if(catalogService==null) {
			synchronized (CatalogServiceImpl.class) {
				if(catalogService==null) {
					catalogService=new CatalogServiceImpl();
					return catalogService;
				}
			}
		}
		
		return catalogService;
	}
	@Override
	public boolean addCatalog(Catalog catalog) {
		// TODO Auto-generated method stub
		return repository.addCatalog(catalog);
	}
	@Override
	public boolean deleteCatalogById(String Id) {
		// TODO Auto-generated method stub
		return repository.deleteCatalogById(Id);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}
	@Override
	public Catalog getCatalogById(String Id) {
		// TODO Auto-generated method stub
		return repository.getCatalogById(Id);
	}
	@Override
	public boolean updateCatalog(String Id, Catalog catalog) {
		// TODO Auto-generated method stub
		return repository.updateCatalog(Id, catalog);
	}
}
