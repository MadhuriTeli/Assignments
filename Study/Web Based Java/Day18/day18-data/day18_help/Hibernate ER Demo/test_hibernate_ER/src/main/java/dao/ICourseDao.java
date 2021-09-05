package dao;

import pojos.Course;

public interface ICourseDao {
	String launchNewCourse(Course course);
	/*
	 * Cancel Course
	 */
	String cancelCourse(String courseTitle);
}
