package com.app.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.RoleRepository;
import com.app.dao.UserRepository;
import com.app.dto.ResponseDTO;
import com.app.pojos.Role;
import com.app.pojos.User;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private UserRepository repo;
	@Autowired
	private RoleRepository repo2;
	@Autowired
	private PasswordEncoder encoder;

	@PostMapping("/roles")
	public ResponseEntity<?> addRoles(@RequestBody List<Role> roles) {
		System.out.println("add roles " + roles);
		repo2.saveAll(roles);
		return new ResponseEntity<ResponseDTO>(new ResponseDTO("Roles added", LocalDateTime.now()), HttpStatus.CREATED);
	}

	// only admin can add users under the chosen role/s
	@PostMapping("/users")
	public ResponseEntity<?> addUser(@RequestBody User u) {
		System.out.println("add user " + u);
		// pwd encoding using BCrypt encoder , created in sec config class
		u.setPassword(encoder.encode(u.getPassword()));
		System.out.println(u.getRoles());
		return new ResponseEntity<>(repo.save(u), HttpStatus.CREATED);

	}
	@GetMapping("/users")
	public List<User> getUsers()
	{
		return repo.findAllUsers();
	}
}
