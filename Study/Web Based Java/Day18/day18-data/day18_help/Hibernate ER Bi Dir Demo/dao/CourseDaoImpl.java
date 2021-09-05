package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Course;
import static utils.HibernateUtils.getSf;

import java.util.List;

public class CourseDaoImpl implements ICourseDao {

	@Override
	public String launchNewCourse(Course c) {
		String mesg = "Launching course failed ";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			session.persist(c);
			tx.commit();
			mesg = "Launched new course with id " + c.getId();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public List<String> getAllCourseNames() {
		List<String> courseNames = null;
		String jpql = "select c.title from Course c";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			courseNames = session.createQuery(jpql, String.class).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return courseNames;
	}

	@Override
	public String deleteCourseByName(String courseName) {
		String mesg = "Cancelling course failed ....";
		String jpql = "select c from Course c where c.title=:ti";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			Course c = session.createQuery(jpql, Course.class).setParameter("ti", courseName).getSingleResult();
			// c : PERSISTENT
			session.delete(c);// c : marked for removal
			tx.commit();
			mesg = "Course " + courseName + " cancelled successfully";
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public Course getCourseDetails(String courseName) {
		Course c = null;
		String jpql = "select c from Course c where c.title=:ti";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			c = session.createQuery(jpql, Course.class).setParameter("ti", courseName).getSingleResult();
			//c : persistent
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return c;//c : DETACHED
	}

	@Override
	public Course getCourseStudentDetails(String courseName) {
		Course c = null;
		String jpql = "select c from Course c left outer join fetch c.students where c.title=:ti";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			c = session.createQuery(jpql, Course.class).setParameter("ti", courseName).getSingleResult();
			//c : persistent
	//		c.getStudents().size();//accessing size of the collection within the session scope
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return c;//c : DETACHED
	}
	

}
