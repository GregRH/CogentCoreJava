package com.cogent.emsjdbc.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private String empId;
	private String empFirstName;
	private String empLastname;
	private Date doj;
	private Date dob;
	private float empSalary;
}
