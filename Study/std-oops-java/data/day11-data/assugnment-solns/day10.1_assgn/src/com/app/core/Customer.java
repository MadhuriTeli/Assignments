package com.app.core;
// Customer : name(string),email(string),password(string),registrationAmount(double),dob(Date)

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	private String name;
	private String email;
	private String password;
	private double regAmount;
	private Date dob;
	// HAS-A
	private CustomerCategory category;
	// Customer HAS-A AdharCard
	private AdharCard adharCard;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Customer(String name, String email, String password, double regAmount, Date dob, CustomerCategory category) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.category = category;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (adharCard == null)
			sb.append("Adhar card not yet linked");
		else
			sb.append(adharCard);
		return "Customer [name=" + name + ", email=" + email 
				+ ", regAmount=" + regAmount + ", dob=" + sdf.format(dob)
				+ " category " + category+" "+sb;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in customer equals");
		if (o instanceof Customer) {
			Customer c = (Customer) o;
			return this.email.equals(c.email);
		}
		return false;
	}

	// add a non static method , to link adhar card details to "this" customer
	public void linkAdharCard(String uid, String creationDate) throws ParseException {
		this.adharCard = new AdharCard(uid, sdf.parse(creationDate));
	}

	// create non static nested class(inner class) : to represent Adhar card details
	// state , constr , toString
	class AdharCard {
		private String uid;
		private Date createdOn;

		public AdharCard(String uid, Date createdOn) {
			super();
			this.uid = uid;
			this.createdOn = createdOn;
		}

		@Override
		public String toString() {
			return "AdharCard [uid=" + uid + ", createdOn=" +sdf.format(createdOn);
		}

	}

}
