package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

//	@Query("select distinct c from Course c join fetch c.courseId where c.courseName=:nm")
//	Optional<Course> findByCourseName(@Param("nm") String courseName);
	Optional<Course> findByName(String courseName);

}
