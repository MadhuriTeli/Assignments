package utils;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import custException.StudentCustomException;
import pojo.Student;

public class validationUtils {
	public static LocalDate currentDate;
	public static DateTimeFormatter sdf;
	
	static {
		sdf = DateTimeFormatter.ofPattern("d/M/yyyy");
		currentDate = LocalDate.now();
		System.out.println("In Constr validationUtils");
	}
	
	public static Student validateStudent(String name, int age,List<String> courses,String regDate,List<Student> list) throws StudentCustomException {				
		LocalDate date = validateDate(regDate);	
		
		Student s = new Student(name,age,date,courses);

		checkDuplicate(list,s);

		return s;
	}
	
	public static void checkDuplicate(List<Student> list,Student s) throws StudentCustomException{
		if(list.contains(s))
			throw new StudentCustomException("Student Already Exist");
		
	}
	
	public static LocalDate validateDate(String date) throws StudentCustomException {
		LocalDate dt = LocalDate.parse(date, sdf);;

		if(dt.isAfter(currentDate)) 
			throw new StudentCustomException("Invalid Registration Date");
		
		return dt;
	}	
}
