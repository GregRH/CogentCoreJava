package com.cogent.ecommerceJDBC.repository;

import java.util.Optional;

import com.cogent.ecommerceJDBC.dto.Inventory;

public interface InventoryRepository {
	public String addInventory(Inventory inventory);
	public String deleteInventoryById(String Id);
	public void deleteAll();
	public Optional<Inventory> getInventoryById(String Id);
	public String updateInventory(String Id, Inventory inventory);
}
