package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.User;
import com.app.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@PostMapping
	public ResponseEntity<?> authenticateUser(@RequestBody User u)
	{
		System.out.println("in auth user "+u);
		return ResponseEntity.ok(userService.authenticateUser(u.getId(), u.getPassword()));
	}
	
}
