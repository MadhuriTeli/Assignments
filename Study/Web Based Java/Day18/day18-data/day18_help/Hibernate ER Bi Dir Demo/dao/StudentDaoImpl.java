package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import static utils.HibernateUtils.getSf;

import pojos.Address;
import pojos.AdharCard;
import pojos.Course;
import pojos.Student;

public class StudentDaoImpl implements IStudentDao {

	@Override
	public String admitNewStudent(String courseName, Student s) {
		String mesg="Student admission failed...";
		String jpql = "select c from Course c where c.title = :nm";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			// get course details from course title(name)
			Course c = session.createQuery(jpql, Course.class).
					setParameter("nm", courseName).getSingleResult();
			//c : PERSISTENT
			//modify state of persistent POJO , by establishing bi dir asso
			c.addStudent(s);
			tx.commit();
			mesg="Student admitted in the course :"+c.getTitle();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String cancelAdmission(int courseId, int studentId) {
		String mesg="Cancelling admission failed!!!!";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			//get course details from course id
			Course c=session.get(Course.class, courseId);
			Student s=session.get(Student.class, studentId);
			//chk for not null
			if(c != null && s!= null)
			{
				c.removeStudent(s);
				mesg="Cancelled "+s.getName()+"'s admission";
			}
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String admitNewStudentWithAddress(String courseName, Student s, Address a) {
		String mesg="Student admission with adr  failed...";
		String jpql = "select c from Course c where c.title = :nm";
	
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			Course c = session.createQuery(jpql, Course.class).
					setParameter("nm", courseName).getSingleResult();
			//c : PERSISTENT
			a.setCurrentStudent(s);//linking adr ----> student
			c.addStudent(s);
			//since can't specify cascade optiojn in Student , persist adr details explicitly
			session.persist(a);
			tx.commit();
			mesg="student admission done!";
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String linkAdharCard(int studentId, AdharCard details) {
		String mesg="Adhar Card linking failed...";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			//get student details from it's id
			Student s =session.get(Student.class, studentId);
			//chk if student exists
			if(s != null) {
				s.setCard(details);
				mesg="Linked adhar card details for student "+s.getName();
			}
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}
	

}
