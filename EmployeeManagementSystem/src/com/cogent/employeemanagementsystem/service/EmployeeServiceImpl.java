package com.cogent.employeemanagementsystem.service;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getIntsance();
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
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}
	public Employee[] getEmployees() {
		return employeeRepository.getEmployees();
	}
	public String deleteEmployeeById(String id) {
		return employeeRepository.deleteEmployeeById(id);
	}
	public String updateEmployee(String id,Employee employee) {
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
}
