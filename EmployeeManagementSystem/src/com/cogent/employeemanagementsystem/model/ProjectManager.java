package com.cogent.employeemanagementsystem.model;

public class ProjectManager extends Manager {
	private String[] technology;
	public ProjectManager() {
		super();
	}
	public ProjectManager(String empId,String firstName,String lastName,
			float empSalary,
			float projectAllow,
			String managerId,
			String[] technology) {
		super(empId, firstName,lastName,empSalary,
				 projectAllow,
				 managerId);
		this.technology=technology;
	}
}
