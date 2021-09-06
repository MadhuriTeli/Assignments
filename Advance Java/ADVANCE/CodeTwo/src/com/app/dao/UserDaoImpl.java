package com.app.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.User;

@Repository
public class UserDaoImpl implements UserDaoInterface{
	@Autowired
	private SessionFactory sf;

	public UserDaoImpl() {
		System.out.println("In DAO constr::");
	}
	@Override
	public String createUser(User u) {
		try {
			sf.getCurrentSession().save(u);
		}catch(HibernateException e) {
			throw e;
		}
		return "success";
	}

	@Override
	public List<User> userList() {
		String jpql = "select u from User u where u.role!=:roles";
		return sf.getCurrentSession().createQuery(jpql,User.class).setParameter("roles", "admin").getResultList();
	}

	@Override
	public User getUser(String email) {
		String jpql = "select u from User u where u.email=:emails";
		return sf.getCurrentSession().createQuery(jpql, User.class).setParameter("emails", email).getSingleResult();
	}
}
