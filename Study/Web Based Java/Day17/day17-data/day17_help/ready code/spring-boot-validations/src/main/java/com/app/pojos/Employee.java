package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empid", insertable = false, updatable = false)
	@JsonProperty("id")
	private Integer empId;
	//P.L validation rules (OR validation rules in back end)
	@NotBlank(message="address  can't be blank")
	@Column(name = "addr", length = 30)
	private String address;

	@NotBlank(message="name must be supplied")
	private String name;
	
	@Min(value = 10000,message = "Min sal 10000")
	private double salary;
	
	@Past(message = "DoB must be in the past....")
	private LocalDate dob;
	
	@NotBlank(message="Designation must be supplied")
	@Column(length = 20)
	private String designation;
	
	@Min(value=1,message="Dept Id  must have > 1")
	@Column(name = "dept_id")
	private int deptId;

	public Employee() {
	}

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", address=" + address + ", name=" + name + ", salary=" + salary + ", dob="
				+ dob + ", designation=" + designation + ", deptId=" + deptId + "]";
	}
	

}