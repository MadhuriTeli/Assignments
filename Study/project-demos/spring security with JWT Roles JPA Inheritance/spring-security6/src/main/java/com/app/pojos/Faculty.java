package com.app.pojos;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value = "faculty")
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name="faculty")
public class Faculty extends User {
	private String contactNo;
	
	private String specialization;
	
	@ManyToOne
	@JoinColumn(name = "course_id", nullable = false)
	private Course chosenCourse;
	
	@ManyToOne
	@JoinColumn(name="d_id",nullable=false)
	private Department chosenDepartment;
	
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public Course getChosenCourse() {
		return chosenCourse;
	}
	public void setChosenCourse(Course chosenCourse) {
		this.chosenCourse = chosenCourse;
	}
	public Department getChosenDepartment() {
		return chosenDepartment;
	}
	public void setChosenDepartment(Department chosenDepartment) {
		this.chosenDepartment = chosenDepartment;
	}
	
}
