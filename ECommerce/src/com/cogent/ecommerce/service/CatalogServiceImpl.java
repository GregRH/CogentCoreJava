package com.cogent.ecommerce.service;

import com.cogent.ecommerce.repository.CatalogRepository;
import com.cogent.ecommerce.repository.CatalogRepositoryImpl;

public class CatalogServiceImpl implements CatalogService {
	private CatalogRepository repository = CatalogRepositoryImpl.getInstance();
	private static CatalogService catalogService;
	private CatalogServiceImpl() {}
	public static CatalogService getInstance() {
		if(catalogService==null)
			catalogService=new CatalogServiceImpl();
		return catalogService;
	}
}
