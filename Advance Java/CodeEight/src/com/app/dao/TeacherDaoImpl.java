package com.app.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Subject;
import com.app.pojos.Teacher;

@Repository
public class TeacherDaoImpl implements TeacherDaoInterface {
	@Autowired
	private SessionFactory sf;

	public TeacherDaoImpl() {
		System.out.println("In DAO constr::");
	}

	@Override
	public List<Teacher> getTeachers() {
		String jpql = "select t from Teacher t";
		return sf.getCurrentSession().createQuery(jpql, Teacher.class).getResultList();
	}

	@Override
	public List<Subject> getSubjects(int teacherID) {

	/*	List<Subject> subjects = sf.getCurrentSession()
				.createQuery("select b from Subject b join fetch a from teacher a where a.id=:id", Subject.class)
				.setParameter("id", teacherID).getResultList();
				*/
		String jpql = "select b from Subject b where b.teacher=:teacher";
		Teacher t = getTeacher(teacherID);
		return sf.getCurrentSession().createQuery(jpql, Subject.class).setParameter("teacher", t).getResultList();
	}

	@Override
	public String updateSubject(Subject sub) {
		try {
			sf.getCurrentSession().update(sub);
		} catch (HibernateException e) {
			throw e;
		}
		return "Succes";
	}

	@Override
	public String addSubject(Subject sub, Teacher t) {
		Session hs = sf.getCurrentSession();
		try {
			hs.update(t);
			t.addSubject(sub);
			return "Subject Added";
		} catch (HibernateException e) {
			throw e;
		}
	}

	@Override
	public String addTeacher(Teacher teach) {
		try {
			sf.getCurrentSession().save(teach);
		} catch (HibernateException e) {
			throw e;
		}
		return "Success";
	}

	@Override
	public Subject getSubject(int subjectId) {
		return sf.getCurrentSession().get(Subject.class, subjectId);
	}

	@Override
	public Teacher getTeacher(int teacherId) {
		return sf.getCurrentSession().get(Teacher.class, teacherId);
	}
}
