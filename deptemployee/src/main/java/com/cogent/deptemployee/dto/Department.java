package com.cogent.deptemployee.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="department")
public class Department {
	@Id
	private String deptCode;
	private String name;
	private String city;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="dept_code",referencedColumnName = "deptCode")
	private List<Employee> empList;
}
