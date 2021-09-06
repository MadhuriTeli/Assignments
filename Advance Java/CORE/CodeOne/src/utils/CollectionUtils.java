package utils;

import static java.time.LocalDate.now;
import static java.time.LocalDate.of;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import pojo.Student;
import static utils.validationUtils.validateStudent;
public class CollectionUtils {
	public static List<Student> populateList() throws Exception {
		List<Student> l1 = new ArrayList<>();
		l1.add(validateStudent("varun", 21, courseList() , "01/12/2012",l1));
		l1.add(validateStudent("sa", 25, courseList() , "02/08/2004",l1));
		
		return l1;
	}
	
	public static List<String> courseList() {
		List<String> c1 = new ArrayList<>();
		c1.add("dac");
		c1.add("ditiss");
		c1.add("english");
		return c1;

	}

}
