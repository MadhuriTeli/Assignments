package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "passengers")
@Getter
@Setter
@ToString
public class Passenger extends BaseEntity {
	@Column(length = 30)
	@NotBlank(message = "First Name Must be supplied")
	private String firstName;
	@Column(length = 30)
	private String lastName;
	@Column(length = 30)
	private String middleName;
	@Column(length = 30,unique = true)
	private String email;
	@Column(length = 10,unique = true)
	private String phone;

}
