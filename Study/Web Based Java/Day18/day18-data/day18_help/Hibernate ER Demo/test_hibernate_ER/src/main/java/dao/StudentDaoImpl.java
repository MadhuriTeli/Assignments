package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import static utils.HibernateUtils.getFactory;

import java.util.List;

import pojos.Address;
import pojos.AdharCard;
import pojos.Course;
import pojos.EducationalQualification;
import pojos.Student;

public class StudentDaoImpl implements IStudentDao {

	@Override
	public String admitStudent(Student student, String courseName) {
		String mesg = "student admission failed";
		// get session from SF
		String jpql = "select c from Course c where c.title=:title";
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			// get course details from course name
			Course c = session.createQuery(jpql, Course.class).setParameter("title", courseName).getSingleResult();
			student.setCourseEnrolled(c);
			session.persist(student);
			tx.commit();
			mesg = "Student " + student.getName() + " admitted in Course " + courseName + " with Roll No "
					+ student.getId();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public List<Student> getStudentDetailsByCourseName(String title) {
		List<Student> students = null;
		// String jpql="select s from Student s where s.courseEnrolled.title=:title";
		// //cross join
		String jpql = "select s from Student s join fetch s.courseEnrolled c where c.title=:title";// inner join
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			students = session.createQuery(jpql, Student.class).setParameter("title", title).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return students;
	}

	@Override
	public String cancelAdmission(int studentId) {
		String mesg = "Cancel admission failed";
		String jpql = "select a from Address a join fetch a.owner s join fetch s.projects where a.id=:id";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {

			Address a = session.createQuery(jpql, Address.class).setParameter("id", studentId).getSingleResult();
			Student s = a.getOwner();
			session.delete(a);// deleting child rec of address
			// deleting child recs from join table : project_student
			s.getProjects().forEach(p -> p.getStudents().remove(s));
			// finally deleting parent rec of student
			session.delete(s);
//				System.out.println("del student");
			mesg = "Admission cancelled for " + s.getName();

			tx.commit();
		} catch (

		RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public Student getStudentDetails(int studentId) {
		Student s = null;
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			s = session.get(Student.class, studentId);
//			System.out.println(s.getCourseEnrolled().getCapacity());
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return s;
	}

	@Override
	public String linkAdharCard(int studentId, AdharCard card) {
		String mesg = "Linking adhar card failed...";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			// get student details by id
			Student s = session.get(Student.class, studentId);
			if (s != null) {
				// s : persistent
				s.setCard(card);
				mesg = "Linked adhar card to Student " + s.getName();
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
	public String linkOtherDetails(int studentId, List<String> hobbies, List<EducationalQualification> qualifications) {
		String mesg = "Linking additional failed...";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			// get student details by id
			Student s = session.get(Student.class, studentId);
			if (s != null) {
				// s : persistent
				s.setHobbies(hobbies);
				s.setQualifications(qualifications);
				mesg = "Linked details succeeded!";
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
