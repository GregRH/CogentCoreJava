package com.cogent.ecommerce.service;

import com.cogent.ecommerce.repository.InventoryRepository;
import com.cogent.ecommerce.repository.InventoryRepositoryImpl;

public class InventoryServiceImpl implements InventoryService {
	private InventoryRepository repository = InventoryRepositoryImpl.getInstance();
	private static InventoryService inventoryService;
	private InventoryServiceImpl() {}
	public static InventoryService getInstance() {
		if(inventoryService==null)
			inventoryService=new InventoryServiceImpl();
		return inventoryService;
	}
}
