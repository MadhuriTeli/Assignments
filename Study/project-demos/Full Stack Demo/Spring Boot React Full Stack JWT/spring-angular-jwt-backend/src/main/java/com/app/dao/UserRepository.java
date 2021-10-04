package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByName(String name);
	@Query("select distinct u from User u join fetch u.roles")
	List<User>findAllUsers();
}
