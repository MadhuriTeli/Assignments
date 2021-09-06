package com.app.dao;


import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Admin;

@Repository // to tell SC : following class is a spring bean that contains data access logic + enables exc
			// translation mechanism
public class AdminDaoImpl implements IAdminDao {
	// dependency : D.I
	@Autowired // byType
	private EntityManager manager;//equivalent to org.hibernate.Session , associated with L1 cache n 
	//represents pooled out DB connection : from connection pool managed by Hikari 

	@Override
	public Admin validateUser(String username, String pass) {
		String jpql="select a from Admin a where a.username=:un and a.password=:pass";
		
		return manager.
				createQuery(jpql, Admin.class).
				setParameter("un", username).
				setParameter("pass",pass).getSingleResult();
	}

}
