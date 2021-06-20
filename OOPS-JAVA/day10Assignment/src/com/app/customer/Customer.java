package com.app.customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	private String name, email, password;
	private double registrationAmount;
	private Date dob;
	private CustomerCategory category;
	private AdharCard adharCard;
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
		StringBuilder sb = new StringBuilder();
		if(adharCard == null)
			sb.append("Adhar card not yet LInked");
		else
			sb.append(adharCard);
		return "Customer [name=" + name + ", email=" + email + ", registrationAmount="
				+ registrationAmount + ", dob=" + sdf.format(dob) + ",Category=" +category+  ", adhar" +sb.toString()+ "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer) {
			Customer c = (Customer)obj;
			return this.email.equals(c.email);
		}
		return false;
	}
	
	public void linkAdharCard(String uid, String creationDate) throws ParseException{
		adharCard= new AdharCard(uid, sdf.parse(creationDate));
	}
	//non static nested class
	class AdharCard{
		private String uid;
		private Date createdOn;
		public AdharCard(String uid, Date createdOn) {
			super();
			this.uid = uid;
			this.createdOn = createdOn;
		}
		@Override
		public String toString() {
			return "AdharCard [uid=" + uid + ", createdOn=" +  sdf.format(createdOn) + "]";
		}
	
	}

}
