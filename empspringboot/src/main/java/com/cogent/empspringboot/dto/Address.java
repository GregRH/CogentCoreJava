package com.cogent.empspringboot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ADDRESS")

public class Address {

	private long addressId;
	private String street;
	private String city;
	private String state;
	private String zipcode;
	@OneToOne(mappedBy="studentAddress")
	//mapped by is used to define bi-directional relationship
	
	public Student getSt() {
		return st;
	}

	public void setSt(Student st) {
		this.st = st;
	}

	private Student st;
	
	
	public Address() {
	}

	public Address(long addressId,String street, String city, String state, String zipcode) {
		this.addressId=addressId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	@Id
	@Column(name = "ADDRESS_ID")
	public long getAddressId() {
		return this.addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	
	@Column(name = "ADDRESS_STREET", nullable = false, length=250)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "ADDRESS_CITY", nullable = false, length=50)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "ADDRESS_STATE", nullable = false, length=50)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "ADDRESS_ZIPCODE", nullable = false, length=10)
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}

