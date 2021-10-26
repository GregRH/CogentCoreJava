package com.cogent.ecommerceJDBC.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerceJDBC.dto.Inventory;
import com.cogent.ecommerceJDBC.repository.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	private InventoryRepository repository;// = InventoryRepositoryImpl.getInstance();
//	private static InventoryService inventoryService;
//	private InventoryServiceImpl() {}
//	public static InventoryService getInstance() {
//		if(inventoryService==null) {
//			synchronized (InventoryServiceImpl.class) {
//				if(inventoryService==null) {
//					inventoryService=new InventoryServiceImpl();
//					return inventoryService;
//				}
//			}
//		}
//		
//		return inventoryService;
//	}
	@Override
	public String addInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		return repository.addInventory(inventory);
	}
	@Override
	public String deleteInventoryById(String Id) {
		// TODO Auto-generated method stub
		return repository.deleteInventoryById(Id);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}
	@Override
	public Optional<Inventory> getInventoryById(String Id) {
		// TODO Auto-generated method stub
		return repository.getInventoryById(Id);
	}
	@Override
	public String updateInventory(String Id, Inventory inventory) {
		// TODO Auto-generated method stub
		return repository.updateInventory(Id, inventory);
	}
}
