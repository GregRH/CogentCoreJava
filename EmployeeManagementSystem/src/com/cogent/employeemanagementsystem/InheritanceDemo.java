package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.model.Manager;
import com.cogent.employeemanagementsystem.model.ProjectManager;

public class InheritanceDemo {
	public final int a;
	public InheritanceDemo() {
		this.a=0;
	}
	public static final void main(String[] args) throws InvalidSalaryException {
		Manager manager = new Manager("ab001","abhi","chivate",1200.0f,123,"PA");
		Manager manager2 = new Manager();
		Employee manager3 = new Manager();
		ProjectManager projectManager = new ProjectManager();
		float salary = manager2.calculateSalary();
		System.out.println("emp id "+manager.getEmployeeId());
		System.out.println(salary);
		System.out.println(manager3.calculateSalary());
		Manager manager4 = (Manager) manager3;
		System.out.println(manager4.getProjectAllow());
		
		
		
	}

}
