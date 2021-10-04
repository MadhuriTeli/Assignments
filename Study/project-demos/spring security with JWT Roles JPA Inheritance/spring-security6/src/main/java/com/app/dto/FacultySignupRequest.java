package com.app.dto;

import com.app.pojos.Course;
import com.app.pojos.Department;

public class FacultySignupRequest extends UserSignupRequest {
	private String contactNo;

	private String specialization;

	private Course chosenCourse;

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
