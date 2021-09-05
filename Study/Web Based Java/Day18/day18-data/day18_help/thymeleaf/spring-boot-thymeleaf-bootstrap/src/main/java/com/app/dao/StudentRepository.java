package com.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
    
    List<Student> findByName(String name);
    
}
