package com.app.dto;

import com.app.pojos.Course;

public class StudentSignupRequest extends UserSignupRequest {
	private double attendance;
	
	private String address;
	
	private Course chosenCourse;
	
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
