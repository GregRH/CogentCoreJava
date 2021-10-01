package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryALImpl implements EmployeeRepository {
	private Set<Employee> employees = new HashSet<>();
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
		boolean success = employees.remove(this.getEmployeeById(id));
		if (success)
			return "success";
		else
			return "failure";
	}


	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		employees.clear();// = null;

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
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		//Employee employee[]=new Employee[employees.size()];
		//employee = employees.toArray(employee);
		//return employee;
		//set to list
		
		return new ArrayList<>(employees);
		
	}

	@Override
	public String updateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		boolean success = true;
		//employees.set(employees.indexOf(this.getEmployeeById(id)),employee);

		if(success)
			return "success";
		else
			return "failure";
	}

	@Override
	public Employee[] getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		Employee employeeNames[]=new Employee[employees.size()];
		int i = 0;
		for (Employee employee : employees) {
			if(employee.getEmployeeId().equals(name))
				employeeNames[i++]=employee;
		}
		return employeeNames;
	}
	@Override
	public boolean isEmployeeExist(String id) {
		// TODO Auto-generated method stub
		for (Employee employee : employees) {
			if(id.equals(employee.getEmployeeId()))
				return true;
		}
		return false;
	}

}
