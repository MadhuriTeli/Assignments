package com.app.service;

import com.app.pojos.User;

public interface IUserService {
	void saveUser(User u);
	User findByUserName(String name);
}
