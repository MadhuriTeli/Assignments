package com.app.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Admin;

@Repository
@Transactional
public class AdminDaoImpl implements IAdminDao{
@Autowired
private EntityManager mgr;
	
	@Override
public Admin adminLogin(String userName, String password) {
	// TODO Auto-generated method stub
		String jpql="select a from Admin a where a.userName=:un and a.password=:pwd";
	
	return 	mgr.createQuery(jpql, Admin.class).setParameter("un", userName).setParameter("pwd", password).getSingleResult();
}
}
