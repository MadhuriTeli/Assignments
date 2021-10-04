package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.AddressRepository;
import com.app.dao.EnrollmentRepository;
import com.app.dao.StudentRepository;
import com.app.pojos.Address;
import com.app.pojos.Course;
import com.app.pojos.Enrollment;
import com.app.pojos.Student;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private AddressRepository addressRepo;
	@Autowired
	private EnrollmentRepository enrollmentRepo;

	@Override
	public Student registerStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepo.save(s);
	}

	@Override
	public Address assignAddress(Address a) {
		Optional<Student> optional = studentRepo.findById(a.getStudent().getId());
		Student s = optional.orElseThrow(() -> new ResourceNotFoundException("Student not found!!!"));
		a.setStudent(s);
		return addressRepo.save(a);
	}

	@Override
	public Enrollment enrollStudentInCourse(Enrollment e) {
		// TODO Auto-generated method stub
		return enrollmentRepo.save(e);
	}

	@Override
	public Student getStudentDetails(int id) {
		Optional<Student> optional = studentRepo.findById(id);
		return optional.orElseThrow(() -> new ResourceNotFoundException("Student not found!!!"));
	}

	//getting the list of courses enrolled
	@Override
	public List<Course> findAllCoursesByStduentId(int studentId) {
		// TODO Auto-generated method stub
		return enrollmentRepo.findAllCoursesByStduentId(studentId);
	}

}
