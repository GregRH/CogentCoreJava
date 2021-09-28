package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;
import java.util.ArrayList;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryALImpl implements EmployeeRepository {
	private ArrayList<Employee> employees = new ArrayList<>();
	private static EmployeeRepository employeeRepository;
	private EmployeeRepositoryALImpl() {}
	public static EmployeeRepository getIntsance() {
		if(employeeRepository==null)
			employeeRepository = new EmployeeRepositoryALImpl();
		return employeeRepository;
	}
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		boolean status = employees.add(employee);
		if (status)
			return "success";
		else
			return "fail";
	}

	@Override
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		for (Employee employee : employees) {
			if(employee.getEmployeeId().equals(id))
				return employee;
		}
		throw new IdNotFoundException("Id not found");
	}

	@Override
	public Employee[] getEmployees() {
		// TODO Auto-generated method stub
		return (Employee[]) employees.toArray();
		
	}

	@Override
	public String updateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee[] getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
