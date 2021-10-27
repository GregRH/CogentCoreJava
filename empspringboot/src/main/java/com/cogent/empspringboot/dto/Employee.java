package com.cogent.empspringboot.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private String empNo;
	private String empFirstName;
	private String empLastName;
	private String address;
	private float salary;
	private Date doj;
	private Date Doj;
}
