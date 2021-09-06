package com.app.dao;

import java.util.List;

import com.app.pojos.User;


public interface UserDaoInterface {
	String createUser(User u);
	List<User> userList();
	User getUser(String email);
}
