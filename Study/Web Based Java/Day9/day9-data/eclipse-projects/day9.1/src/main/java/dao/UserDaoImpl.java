package dao;

import pojos.User;
import static utils.HibernateUtils.getFactory;

import java.io.Serializable;

import org.hibernate.*;

public class UserDaoImpl implements IUserDao {
	// NO data members , no constr , no cleanup

	@Override
	public String registerUser(User user) {
		String mesg="User reg failed....";
		// user : state : TRANSIENT
		// get the Sesssion from SF
		Session session = getFactory().openSession();
		Session session2=getFactory().openSession();
		System.out.println(session==session2);//false
		// begin a tx
		Transaction tx = session.beginTransaction();// db cn is pooled out --wrapped in Session obj, L1 cache created
		System.out.println("session is open "+session.isOpen()+" is connected to db cn "+session.isConnected());//t t
		try {
			// org.hibernate.Session API : public Serializable save(Object transientObjRef)
			// throws HibernateExc
			Serializable userId = session.save(user);// user ref is added in the cache : PERSISTENT
			tx.commit();// Upon commit : Hibernate performs "auto dirty checking" :by comparing state of
						// L1 cache with that of DB : DML will be fired (insert)
			mesg="user registered successfully with ID="+userId;
			System.out.println("session is open "+session.isOpen()+" is connected to db cn "+session.isConnected());//t t
			
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (session != null)
				session.close();// pooled out DB cn rets to the pool n L1 cache is destroyed
		}
		System.out.println("session is open "+session.isOpen()+" is connected to db cn "+session.isConnected());//f f
		
		return mesg;
	}
	@Override
	public String registerUserWithGetCurrentSession(User user) {
		String mesg="User reg failed....";
		// user : state : TRANSIENT
		// get the Sesssion from SF
		Session session = getFactory().getCurrentSession();
		Session session2=getFactory().getCurrentSession();
		System.out.println(session==session2);//true
		// begin a tx
		Transaction tx = session.beginTransaction();// db cn is pooled out --wrapped in Session obj, L1 cache created
		System.out.println("session is open "+session.isOpen()+" is connected to db cn "+session.isConnected());//t t
		try {
			// org.hibernate.Session API : public Serializable save(Object transientObjRef)
			// throws HibernateExc
			Serializable userId = session.save(user);// user ref is added in the cache : PERSISTENT
			tx.commit();// Upon commit : Hibernate performs "auto dirty checking" :by comparing state of
						// L1 cache with that of DB : DML will be fired (insert)
			// pooled out DB cn rets to the pool n L1 cache is destroyed
			mesg="user registered successfully with ID="+userId;
			System.out.println("session is open "+session.isOpen()+" is connected to db cn "+session.isConnected());//f f
			
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} 
		System.out.println("session is open "+session.isOpen()+" is connected to db cn "+session.isConnected());//f f
		
		return mesg;
	}
	@Override
	public User getUserDetails(int userId) {
		User user=null;
		// get Session from SF : getCurrentSession
		Session session=getFactory().getCurrentSession();
		//begin tx
		Transaction tx=session.beginTransaction();
		try {
			//get
			user=session.get(User.class,userId);//int ---> Integer --> Serializable
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} 
		return user;
	}
	


}
