package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	//@Query("select distinct f from Faculty f join fetch f.roles where f.userName=:nm")
	//Optional<Faculty> findByFacultyName(@Param("nm") String facultyName);

}
