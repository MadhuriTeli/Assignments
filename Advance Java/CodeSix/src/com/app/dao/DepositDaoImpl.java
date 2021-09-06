package com.app.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Deposit;
import com.app.pojos.User;

@Repository
public class DepositDaoImpl implements DepositDaoInterface {
	@Autowired
	private SessionFactory sf;
	
	@Override
	public User validateUser(String usernm, String pass) {
		System.out.println("in dao's validate method");
		String jpql="select u from User u where u.username=:usernm AND u.password=:pass";
		User u=new User();
		try {
			u=sf.getCurrentSession().createQuery(jpql, User.class).setParameter("usernm", usernm).setParameter("pass",pass).getSingleResult();
			return u; 
		}catch(NoResultException e){
			throw e;
		}
	}
	@Override
	public List<Deposit> getDeposit(Date startDate, Date endDate) {
		String jpql = "select d from Deposit d where d.maturity between :start and :end";
		List<Deposit> deposits = null;
		try {
			deposits = sf.getCurrentSession().createQuery(jpql, Deposit.class).setParameter("start", startDate).setParameter("end", endDate).getResultList();
		
		}catch(RuntimeException e) {
			throw e;
		}
		return deposits;
	}
	@Override
	public String registerUser(User u) {
		try {
			sf.getCurrentSession().persist(u);
		}catch(HibernateException e) {
			throw e;
		}
		return "successfully registered";
	}
	@Override
	public String addDeposit(User u, Deposit d) {
		System.out.println("in dao:create account");
		Session hs=sf.getCurrentSession();
		try {
		hs.update(u);
		u.addDeposit(d);
		return "Account created";
		}catch(HibernateException e) {
			throw e;
		}
	}

}
