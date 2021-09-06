package com.app.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length=20)
	private String name;
	@Column(length=50,unique=true)
	private String email;
	@Column(length=20)
	private String password;
	@Column(length=10)
	private Integer deptid;
	@Column(length=10)
	private double salary;
	@Temporal(TemporalType.DATE)
	private Date regDate;
	
	public Employee()
	{
		System.out.println("In Default Constructor");
	}
	public Employee(String name, String email, String password, Integer deptid, double salary) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.deptid = deptid;
		this.salary = salary;
	}

	public Employee(Integer id, String name, String email, String password, Integer deptid, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.deptid = deptid;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getDeptid() {
		return deptid;
	}


	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", deptid="
				+ deptid + ", salary=" + salary + "]";
	}


	

	
	
	
	
}
