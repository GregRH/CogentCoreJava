package com.cogent.employeemanagementsystem.exception;

import lombok.ToString;

@ToString
public class InvalidSalaryException extends Exception {
	public InvalidSalaryException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
