package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Emp;

public interface EmpRepository extends JpaRepository<Emp,Integer> {

}
