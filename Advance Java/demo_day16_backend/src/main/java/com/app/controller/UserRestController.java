package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.app.service.IUserService;

import com.app.dto.ErrorResponse;
import com.app.dto.ResponseDTO;
import com.app.pojos.User;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserRestController {

	// dependency : service layr i/f
	@Autowired
	private IUserService userService;

	public UserRestController() {
		System.out.println("in ctor" + getClass().getName());
	}

	// add REST API endpoint for getting all users
	@GetMapping
	public List<User> fetchAllUsers() {
		System.out.println("In fetch all users");
		return userService.getAllUsers();
	}

	// add Rest API endpoint for adding new user (create new resource)
	@PostMapping
	public ResponseEntity<?> addNewUserDetails(@RequestBody User transientUser) {
		System.out.println("In add new User" + transientUser);
		try {
			return new ResponseEntity<>(userService.addUser(transientUser), HttpStatus.CREATED);
		} catch (RuntimeException e) {
			System.out.println("err in add" + e);
			return new ResponseEntity<>(new ErrorResponse("Adding User Failed!!", e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	// add REST API to delete user details by id
	@DeleteMapping("/{userId}") // URI template var
	public ResponseEntity<ResponseDTO> deleteUserDetails(@PathVariable int userId) {
		System.out.println("in delete user details " + userId);
		// invoke service layer method for deleting user details
		// return new ResponseEntity<>(new ResponseDTO(userService.deleteUser(userId)),
		// HttpStatus.OK);
		return ResponseEntity.ok(new ResponseDTO(userService.deleteUser(userId)));
	}

	// add REST API to get user details by id
	@GetMapping("/{id}")
	public ResponseEntity<?> getUserDetails(@PathVariable int id) {
		System.out.println("In get user details " + id);
		try {
			return ResponseEntity.ok(userService.getDetails(id));
		} catch (RuntimeException e) {
			System.out.println("err in get" + e);
			return new ResponseEntity<>(new ErrorResponse("Fetching User Details failed", e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}
	}

	// add rest api to upsate existing user detailos
	@PutMapping("/{id}")
	public ResponseEntity<?> updateUserDetails(@RequestBody User detachedUser, @PathVariable int id) {
		System.out.println("In update" + detachedUser + " " + id);
		try {
			//invoking service layer method for validating user id
			User existingUser = userService.getDetails(id);
			//=> user is valid, invoke setters toupdate the state
			//exsting => user details fetched from db
			//detached => user details update by user in frontend
			return ResponseEntity.ok(userService.updateUser(existingUser, detachedUser));
		
		} catch (RuntimeException e) {
			System.out.println("err in get" + e);
			return new ResponseEntity<>(new ErrorResponse("Updating User Details failed", e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}
	 

	}
}
