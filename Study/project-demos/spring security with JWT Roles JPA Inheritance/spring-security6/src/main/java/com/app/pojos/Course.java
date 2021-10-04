package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long courseId;
	@Column(length = 20, unique = true)
	private String name;
	@Column(length = 50)
	private String pattern;
	@Column(length = 10)
	private String duration;
	@Column(length = 10)
	private String fees;

	@ManyToOne
	@JoinColumn(name = "dept_id", nullable = false)
	private Department chosenDepartment;

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public Department getChosenDepartment() {
		return chosenDepartment;
	}

	public void setChosenDepartment(Department chosenDepartment) {
		this.chosenDepartment = chosenDepartment;
	}

}
