package com.cogent.ecommerceJDBC.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerceJDBC.dto.Catalog;
import com.cogent.ecommerceJDBC.repository.CatalogRepository;
@Service
public class CatalogServiceImpl implements CatalogService {
	@Autowired
	private CatalogRepository repository;// = CatalogRepositoryImpl.getInstance();
//	private static CatalogService catalogService;
//	private CatalogServiceImpl() {}
//	public static CatalogService getInstance() {
//		if(catalogService==null) {
//			synchronized (CatalogServiceImpl.class) {
//				if(catalogService==null) {
//					catalogService=new CatalogServiceImpl();
//					return catalogService;
//				}
//			}
//		}
//		
//		return catalogService;
//	}
	@Override
	public String addCatalog(Catalog catalog) {
		// TODO Auto-generated method stub
		return repository.addCatalog(catalog);
	}
	@Override
	public String deleteCatalogById(String Id) {
		// TODO Auto-generated method stub
		return repository.deleteCatalogById(Id);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}
	@Override
	public Optional<Catalog> getCatalogById(String Id) {
		// TODO Auto-generated method stub
		return repository.getCatalogById(Id);
	}
	@Override
	public String updateCatalog(String Id, Catalog catalog) {
		// TODO Auto-generated method stub
		return repository.updateCatalog(Id, catalog);
	}
}
