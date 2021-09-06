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
@Table(name="user")
public class User {
	private Integer userId;
	private String username;
	private String password;
	private String role;
	
	//One User to Many Deposit
	List<Deposit> deposit = new ArrayList<>();

	public User()
	{
		super();
		System.out.println("in usr's def ctor");
	}
	
	public User(Integer userId, String username, String password, String role, List<Deposit> deposit) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.role = role;
		this.deposit = deposit;
	}

	public User( String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getUserId() {
		return userId;
	}



	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	@Column(length=20)
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}


	@Column(length=20)
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}


	@Column(length=10)
	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}


	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL) 
	public List<Deposit> getDeposit() {
		return deposit;
	}

	public void setDeposit(List<Deposit> deposit) {
		this.deposit = deposit;
	}

	public void addDeposit(Deposit d) {
		deposit.add(d);
		d.setUser(this);
		
	}
	public void removeDeposit(Deposit d)
	{
		deposit.remove(d);
		d.setUser(null);
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", role=" + role
				+"]";
	}
	
	
	
}
