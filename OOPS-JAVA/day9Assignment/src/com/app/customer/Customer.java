package com.app.customer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	private String name, email, password;
	private double registrationAmount;
	private Date dob;
	private CustomerCategory category;
	//add single copy of the SDF
	public static SimpleDateFormat sdf;//converter (string--->Date n Date---> string)
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	public Customer(String name, String email, String password, double registrationAmount, Date dob,CustomerCategory category) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.category=category;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", registrationAmount="
				+ registrationAmount + ", dob=" + sdf.format(dob) + ",Category=" +category+ "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer) {
			Customer c = (Customer)obj;
			return this.email.equals(c.email);
		}
		return false;
	}
	

}
