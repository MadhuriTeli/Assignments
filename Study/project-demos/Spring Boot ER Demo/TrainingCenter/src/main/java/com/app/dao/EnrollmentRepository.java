package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Course;
import com.app.pojos.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {
	@Query("select e.course from Enrollment e where e.student.id=:id")
	List<Course> findAllCoursesByStduentId(@Param("id") int studentId);
}
