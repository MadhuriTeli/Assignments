package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Course;
import com.app.pojos.Student;

@Repository
@Transactional
public class CourseDaoImpl implements ICourseDao {
	// dependency
	@Autowired
	private EntityManager manager;

	@Override
	public List<Course> getAllCourses() {
		String jpql = "select c from Course c";
		return manager.createQuery(jpql, Course.class).getResultList();
	}

	@Override
	public String cancelCourse(int courseId) {
		// get Course from course id
		Course course = manager.find(Course.class, courseId);
		if (course != null) {
			String jpql = "select s from Student s where s.selectedCourse.id=:id";
			manager.createQuery(jpql, Student.class).setParameter("id", courseId).getResultList()
					.forEach(s -> manager.remove(s));// removing child  recs
			manager.remove(course);// removing parent rec
			return "Course Cancelled!!!";

		}
		return "Course Cancellation Failed";
	}

}
