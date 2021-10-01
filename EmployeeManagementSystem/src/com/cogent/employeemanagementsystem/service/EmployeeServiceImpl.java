package com.cogent.employeemanagementsystem.service;

import java.io.IOException;
import java.util.List;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.exception.InvalidNameException;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryALImpl;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepository employeeRepository = EmployeeRepositoryALImpl.getIntsance();
	private static EmployeeService employeeService;
	private EmployeeServiceImpl(){
	}
	public static EmployeeService getInstance() {
		if(employeeService==null)
			employeeService=new EmployeeServiceImpl();
		return employeeService;
	}
	public String addEmployee(Employee Employee) {
		return employeeRepository.addEmployee(Employee);
	}
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		return employeeRepository.getEmployeeById(id);
	}
	public List<Employee> getEmployees() {
		return employeeRepository.getEmployees();
	}
	public String deleteEmployeeById(String id)throws IdNotFoundException, IOException {
		return employeeRepository.deleteEmployeeById(id);
	}
	public String updateEmployee(String id,Employee employee) throws IdNotFoundException, IOException {
		return employeeRepository.updateEmployee(id, employee);
	}
	public void deleteAllEmployees() {
		employeeRepository.deleteAllEmployees();
		
	}
	@Override
	public Employee[] getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployeeByName(name);
	}
	@Override
	public boolean isEmployeeExist(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.isEmployeeExist(id);
	}
}
