package com.cogent.employeemanagementsystem.exception;

import lombok.ToString;

@ToString
public class InvalidNameException extends RuntimeException {
	public InvalidNameException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
