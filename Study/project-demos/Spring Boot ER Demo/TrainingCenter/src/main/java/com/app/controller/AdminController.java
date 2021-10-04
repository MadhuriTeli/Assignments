package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Address;
import com.app.pojos.Course;
import com.app.pojos.Enrollment;
import com.app.pojos.Faculty;
import com.app.pojos.Student;
import com.app.service.ICourseService;
import com.app.service.IFacultyService;
import com.app.service.IStudentService;
import com.app.service.IUserService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private IFacultyService facultyService;
	@Autowired
	private ICourseService courseService;
	@Autowired
	private IStudentService studentService;
	@Autowired
	private IUserService userService;
	
	@PostMapping("/faculty")
	public ResponseEntity<?> addFacultyDetails(@RequestBody Faculty faculty)
	{
		System.out.println("add faculty "+faculty);
		return ResponseEntity.ok(facultyService.registerFaculty(faculty));				
	}
	@PostMapping("/course")
	public ResponseEntity<?> addCourseDetails(@RequestBody Course course)
	{
		System.out.println("add course "+course);
		System.out.println(course.getCourseFaculty());
		return ResponseEntity.ok(courseService.launchNewCourse(course));
				
	}
	//fetch course details 
	@GetMapping("/course/{courseName}")
	public ResponseEntity<?> fetchCourseDetails(@PathVariable String courseName)
	{
		System.out.println("fetch course dtls "+courseName);
		return ResponseEntity.ok(courseService.getCourseDetails(courseName));
		
	}
	//fetch all courses
	@GetMapping("/course")
	public ResponseEntity<?> fetchAllCourseDetails()
	{
		System.out.println("fetch all course dtls ");
		return ResponseEntity.ok(courseService.getAllCourses());
		
	}
	//register new student ,w/o address
	@PostMapping("/student")
	public ResponseEntity<?> addStudentDetails(@RequestBody Student student)
	{
		System.out.println("add student "+student);
		Student registeredStudent = studentService.registerStudent(student);
		userService.registerStudentUser(registeredStudent.getId());
		return ResponseEntity.ok(registeredStudent);
				
	}
	//assign address to already registered student
	@PostMapping("/student/address")
	public ResponseEntity<?> assignStudentAddress(@RequestBody Address address)
	{
		System.out.println("assign address  "+address +" "+address.getStudent());
		return ResponseEntity.ok(studentService.assignAddress(address));
				
	}
	//student enrollment
	@PostMapping("/student/enrollment")
	public ResponseEntity<?> enrollStudent(@RequestBody Enrollment enrollment)
	{
		System.out.println("enroll student"+enrollment +" "+enrollment.getCourse()+" "+enrollment.getStudent());
		return ResponseEntity.ok(studentService.enrollStudentInCourse(enrollment));				
	}
	
	
	

}
