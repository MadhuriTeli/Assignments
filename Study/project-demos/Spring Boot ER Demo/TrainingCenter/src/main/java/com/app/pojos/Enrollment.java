package com.app.pojos;

import java.time.LocalDate;
import javax.persistence.*;

import org.springframework.data.web.JsonPath;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "enrollment_dtls")
public class Enrollment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	private LocalDate enrollmentDate;
	@ManyToOne
	@JoinColumn(name="student_id")
	@JsonIgnore
	private Student student;
	@ManyToOne
	@JoinColumn(name="course_id")
	@JsonIgnore
	private Course course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	@JsonIgnore
	public Student getStudent() {
		return student;
	}
	
	@JsonProperty
	public void setStudent(Student student) {
		this.student = student;
	}
	@JsonIgnore
	public Course getCourse() {
		return course;
	}
	
	@JsonProperty
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Enrollment [id=" + id + ", enrollmentDate=" + enrollmentDate + "]";
	}
	

}
