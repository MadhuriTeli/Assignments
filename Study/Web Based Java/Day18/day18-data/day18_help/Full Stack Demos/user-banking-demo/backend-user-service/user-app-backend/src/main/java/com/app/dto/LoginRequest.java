package com.app.dto;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginRequest {	
	@NotBlank(message = "customer id must be supplied")
	@Length(min = 4,max = 20,message = "Invalid customer id")
	private String customerId;
	@NotBlank(message = "password id must be supplied")
	private String password;
}
