package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bank_accts")
public class BankAccount extends BaseEntity{
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private AcctType acctType;
	private double balance;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cust_id")
	private Customer acctOwner;
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	public BankAccount(AcctType acctType, double balance) {
		super();
		this.acctType = acctType;
		this.balance = balance;
	}
	
	public AcctType getAcctType() {
		return acctType;
	}
	public void setAcctType(AcctType acctType) {
		this.acctType = acctType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Customer getAcctOwner() {
		return acctOwner;
	}
	public void setAcctOwner(Customer acctOwner) {
		this.acctOwner = acctOwner;
	}
	@Override
	public String toString() {
		return "BankAccount [acctType=" + acctType + ", balance=" + balance + ", getId()=" + getId() + "]";
	}
	
	
}
