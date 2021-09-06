package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	private Integer addressId;
	private String city;
	private String state;
	private User user;
	
	public Address() {
		System.out.println("in constr address");
	}
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	
	@Column(length = 20)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(length = 20)
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@OneToOne(mappedBy="address")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + "]";
	}
	
}
