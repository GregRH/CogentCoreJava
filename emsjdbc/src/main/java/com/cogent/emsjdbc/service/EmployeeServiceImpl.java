package com.cogent.emsjdbc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.emsjdbc.dto.Employee;
import com.cogent.emsjdbc.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repository.addEmployee(employee);
	}

	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		return repository.deleteEmployeeById(id);
	}

	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		repository.deleteAllEmployees();
	}

	public Optional<Employee> getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return repository.getEmployeeById(id);
	}

	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return repository.getEmployees();
	}

	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return repository.updateEmployee(id, employee);
	}

	public boolean isEmployeeExists(String id) {
		// TODO Auto-generated method stub
		return repository.isEmployeeExists(id);
	}

}
