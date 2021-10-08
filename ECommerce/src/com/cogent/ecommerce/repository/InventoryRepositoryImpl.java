package com.cogent.ecommerce.repository;

import com.cogent.ecommerce.dto.Inventory;

public class InventoryRepositoryImpl implements InventoryRepository {
	private static InventoryRepository inventoryRepository;
	private InventoryRepositoryImpl() {}
	public static InventoryRepository getInstance() {
		if(inventoryRepository==null) {
			synchronized (InventoryRepositoryImpl.class) {
				if(inventoryRepository==null) {
					inventoryRepository=new InventoryRepositoryImpl();
					return inventoryRepository;
				}
			}
		}
		
		return inventoryRepository;
	}
	@Override
	public boolean addInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteInventoryById(String Id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Inventory getInventoryById(String Id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean updateInventory(String Id, Inventory inventory) {
		// TODO Auto-generated method stub
		return false;
	}
}
