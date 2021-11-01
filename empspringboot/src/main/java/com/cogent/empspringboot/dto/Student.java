package com.cogent.empspringboot.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "STUDENT")
public class Student {

	private long studentId;
	private String studentName;
	private Address studentAddress;
	public Student() {
	}

	public Student(long studentId,String studentName, Address studentAddress) {
		this.studentId=studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	@Id
	@Column(name = "STUDENT_ID")
	//@GeneratedValue
	public long getStudentId() {
		return this.studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	@Column(name = "STUDENT_NAME", nullable = false, length = 100)
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	//cascade type means it is going to check in address table first
	
	//whether that address exist in address table
	
	//same thing whenever u want to delete any address from the address
	//table first it will check that address should not be present on any 
	//dependent table.
/*
 * Student table is dependent on Address table
 * 
 * Address_id which is primary key in Address table 
 * Student table Address_id is foreign key
 * Address=USA
 * I am deleting address from Address table
 */
	@OneToOne(targetEntity=Address.class,cascade = CascadeType.ALL)
	//insert,delete,retrieve
//Address				//Student
	//address_id(pk)			//student_id
	//city				//studnt_name
	//state				//add_id(fk)
	
	//aDD_ID IS A NAME OF FOREIGN KEY COLUMN
	//aDDRESS_ID IS A NAME OF PRIMARY KEY COLUMN IN aDDRESS TABLE 
@JoinColumn(name="ADD_id",referencedColumnName="ADDRESS_ID")
	//@Column(name="Address_id")
	public Address getStudentAddress() {
		return this.studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

}
