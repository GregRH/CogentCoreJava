package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;
import java.util.List;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.exception.InvalidNameException;
import com.cogent.employeemanagementsystem.model.Employee;

public interface EmployeeRepository {
	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id)throws IdNotFoundException, IOException;;
	public void deleteAllEmployees();
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException;
	public List<Employee> getEmployees();
	public String updateEmployee(String id, Employee employee)throws IdNotFoundException, IOException;
	public Employee[] getEmployeeByName(String name);
	public boolean isEmployeeExist(String id);
}
