package com.cogent.springecommerce.service;

import java.util.List;
import java.util.Optional;

import com.cogent.springecommerce.dto.Inventory;

public interface InventoryService {
	public String addInventory(Inventory inventory);
	public String deleteInventoryById(String Id);
	public void deleteAll();
	public Optional<Inventory> getInventoryById(String Id);
	public String updateInventory(String Id, Inventory inventory);
	public Optional<List<Inventory>> getAllInventory();
}
