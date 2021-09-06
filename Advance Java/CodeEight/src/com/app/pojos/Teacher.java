package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {
	private Integer id;
	private String name;
	
	private List<Subject> subjects = new ArrayList<>();
	
	public Teacher() {
		System.out.println("In Teacher Constr::");
	}

	public Teacher(Integer teacherID, String teacherName) {
		super();
		this.id = teacherID;
		this.name = teacherName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length=50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Mapping
	@OneToMany(mappedBy="teacher",cascade=CascadeType.ALL)
	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public void addSubject(Subject d) {
		subjects.add(d);
		d.setTeacher(this);
	}
	
	public void removeSubject(Subject d) {
		subjects.remove(d);
		d.setTeacher(null);
	}

	@Override
	public String toString() {
		return "Teacher [teacherID=" + id + ", teacherName=" + name + "]";
	}
	
	
}
