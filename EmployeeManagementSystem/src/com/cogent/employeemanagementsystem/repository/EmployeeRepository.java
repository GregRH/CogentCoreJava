package com.cogent.employeemanagementsystem.repository;

import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepository {
	private Employee employees[]=new Employee[10];
	private static EmployeeRepository employeeRepository;
	static int counter=-1;
	private EmployeeRepository() {
		
	}
	public static EmployeeRepository getIntsance() {
		if(employeeRepository==null)
			employeeRepository = new EmployeeRepository();
		return employeeRepository;
	}
	public String addEmployee(Employee employee) {
		if(counter>=employees.length)
			return "Array is full";
		employees[++counter]=employee;
		return "success";
	}
	public Employee getEmployeeById(String id) {
		for (Employee employee : employees) {
			if(employee!=null&&id.equals(employee.getEmployeeId()))
				return employee;
		}
		return null;
	}
}
