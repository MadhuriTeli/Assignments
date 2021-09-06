package com.app.service;

import com.app.pojos.Admin;

public interface IAdminService {
	// add a method for user validation
	Admin validateUser(String username, String pass);
}
