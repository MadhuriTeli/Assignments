package com.app.service;

import java.util.Date;
import java.util.List;

import com.app.pojos.Deposit;
import com.app.pojos.User;

public interface ServiceDepositInterface {
	User validateUser(String usernm,String pass);
	List<Deposit> getDeposit(Date startDate,Date endDate);
	String registerUser(User u);
	String addDeposit(User u,Deposit d);

}
