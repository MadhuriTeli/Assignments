package com.app.service;

import com.app.pojos.User;

public interface IUserService {
	User registerStudentUser(int userId);
	User authenticateUser(int userId,String pwd);
}
