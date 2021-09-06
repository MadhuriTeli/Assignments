package com.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DepositDaoInterface;
import com.app.pojos.Address;
import com.app.pojos.Deposit;
import com.app.pojos.User;
@Service
@Transactional
public class ServiceDepositImpl implements ServiceDepositInterface {
	@Autowired
	private DepositDaoInterface dao;
	@Override
	public User validateUser(String usernm, String pass) {
		System.out.println("in service method");
		return dao.validateUser(usernm, pass);
	}

	@Override
	public List<Deposit> getDeposit(Date startDate, Date endDate,User u) {
		System.out.println("in service method");
		return dao.getDeposit(startDate, endDate,u);
	}

	@Override
	public Address getAddress(User u) {
		System.out.println("in service method");
		return dao.getAddress(u);
	}

	@Override
	public String registerUser(User u) {
		System.out.println("in service method");
		return dao.registerUser(u);
	}

	@Override
	public String addDeposit(User u, Deposit d) {
		System.out.println("in service method");
		return dao.addDeposit(u, d);
	}
	
	@Override
	public String addAddress(User u, Address d) {
		System.out.println("in service method");
		return dao.addAddress(u, d);
	}

}
