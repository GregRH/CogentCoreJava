package com.cogent.emsjdbc.service;

import java.util.List;

import com.cogent.emsjdbc.dto.Employee;
import com.cogent.emsjdbc.repository.EmployeeRepository;
import com.cogent.emsjdbc.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private static EmployeeService employeeService;
	private EmployeeServiceImpl() {}
	private EmployeeRepository repository = EmployeeRepositoryImpl.getInstance();
	public static EmployeeService getInstance() {
		if (employeeService==null)
			employeeService = new EmployeeServiceImpl();
		return employeeService;
	}
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

	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return repository.getEmployeeById(id);
	}

	public List<Employee> getEmployees() {
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
