package com.cogent.employeemanagementsystem;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;
import com.cogent.employeemanagementsystem.model.Employee;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = null;
		try {
			employee = new Employee("ab001","abhi","chivate",1000.0f);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Employee employee2 = null;
		try {
			employee2 = new Employee("ad001","advik","chivate",10000.0f);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Employee employee3 = null;
		try {
			employee3 = new Employee("ab002","abhi","",100000.0f);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		System.out.println(Integer.toHexString(employee.hashCode()));
		System.out.println(Integer.toHexString(employee2.hashCode()));
		System.out.println(Integer.toHexString(employee3.hashCode()));
		
		Set<Employee> employees = new LinkedHashSet<>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		for (Employee employee4 : employees) {
			System.out.println(employee4);
		}
		
	}

}
