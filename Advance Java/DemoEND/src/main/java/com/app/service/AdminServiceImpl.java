package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IAdminDao;
import com.app.pojos.Admin;

@Service // => spring bean class containing B.L
@Transactional // => automatic Tx management (done by spring supplied hibernate tx mgr
				// configured in hibernate-persistece.xml file
public class AdminServiceImpl implements IAdminService {
	// dependency
	@Autowired // autowire=byType =>SC searches for any spring bean that has imple. IUserDao n
				// supplies it's instance
	private IAdminDao adminDao;

	@Override
	public Admin validateUser(String username, String pass) {
		// TODO Auto-generated method stub
		return adminDao.validateUser(username, pass);
	}

}
