package com.cogent.employeemanagementsystem.repository;

import com.cogent.employeemanagementsystem.model.Employee;

public interface EmployeeRepository {
	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id);
	public void deleteAllEmployees();
	public Employee getEmployeeById(String id);
	public Employee[] getEmployees();
	public String updateEmployee(String id, Employee employee);
	public Employee[] getEmployeeByName(String name);
}
