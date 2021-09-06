package com.app.dao;

import java.util.List;

import com.app.pojos.Course;

public interface ICourseDao {
	List<Course> getAllCourses();

	String cancelCourse(int courseId);
}
