package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.DepartmentRepository;
import com.app.pojos.Department;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private DepartmentRepository deparmentRepo;
	
	

		@PostMapping("/department")
	public ResponseEntity<?> addDepartment(@RequestBody Department department)
	{
		System.out.println("in add dept ");
		return ResponseEntity.ok(deparmentRepo.save(department));
		
	}
}
