package com.app.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.app.pojos.Address;
import com.app.pojos.Course;
import com.app.pojos.Enrollment;
import com.app.pojos.Student;

public interface IStudentService {
	Student registerStudent(Student s);
	Address assignAddress(Address a);
	Enrollment enrollStudentInCourse(Enrollment e);
	Student getStudentDetails(int id);
	List<Course> findAllCoursesByStduentId(int studentId);
}
