package com.app.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="deposit")
public class Deposit {
	private Integer accountId;

	private double balance;
	
	private Date maturity;
	private String bankName;
	
	//Many Deposit to One User
	private User user;
	
	public Deposit() {
		super();
		System.out.println("in deposit's def ctor");
	}

	public Deposit(Integer accountId, double balance, Date maturity, String bankName, User user) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.maturity = maturity;
		this.bankName = bankName;
		this.user = user;
	}

	public Deposit(double balance, Date maturity, String bankName) {
		super();
		this.balance = balance;
		this.maturity = maturity;
		this.bankName = bankName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getAccountId() {
		return accountId;
	}


	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	@Column(columnDefinition="Double(7,2)")
	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public Date getMaturity() {
		return maturity;
	}


	public void setMaturity(Date maturity) {
		this.maturity = maturity;
	}

	@Column(length=10)
	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@ManyToOne
	@JoinColumn(name="userId")
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Deposit [accountId=" + accountId + ", balance=" + balance + ", maturity=" + maturity + ", bankName="
				+ bankName + "]";
	}
	
	
}
