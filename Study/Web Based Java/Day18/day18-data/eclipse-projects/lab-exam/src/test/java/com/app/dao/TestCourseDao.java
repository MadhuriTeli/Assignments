package com.app.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Course;
import com.app.pojos.Student;

@SpringBootTest
@Transactional
public class TestCourseDao {
	@Autowired
	private EntityManager manager;
	@Autowired
	private IStudentDao studentDao;
	@Autowired
	private ICourseDao courseDao;

	@Test
	@Rollback(false) // to prevent rollback
	public void testLaunchCourse() {
//		Course c = new Course("Full Stack App");
	//	manager.persist(c);
		Course c2 = new Course("Spring Boot");
		manager.persist(c2);
	}

	@Test
	@Rollback(false) //to prevent rollback
	public void testAdmitStudent()
	{
		Student s=new Student("Rama", "Mumbai", LocalDate.of(1993, 1, 23), 8.5);
		studentDao.admitStudent(6, s);
		Student s2=new Student("Kiran", "Delhi", LocalDate.of(1992, 11, 2), 8);
		studentDao.admitStudent(6, s2);		
	}
	@Test
	public void testGetAllCourses()
	{
		courseDao.getAllCourses().forEach(System.out::println);
	}
	@Test
	@Rollback(false)
	public void testCancelCourse()
	{
		courseDao.cancelCourse(4);
	}
	

}
