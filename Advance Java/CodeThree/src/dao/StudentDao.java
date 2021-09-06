package dao;

import java.util.List;

import pojo.Student;

public interface StudentDao {
	String register(Student s) throws Exception;
	List<Student> getStudent(String city) throws Exception;
}
