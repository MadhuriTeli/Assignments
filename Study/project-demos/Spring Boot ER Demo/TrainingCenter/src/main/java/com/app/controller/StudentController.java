package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.ICourseService;
import com.app.service.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private IStudentService studentService;
	@Autowired
	private ICourseService courseService;
	
   @GetMapping("/{studentId}")
   public ResponseEntity<?> fetchStudentDetails(@PathVariable int studentId)
   {
	   System.out.println("fetch student dtls "+studentId);
	   return ResponseEntity.ok(studentService.getStudentDetails(studentId));	   
   }
   //view all my courses
   @GetMapping("/courses/enrolled/{studentId}")
   public ResponseEntity<?> getMyCourses(@PathVariable int studentId)
   
   {
	   System.out.println("get my courses "+studentId);
	   return ResponseEntity.ok(studentService.findAllCoursesByStduentId(studentId));
	 
   }
   //view all available courese
 //fetch all courses
 	@GetMapping("/courses")
 	public ResponseEntity<?> fetchAllCourseDetails()
 	{
 		System.out.println("fetch all available  courses ");
 		return ResponseEntity.ok(courseService.getAllCourses());
 		
 	}
}
