package com.app.pojos;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Student extends User {
	private double attendance;
	private String address;
	@ManyToOne
	@JoinColumn(name="course_id",nullable=false)
	private Course chosenCourse;
	@ManyToOne
	@JoinColumn(name="dept_id",nullable=false)
	private Course chosenDept;
	public double getAttendance() {
		return attendance;
	}
	public void setAttendance(double attendance) {
		this.attendance = attendance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Course getChosenCourse() {
		return chosenCourse;
	}
	public void setChosenCourse(Course chosenCourse) {
		this.chosenCourse = chosenCourse;
	}
	public Course getChosenDept() {
		return chosenDept;
	}
	public void setChosenDept(Course chosenDept) {
		this.chosenDept = chosenDept;
	}
	
}
