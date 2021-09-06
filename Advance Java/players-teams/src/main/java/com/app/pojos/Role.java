package com.app.pojos;

import javax.persistence.Entity;

@Entity
public class Role extends BaseEntity{
private String role;

public String getRole() {
	return role;
}

public Role(String role) {
	super();
	this.role = role;
}

public void setRole(String role) {
	this.role = role;
}

@Override
public String toString() {
	return "Role [role=" + role + "]";
}
public Role() {
	// TODO Auto-generated constructor stub
}
}
