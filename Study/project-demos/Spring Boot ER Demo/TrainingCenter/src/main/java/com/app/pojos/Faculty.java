package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "faculty_dtls")
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	@Column(length = 30)
	private String name;
	private int expInYears;
	@Column(length = 30)
	private String domain;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExpInYears() {
		return expInYears;
	}
	public void setExpInYears(int expInYears) {
		this.expInYears = expInYears;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", expInYears=" + expInYears + ", domain=" + domain + "]";
	}
	

}
