package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserDaoInterface;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements UserServiceInterface{
	@Autowired
	private UserDaoInterface dao;
	
	public UserServiceImpl() {
		System.out.println("In Service Constr::");
	}

	@Override
	public String createUser(User u) {
		return dao.createUser(u);
	}

	@Override
	public List<User> userList() {
		return dao.userList();
	}

	@Override
	public User getUser(String email) {
		return dao.getUser(email);
	}
	
}
