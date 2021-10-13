package com.cogent.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private String userId;
	private String userName;
	private String password;
	private String emailId;
	private String roleId;
}