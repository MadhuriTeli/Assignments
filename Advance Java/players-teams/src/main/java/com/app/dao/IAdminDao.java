package com.app.dao;

import com.app.pojos.Admin;

public interface IAdminDao {
Admin adminLogin(String userName,String password);
}
