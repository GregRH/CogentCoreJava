package com.cogent.springecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springecommerce.dto.Inventory;
import com.cogent.springecommerce.repository.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	private InventoryRepository repository;// = InventoryRepositoryImpl.getInstance();

	@Override
	public String addInventory(Inventory inventory) {
		Inventory added = repository.save(inventory);
		if(added!=null)
			return "success";
		else
			return "fail";
	}

	@Override
	public String deleteInventoryById(String Id) {
		if(repository.existsById(Id)) {
			repository.deleteById(Id);
			return "Success";
		}
		return "Id not found";
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
		
	}

	@Override
	public Optional<Inventory> getInventoryById(String Id) {
		Inventory data = repository.getById(Id);
		return Optional.ofNullable(data);
	}

	@Override
	public String updateInventory(String Id, Inventory inventory) {
		if(repository.existsById(Id)) {
			repository.save(inventory);
			return "Success";
		}
		return "ID not found";
	}

	@Override
	public Optional<List<Inventory>> getAllInventory() {
		return Optional.ofNullable(repository.findAll());
	}

}
