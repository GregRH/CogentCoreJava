package com.cogent.employeemanagementsystem.service;

import java.io.IOException;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.exception.InvalidNameException;
import com.cogent.employeemanagementsystem.model.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id)throws IdNotFoundException, IOException;
	public void deleteAllEmployees();
	public Employee getEmployeeById(String id)throws IdNotFoundException, IOException;
	public Employee[] getEmployees();
	public String updateEmployee(String id, Employee employee)throws IdNotFoundException, IOException;
	public Employee[] getEmployeeByName(String name);
}
