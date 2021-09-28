package com.cogent.employeemanagementsystem.model;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;

public class Manager extends Employee {
	private String managerId;
	private float projectAllow;
	
	public Manager() throws InvalidSalaryException {
		this("","","",1000.0f,1000.0f,"");
	}
	public Manager(String empId,String firstName,
			String lastName,
			float empSalary,
			float projectAllow,
			String managerId) throws InvalidSalaryException {
		super(empId,firstName,lastName,empSalary);
		//super(empId,firstName,lastName,123.0f);
		//this.managerId=managerId;
		this.managerId="manager";
		this.projectAllow=projectAllow;
	}
	@Override
	public float calculateSalary() {
		return (super.calculateSalary()+projectAllow);
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public float getProjectAllow() {
		return projectAllow;
	}
	public void setProjectAllow(float projectAllow) {
		this.projectAllow = projectAllow;
	}
	
}
