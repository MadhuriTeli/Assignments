package dao;

import pojos.Address;
import pojos.AdharCard;
import pojos.Student;

public interface IStudentDao {
	//add a method for student admission
	String admitNewStudent(String courseName,Student s);
	//add a method for removing student details
	String cancelAdmission(int courseId,int studentId);
	//add a method for student admission + address details
	String admitNewStudentWithAddress(String courseName,Student s,Address a);
	//adda method to link adhar card information to student
	String linkAdharCard(int studentId,AdharCard details);
}
