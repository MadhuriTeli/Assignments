package com.app.services;

import java.util.List;

import com.app.pojos.User;

public interface UserServiceInterface {
	String createUser(User u);
	List<User> userList();
	User getUser(String email);
}
