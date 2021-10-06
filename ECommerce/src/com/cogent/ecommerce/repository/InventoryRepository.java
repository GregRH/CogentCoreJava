package com.cogent.ecommerce.repository;

import com.cogent.ecommerce.dto.Inventory;

public interface InventoryRepository {
	public boolean addInventory(Inventory inventory);
	public boolean deleteInventoryById(String Id);
	public void deleteAll();
	public Inventory getInventoryById(String Id);
	public boolean updateInventory(String Id, Inventory inventory);
}
