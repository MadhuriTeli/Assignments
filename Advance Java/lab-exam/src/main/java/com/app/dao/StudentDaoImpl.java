package com.app.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Course;
import com.app.pojos.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {
	// dependency
	@Autowired
	private EntityManager manager;

	@Override
	public String admitStudent(int courseId, Student s) {
		// get Course from course id
		Course course = manager.find(Course.class, courseId);
		if (course != null) {
			s.setSelectedCourse(course);
			manager.persist(s);
			return "Student Admitted";
		}
		return "Student Admission failed : Invalid Course";
	}

}
