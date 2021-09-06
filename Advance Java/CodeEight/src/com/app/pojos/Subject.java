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
@Table(name="subject")
public class Subject {
	private Integer id;
	private String name;
	private Integer duration;
	private String course;
	
	private Teacher teacher;

	public Subject() {
		super();
	}
	
	public Subject(String name, Integer duration, String course) {
		super();
		this.name = name;
		this.duration = duration;
		this.course = course;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(length=20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(length=5)
	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}


	@Column(length=30)
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@ManyToOne
	@JoinColumn(name="tid")
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", duration=" + duration + ", course=" + course + "]";
	}

	
}
