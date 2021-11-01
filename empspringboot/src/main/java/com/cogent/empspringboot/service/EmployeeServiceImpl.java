package com.cogent.empspringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.empspringboot.dto.Employee;
import com.cogent.empspringboot.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repository;
//	
//	public String addEmployee(Employee employee) {
//		// TODO Auto-generated method stub
//		return repository.addEmployee(employee);
//	}
//
//	public String deleteEmployeeById(String id) {
//		// TODO Auto-generated method stub
//		return repository.deleteEmployeeById(id);
//	}
//
//	public void deleteAllEmployees() {
//		// TODO Auto-generated method stub
//		repository.deleteAllEmployees();
//	}
//
//	public Optional<Employee> getEmployeeById(String id) {
//		// TODO Auto-generated method stub
//		return repository.getEmployeeById(id);
//	}
//
//	public Optional<List<Employee>> getEmployees() {
//		// TODO Auto-generated method stub
//		return repository.getEmployees();
//	}
//
//	public String updateEmployee(String id, Employee employee) {
//		// TODO Auto-generated method stub
//		return repository.updateEmployee(id, employee);
//	}
//
//	public boolean isEmployeeExists(String id) {
//		// TODO Auto-generated method stub
//		return repository.isEmployeeExists(id);
	//}

	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee emp = repository.save(employee);
		if(emp!=null)
			return "Success";
		else
			return "fail";
	}

	@Override
	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		return null;
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Employee> getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(repository.getById(id));
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmployeeExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
