package dao;

import pojos.Address;
import pojos.Student;

import org.hibernate.Session;
import org.hibernate.Transaction;
import static utils.HibernateUtils.getFactory;

public class AddressDaoImpl implements IAddressDao {

	@Override
	public String linkStudentAddressDetails(int studentId, Address a) {
		String mesg="linking address failed";
		// get session from SF
		Session session=getFactory().getCurrentSession();
		//begin tx
		Transaction tx=session.beginTransaction();
		try {
			Student s=session.get(Student.class, studentId);
			if(s != null)
			{
				a.setOwner(s);
				session.persist(a);
				mesg="Address linked to Student "+s.getName();
			}
		
			tx.commit();
		}catch (RuntimeException e) {
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String updateCity(int studentId, String city) {
		String mesg="Address updation failed";
		// get session from SF
		Session session=getFactory().getCurrentSession();
		//begin tx
		Transaction tx=session.beginTransaction();
		try {
			Address a=session.get(Address.class, studentId);
			if(a != null)
			{
				a.setCity(city);
				mesg="Address updated";
			}
					
			tx.commit();
		}catch (RuntimeException e) {
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}
	

}
