package com.cogent.employeemanagementsystem.repository;

import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository{
	private Employee employees[]=new Employee[10];
	private static EmployeeRepository employeeRepository;
	static int counter=-1;
	private EmployeeRepositoryImpl() {
		
	}
	public static EmployeeRepository getIntsance() {
		if(employeeRepository==null)
			employeeRepository = new EmployeeRepositoryImpl();
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
	public Employee[] getEmployees() {
		return employees;
	}
	public String deleteEmployeeById(String id) {
		
		Employee employee = this.getEmployeeById(id);
		if (employee!=null) {
			int pos=this.getIndex(employee);
			if(pos!=-1) {
				employees[pos]=null;
				for(int i=pos;i<counter;i++) {//Shift array
					employees[i]=employees[i+1];
				}
				employees[counter]=null;//null last position
				counter--;
				return "Success";
			}
		}
			return "Not found";		
	}
	public String updateEmployee(String id, Employee employee) {
		if(this.getIndex(this.getEmployeeById(id))!=-1) {
			employees[this.getIndex(this.getEmployeeById(id))]=employee;
			return "Success";
		}
		return "Not found";
	}
	private int getIndex(Employee employee) {
		for (int i = 0; i < employees.length; i++) {
			if(employee.equals(employees[i]))
				return i;
		}
		return -1;
	}
	public void deleteAllEmployees() {
		while(this.counter>-1)
			this.deleteEmployeeById(employees[counter--].getEmployeeId());
	}
	@Override
	public Employee[] getEmployeeByName(String name) {
		Employee employeesName[] = new Employee[10];
		int i=0;
		for (Employee employee : employees) {
			if(name.equals(employee.getFirstName())||name.equals(employee.getLastName())) {
				employeesName[i]=employee;
			}
		}
		return employeesName;
	}
}
