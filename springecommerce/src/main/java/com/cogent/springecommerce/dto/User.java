package com.cogent.springecommerce.dto;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {
	//@Id
	@EmbeddedId
	private UserCompositeKey userkey;
	
	//private String userId;
	private String userName;
	private String password;
	//private String emailId;
	private String roleId;
	@OneToOne(targetEntity=Role.class,cascade=CascadeType.ALL)
	@JoinColumn(name="fk_role_id",referencedColumnName="roleId")
	private Role role;
}
