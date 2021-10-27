package com.cogent.springecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Role {
	private String roleID;
	private String roleName;
}
