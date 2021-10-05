package com.cogent.employeemanagementsystem;

import java.util.Comparator;
import java.util.TreeMap;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;
import com.cogent.employeemanagementsystem.model.Employee;

//import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Comparator<Employee> comparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Float.valueOf(o1.getEmpSalary()).compareTo(Float.valueOf(o2.getEmpSalary()));
			}
		};
		Comparator<Employee> comparator2 = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmployeeId().compareTo(o2.getEmployeeId());
			}
		};
		TreeMap<Employee,Integer> employees = new TreeMap<>(comparator2);
		try {
			employees.put(new Employee("ab001", "abhi", "chivate", 1000.0f),1000);
			employees.put(new Employee("ab005", "advik", "chivate", 1000.0f),1000);
			employees.put(new Employee("ab0010", "abhinandan", "chivate", 1000.0f),1000);
			
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(ClassCastException e) {
			System.out.println("Exception caught"+e);
		}
		
		System.out.println(employees);
		
		
		
		
		
		
		// TODO Auto-generated method stub
//		TreeSet<String> set = new TreeSet<>();
//		TreeSet<String> set2 = new TreeSet<>();
//		TreeSet<String> set3 = new TreeSet<String>();
//		set.add("abhi");
//		set.add("howard");
//		set.add("levi");
//		set.add("angi");
//		set.add("omer");
//		set.add("greg");
//		set.add("kashif");
//		set.add("murtaza");
//		set.add("yuta");
//		set.add("shaotang");
//		set.add("anthony");
//		set.add("akshajyot");
//
//		System.out.println(set);

	}

}
