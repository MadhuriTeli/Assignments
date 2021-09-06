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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=20)
	@NotEmpty(message="Enter Name")
	private String name;
	
	@Column(length=50,unique=true)
	@NotEmpty(message="Enter Email")
	@Email(message="Invalid email format")
	private String email;
	
	//Password: ZorM Occurance of Digit | ZeroOrMore Occurance of Alphabhet | Zero or More Occurance of [] given symbols |min-5 max-20
	@Column(length=20)
	@NotEmpty(message="Enter Password")
	@Pattern(regexp="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})",message="Invalid password")
	private String password;
	
	@Column(length=10)
	@NotNull(message="Dept Id can't be blank")
	private Integer deptid;

	@Column(length=10)
	@NotNull(message="Salary can't be blank")
	@Range(min=500,max=5000,message="Invalid Salary amount")
	private double salary;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotNull(message="Reg date can't be blank")
	private Date regDate;
	
	public Employee()
	{
		System.out.println("In Default Constructor");
	}
	public Employee(String name, String email, String password, Integer deptid, double salary,Date regDate) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.deptid = deptid;
		this.salary = salary;
		this.regDate = regDate;
	}

	public Employee(Integer id, String name, String email, String password, Integer deptid, double salary,Date regDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.deptid = deptid;
		this.salary = salary;
		this.regDate = regDate;
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
	
	
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", deptid="
				+ deptid + ", salary=" + salary + ", regDate=" + regDate + "]";
	}
	
	
	
}
