package com.cogent.deptemployee.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Employee")
public class Employee {
	@Id
	private String empCode;
	private String empName;
	private double salary;
	@ManyToOne
	@JoinColumn(name="dept_code")
	private Department dept;
}
