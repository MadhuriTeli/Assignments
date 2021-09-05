package dao;

import java.util.List;

import pojos.Course;

public interface ICourseDao {
	String launchNewCourse(Course c);
	//add a method to get list of all course names
	List<String> getAllCourseNames();
	//add a method to method to delete course by it's name
	String deleteCourseByName(String courseName);
	//add a method to display ONLY course details by name
	Course getCourseDetails(String courseName);
	//add a method to display  course+ student  details by name
		Course getCourseStudentDetails(String courseName);
}
