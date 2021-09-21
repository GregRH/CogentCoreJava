package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		EmployeeService employeeService = EmployeeService.getInstance();
		Employee employee = new Employee("ab001","abhi","chivate",123.0f,"PA");
		String result = employeeService.addEmployee(employee);
		System.out.println(result);
		System.out.println(employeeService.getEmployeeById("ab001"));
	}

}
