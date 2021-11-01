package com.cogent.empspringboot.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="empTable")
public class Employee {
	@Id
	private String empId;
	private String empFirstName;
	private String empLastname;
	private Date doj;
	private Date dob;
	private float empSalary;
}
