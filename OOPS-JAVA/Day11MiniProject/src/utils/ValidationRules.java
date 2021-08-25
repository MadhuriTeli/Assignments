package utils;

import static com.app.student.Student.sdf;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import com.app.core.Customer;
import com.app.custom_exception.StudentHandlingException;
import com.app.student.Student;
import com.app.student.StudentCourses;

import custom_exception.CustomerHandlingException;

public class ValidationRules {
	public static final int MIN_LENGTH;
	public static final int MAX_LENGTH;
	public static Date thresholdDate;
	static {
		MIN_LENGTH = 5;
		MAX_LENGTH = 10;
		try {
			thresholdDate = sdf.parse("1-1-1999");
		} catch (ParseException e) {
			System.out.println("err in static init block " + e);
		}
	}

	public static String validatePRN(String prnNo, ArrayList<Student> std) throws StudentHandlingException {
		Student st = new Student(prnNo);
		// System.out.println(std.contains(st)?"PRN Exist":"New PRN");
		System.out.println(std.contains(st));
		if (std.contains(st))

			throw new StudentHandlingException("PRN Exists Already!!");
		return prnNo; // System.out.println(std.contains(st));
	}

	public static String validateEmail(String email) throws StudentHandlingException {
		if (email.length() < MIN_LENGTH || email.length() > MAX_LENGTH) {
			throw new StudentHandlingException("Invalid Email");
		}
		return email;
	}

	public static String validatePassWord(String password) throws StudentHandlingException {
		if (password.length() >= MIN_LENGTH && (password.contains("@") || password.contains("#")
				|| password.contains("$") || password.contains("%") || password.contains("*")))
			return password;
		throw new StudentHandlingException("Invalid Password");

	}

	/*
	 * course : a valid course name having available capacity , to admit a new
	 * studentmin GPA : 7 dup student validation
	 */
	public static double validateGPA(double gpa) throws StudentHandlingException {
		if (gpa < 7) {
			throw new StudentHandlingException("Invalid GPA");
		}
		return gpa;
	}

	public static Date convertDate(String dob) throws ParseException, StudentHandlingException {
		Date d1 = sdf.parse(dob);
		if (d1.after(thresholdDate))
			throw new StudentHandlingException("Invalid Date");
		return d1;
	}

	public static StudentCourses validateCourses(String course) throws StudentHandlingException {
		try {
			return StudentCourses.valueOf(course.toUpperCase());
		} catch (IllegalArgumentException e) {
			StringBuilder sb = new StringBuilder("Invalid Category Chosen \n");
			sb.append("Valid Categories: \n");
			sb.append(Arrays.toString(StudentCourses.values()));
			throw new StudentHandlingException(sb.toString());
		}
//			System.out.println(StudentCourses.valueOf(course).getCapacity() );
//			if (StudentCourses.valueOf(course).getCapacity() != 0) {
//				StudentCourses.setCapacity(StudentCourses.valueOf(course).getCapacity() - 1);
//				return StudentCourses.valueOf(course.toUpperCase());
//			}
//			else {
//				throw new StudentHandlingException("Course capaciy full!!");
//			}

	}
	
	
	public static Student findStudentByPRN(String prn,ArrayList<Student> std) throws StudentHandlingException
	{
		//done by Customer's equals
		//create customer instance by wrapping email (unique id)
		Student c1=new Student(prn);
		for(Student c: std)
			if(c != null && c.equals(c1))
				return c;
		throw new StudentHandlingException("Customer not found : invalid email id!!!!!!");
				
		
	}
}
