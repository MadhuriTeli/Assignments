package com.app.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="user")
public class User {
	private Integer id;
	private String name;
	private String email;
	private Date regDate;
	private String role;
	
	private boolean isactive;
	
	public User() {
		System.out.println("In User Contr::");
	}

	public User(String name, String email, Date regDate, String role,boolean isactive) {
		super();
		this.name = name;
		this.email = email;
		this.regDate = regDate;
		this.role = role;
		this.isactive = isactive;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length=50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length=50,unique=true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Temporal(TemporalType.DATE)
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Column
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", regDate=" + regDate + ", role=" + role
				+ ", isactive=" + isactive + "]";
	}
	


	

	
}
