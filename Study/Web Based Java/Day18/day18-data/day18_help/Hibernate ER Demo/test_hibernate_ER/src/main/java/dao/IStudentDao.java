package dao;

import java.util.List;

import pojos.AdharCard;
import pojos.EducationalQualification;
import pojos.Student;

public interface IStudentDao {
	String admitStudent(Student student, String courseName);

	/*
	 * Display all student details from a specific course i/p : course title
	 */
	List<Student> getStudentDetailsByCourseName(String title);
	
	

	/*
	 * 4. Cancel Admission i/p : student id
	 */
	String cancelAdmission(int studentId);

	// get student details by id
	Student getStudentDetails(int studentId);

	// link adhar card details to a student
	String linkAdharCard(int studentId, AdharCard card);

	// link hobbies n edu qualifications to a student
	String linkOtherDetails(int studentId, List<String> hobbies, List<EducationalQualification> qualificarions);

}
