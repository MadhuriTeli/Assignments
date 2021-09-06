package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="users_tbl")
public class User extends BaseEntity {
	@Column(length = 20,unique = true)
	@Email(message = "invalid email format")
	private String email="abc@gmail.com";
	@Column(length = 20,nullable = false)
	private String password;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	@Enumerated(EnumType.STRING)
	@Column(length = 20,name="user_role")
	private Role role;

	public User() {
		System.out.println("in ctor of " + getClass().getName());
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", dob=" + dob + ", getId()="
				+ getId() + "]";
	}

}
