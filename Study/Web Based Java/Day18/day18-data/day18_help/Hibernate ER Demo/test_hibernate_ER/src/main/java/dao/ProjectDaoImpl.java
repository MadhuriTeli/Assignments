package dao;

import static utils.HibernateUtils.getFactory;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Project;
import pojos.Student;

public class ProjectDaoImpl implements IProjectDao {

	@Override
	public String startNewProject(Project p) {
		String mesg = "project launching failed";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			session.persist(p);
			tx.commit();
			mesg = "New project luached with ID " + p.getId();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String addStudentToProject(String projectTitle, String email) {
		String mesg = "Adding student to project failed";
		String findProject = "select p from Project p where p.projectTitle=:title";
		String findStudent = "select s from Student s where s.email=:email";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			Project p = session.createQuery(findProject, Project.class).setParameter("title", projectTitle)
					.getSingleResult();
			Student s = session.createQuery(findStudent, Student.class).setParameter("email", email).getSingleResult();
			p.getStudents().add(s);
			tx.commit();
			mesg = "Student " + s.getName() + " added to Project " + projectTitle;
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String removeStudentFromProject(String projectTitle, String email) {
		String mesg = "Removing student to project failed";
		String findProject = "select p from Project p where p.projectTitle=:title";
		String findStudent = "select s from Student s where s.email=:email";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			Project p = session.createQuery(findProject, Project.class).setParameter("title", projectTitle)
					.getSingleResult();
			Student s = session.createQuery(findStudent, Student.class).setParameter("email", email).getSingleResult();
			p.getStudents().remove(s);
			tx.commit();
			mesg = "Student " + s.getName() + " removed from Project " + projectTitle;
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public Set<Student> getStudentDetailsByProject(String projectTitle) {
		Set<Student> students = null;
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			students = session.createQuery("select p from Project p join fetch p.students where p.projectTitle=:title",
					Project.class).setParameter("title", projectTitle).getSingleResult().getStudents();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return students;
	}

	@Override
	public Project getProjectDetails(String projectTitle) {
		Project p = null;
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			p = session.createQuery("select p from Project p where p.projectTitle=:title", Project.class)
					.setParameter("title", projectTitle).getSingleResult();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return p;
	}

	@Override
	public String cancelProject(int projectId) {
		String mesg="Cancelling project failed";
		String jpql = "select p from Project p join fetch p.students s where p.id=:id";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			Project p = session.createQuery(jpql, Project.class).setParameter("id", projectId).getSingleResult();
			
				// before deleting parent rec in projects table , delete child recs in
				// project_student table
				p.getStudents().forEach(s -> s.getProjects().remove(p));
				
				session.delete(p);
				mesg="cancelled project "+p.getProjectTitle();
			
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

}
