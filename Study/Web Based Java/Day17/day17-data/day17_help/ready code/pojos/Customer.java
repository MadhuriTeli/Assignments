package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "bank_customers")
public class Customer extends BaseEntity{
	
	
	@NotBlank(message = "Name is required")
	@Length(min = 3, max = 15, message = "Invalid len of Name")
	@Column(length = 20)
	private String name ;

	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})", message = "Blank or Invalid password")
	@Column(length = 20,nullable = false)
	
	private String password;

	public Customer() {
		System.out.println("in vendor ctor");
	}
	

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
