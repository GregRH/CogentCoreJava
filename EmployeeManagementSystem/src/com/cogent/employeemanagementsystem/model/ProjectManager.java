package com.cogent.employeemanagementsystem.model;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;

public class ProjectManager extends Manager {
	private String[] technology;
	public ProjectManager() throws InvalidSalaryException {
		super();
	}
	public ProjectManager(String empId,String firstName,String lastName,
			float empSalary,
			float projectAllow,
			String managerId,
			String[] technology) throws InvalidSalaryException {
		super(empId, firstName,lastName,empSalary,
				 projectAllow,
				 managerId);
		this.technology=technology;
	}
}
