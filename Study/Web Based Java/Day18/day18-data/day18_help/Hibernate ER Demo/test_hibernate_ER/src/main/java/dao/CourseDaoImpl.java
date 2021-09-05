package dao;

import static utils.HibernateUtils.getFactory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Address;
import pojos.Course;
import pojos.Student;

public class CourseDaoImpl implements ICourseDao {

	@Override
	public String launchNewCourse(Course course) {
		String mesg = "Course launchin failed ";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			session.persist(course);
			tx.commit();
			mesg = "Course " + course.getTitle() + " launched successfully with ID " + course.getId();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String cancelCourse(String courseTitle) {
		String mesg = "Course cancellation failed!!!";
		String jpql = "select s from Student s join fetch s.courseEnrolled c where c.title=:title";
		String jpql2 = "select a from Address a join fetch a.owner s join fetch s.projects where a.id=:id";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			List<Student> students = session.createQuery(jpql, Student.class).
					setParameter("title", courseTitle)
					.getResultList();
			//Assuming that at lease 1 student exists in the course
			Course c = students.get(0).getCourseEnrolled();
			students.forEach(s -> {
				// Thanks to share PK : student n address recs share the SAME PK
				// getting address (child rec of student) rec
				Address a = session.createQuery(jpql, Address.class).setParameter("id", s.getId()).getSingleResult();
				//Assumption : address has been assigned to the student (o.w : NoResultExc)
				session.delete(a);// deleting child rec of address
				// deleting child recs from join table : project_student
				s.getProjects().forEach(p -> p.getStudents().remove(s));
				// finally deleting parent rec of student
				session.delete(s);
			});
			// all child student recs are marked for deletion
			// deleting parent rec : course
			session.delete(c);
			tx.commit();
			mesg = "Course cancelled " + courseTitle;
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

}
