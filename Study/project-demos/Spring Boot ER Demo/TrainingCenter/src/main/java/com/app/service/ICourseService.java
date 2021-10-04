package com.app.service;

import java.util.List;

import com.app.pojos.Course;

public interface ICourseService {
	Course launchNewCourse(Course c);
	Course getCourseDetails(String courseName);
	List<Course> getAllCourses();
}
