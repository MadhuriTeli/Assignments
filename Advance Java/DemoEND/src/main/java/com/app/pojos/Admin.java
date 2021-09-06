package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//Map this to existing tables "users"
@Table(name = "admin")
public class Admin extends BaseEntity{
	@Column(length = 20,unique = true)
	private String username;
	
	@Column(length = 20)
	private String password;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + "]";
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
