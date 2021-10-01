package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;
import java.util.List;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.exception.InvalidNameException;
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
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		for (Employee employee : employees) {
			if(employee!=null&&id.equals(employee.getEmployeeId()))
				return employee;
		}
		throw new IdNotFoundException("id not found");
		
	}
	/*public Employee[] getEmployees() {
		return employees;
	}*/
	public List<Employee> getEmployees(){
		return null;
	}
	public String deleteEmployeeById(String id)throws IdNotFoundException, IOException {
		
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
	public String updateEmployee(String id, Employee employee)throws IdNotFoundException, IOException {
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
		employees=null;
		counter=-1;
	}
	@Override
	public Employee[] getEmployeeByName(String name) {
		Employee employeesName[] = new Employee[10];
		int i=0;
		for (Employee employee : employees) {
			if(employee!=null&&(name.equals(employee.getFirstName())||name.equals(employee.getLastName()))) {
				employeesName[i++]=employee;
			}
		}
		return employeesName;
	}
}
