package com.cogent.ecommerce.service;

import com.cogent.ecommerce.dto.Inventory;
import com.cogent.ecommerce.repository.InventoryRepository;
import com.cogent.ecommerce.repository.InventoryRepositoryImpl;

public class InventoryServiceImpl implements InventoryService {
	private InventoryRepository repository = InventoryRepositoryImpl.getInstance();
	private static InventoryService inventoryService;
	private InventoryServiceImpl() {}
	public static InventoryService getInstance() {
		if(inventoryService==null) {
			synchronized (InventoryServiceImpl.class) {
				if(inventoryService==null) {
					inventoryService=new InventoryServiceImpl();
					return inventoryService;
				}
			}
		}
		
		return inventoryService;
	}
	@Override
	public boolean addInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		return repository.addInventory(inventory);
	}
	@Override
	public boolean deleteInventoryById(String Id) {
		// TODO Auto-generated method stub
		return repository.deleteInventoryById(Id);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}
	@Override
	public Inventory getInventoryById(String Id) {
		// TODO Auto-generated method stub
		return repository.getInventoryById(Id);
	}
	@Override
	public boolean updateInventory(String Id, Inventory inventory) {
		// TODO Auto-generated method stub
		return repository.updateInventory(Id, inventory);
	}
}
