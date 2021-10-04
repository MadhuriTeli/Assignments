package com.app.dao;


import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.pojos.Course;
@SpringBootTest
class EnrollmentRepositoryTest {
	@Autowired
	private EnrollmentRepository repo;

	@Test
	void test() {
		List<Course> allCourses = repo.findAllCoursesByStduentId(10);
		allCourses.forEach(System.out::println);
		assertEquals(2, allCourses.size());
	}

}
