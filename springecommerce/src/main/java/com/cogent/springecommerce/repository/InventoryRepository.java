package com.cogent.springecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.springecommerce.dto.Inventory;
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, String> {
//	public String addInventory(Inventory inventory);
//	public String deleteInventoryById(String Id);
//	public void deleteAll();
//	public Optional<Inventory> getInventoryById(String Id);
//	public String updateInventory(String Id, Inventory inventory);
}
