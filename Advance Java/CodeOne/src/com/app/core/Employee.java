package com.app.core;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private LocalDate dob;
	private LocalDate doj;
	private double salary;
	private String email;
	private String department;
	
	public Employee(int id, String name, LocalDate dob, LocalDate doj, double salary, String email, String department) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
		this.salary = salary;
		this.email = email;
		this.department = department;
	}
	
	public Employee(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", doj=" + doj + ", salary=" + salary
				+ ", email=" + email + ", department=" + department + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Employee e) {
		return ((LocalDate)e.doj).compareTo(doj);	//Most Recent First
		//Ascending return ((LocalDate)doj).compareTo(e.doj);	

	}


	
	
	
	
}
