package com.cogent.ecommerce.repository;

public class InventoryRepositoryImpl implements InventoryRepository {
	private static InventoryRepository inventoryRepository;
	private InventoryRepositoryImpl() {}
	public static InventoryRepository getInstance() {
		if(inventoryRepository==null)
			inventoryRepository=new InventoryRepositoryImpl();
		return inventoryRepository;
	}
}
