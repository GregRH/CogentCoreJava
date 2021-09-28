package com.cogent.employeemanagementsystem;

import java.io.IOException;
import java.util.Scanner;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.exception.InvalidNameException;
import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;

public class Main {
	public static void main(String[] args) {
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		try {
			Employee employeee = new Employee("ab001","abhi","chivate",123.0f);
			employeeService.addEmployee(employeee);
		} catch (InvalidSalaryException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Employee employee = employeeService.getEmployeeById("ab001");
			System.out.println(employeeService.getEmployeeById("ab001"));
		} catch (IdNotFoundException e) {
			System.out.println("Caught ID");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	/*public static void main(String[] args) {
		
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
		Employee names[]=employeeService.getEmployeeByName("abhi");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		employeeService.deleteAllEmployees();
		for (Employee employee3 : employees) {
			System.out.println(employee3);
		}
		
	}*/

}
