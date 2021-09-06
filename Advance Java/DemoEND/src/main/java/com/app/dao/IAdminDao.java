package com.app.dao;

import com.app.pojos.Admin;

public interface IAdminDao {
//add a method for user validation
	Admin validateUser(String username,String pass);
}
