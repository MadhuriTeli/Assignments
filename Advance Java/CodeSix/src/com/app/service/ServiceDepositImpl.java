package com.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DepositDaoInterface;
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
	public List<Deposit> getDeposit(Date startDate, Date endDate) {
		System.out.println("in service method");
		return dao.getDeposit(startDate, endDate);
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

}
