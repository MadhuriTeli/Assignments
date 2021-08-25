package com.app.student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.app.core.Customer.AdharCard;


public class Student {
	//prn (string : unique id) , name , email , password, course (enum) ,GPA(double 1---10) , dob(Date)
	private String prn, name, email, password;
	private double gpa;
	private Date dob;
	private StudentCourses course;
	private ContactDetails contactDetails;
	
	public static SimpleDateFormat sdf;//converter (string--->Date n Date---> string)
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	public Student(String prn, String name, String email, String password, double gpa, Date dob, StudentCourses course) {
		super();
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gpa = gpa;
		this.dob = dob;
		this.course = course;
	}
	
	public Student(String prnNo) {
		super();
		this.prn = prnNo;
	} 
	
	@Override
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + ", email=" + email + ", gpa=" + gpa + ", dob=" + sdf.format(dob)
				+ ", course=" + course + "]";
	}


	@Override
	public boolean equals(Object o)
	{
		System.out.println("in student equals");
		if(o instanceof Student)
			return this.prn==((Student)o).prn;
		return false;
	}
	
	public String getPrn() {
		return prn;
	}
	public void setPrn(String prn) {
		this.prn = prn;
	}
	
	// add a non static method , to link adhar card details to "this" customer
	public void addContactDetails(String city, String state, String phoneNo) throws ParseException {
		this.contactDetails = new ContactDetails(city, state, phoneNo);
	}


	class ContactDetails {
		private String city , state , phoneNo;
		public ContactDetails(String city, String state, String phoneNo) {
			super();
			this.city = city;
			this.state = state;
			this.phoneNo = phoneNo;
		}
		@Override
		public String toString() {
			return "ContactDetails [city=" + city + ", state=" + state + ", phoneNo=" + phoneNo + "]";
		}

	}

}
