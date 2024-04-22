package com.eb.user.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="TBL_USERS")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
@NotNull
@Size(min=2,max=10,message="first Name should have atleast 2 characters")
	@Column(name="firstName")
private String firstName;
@NotNull
@Size(min=2,max=10,message="Last Name should have atleast 2 characters")
	
	@Column(name="lastName")
	private String lastName;
@NotNull
@Size(min=2,max=10,message="User Name should have atleast 2 characters")
	@Column(name="username")
	private String username;

@NotNull
@NotBlank(message="Password is mandatory")
	@Column(name="password")
	private String password;
}
