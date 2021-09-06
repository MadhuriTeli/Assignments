package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="new_courses")
public class Course extends BaseEntity {
	@Column(length = 30,unique =true)
	private String title;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(String title) {
		super();
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Course "+getId()+" [title=" + title + "]";
	}
	

}
