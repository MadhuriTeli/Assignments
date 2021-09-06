package com.app.pojos;

import javax.persistence.Entity;

@Entity

public class Admin extends BaseEntity{
private String userName;
private String password;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Admin(String userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
}
@Override
public String toString() {
	return "Admin [userName=" + userName + "]";
}
public Admin() {
	// TODO Auto-generated constructor stub
}
}
