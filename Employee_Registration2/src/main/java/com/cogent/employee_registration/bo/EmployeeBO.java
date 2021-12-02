package com.cogent.employee_registration.bo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_details")
public class EmployeeBO {
	@Id
	private String name;
	private String address;
	private String department;
	private float salary;
	private float gross_salary;
	private float net_salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getGross_salary() {
		return gross_salary;
	}
	public void setGross_salary(float gross_salary) {
		this.gross_salary = gross_salary;
	}
	public float getNet_salary() {
		return net_salary;
	}
	public void setNet_salary(float net_salary) {
		this.net_salary = net_salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

}
