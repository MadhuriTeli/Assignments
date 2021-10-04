package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Optional<Department> findByDeptName(String departmentName);

}
