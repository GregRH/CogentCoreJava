package com.cogent.employeemanagementsystem;

import java.util.Scanner;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		Employee employee = new Employee("ab001","abhi","chivate",123.0f);//,"PA");
		String result = employeeService.addEmployee(employee);
		employeeService.addEmployee(new Employee("ab002","abhi","chivate",123.0f));//,"PA"));
		employeeService.addEmployee(new Employee("ab003","abhi","chivate",123.0f));//,"PA"));
		Employee employee2 = new Employee("ab001","abhi","chivate",1000.0f);
		System.out.println(result);
		System.out.println(employeeService.getEmployeeById("ab001"));
		Employee[] employees = employeeService.getEmployees();
		for (Employee employee3 : employees) {
			System.out.println(employee3);
		}
		System.out.println(employeeService.deleteEmployeeById("ab003"));
		System.out.println(employeeService.deleteEmployeeById("ab003"));
		for (Employee employee3 : employees) {
			System.out.println(employee3);
		}
		System.out.println(employeeService.updateEmployee("ab001", employee2));
		for (Employee employee3 : employees) {
			System.out.println(employee3);
		}
	}

}
