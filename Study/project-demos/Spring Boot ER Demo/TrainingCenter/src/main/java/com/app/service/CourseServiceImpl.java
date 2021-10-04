package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.CourseRepository;
import com.app.dao.FacultyRepository;
import com.app.pojos.Course;
import com.app.pojos.Faculty;
import com.app.pojos.FeedBack;

@Service
@Transactional
public class CourseServiceImpl implements ICourseService {
	@Autowired
	private CourseRepository courseRepo;
	@Autowired
	private FacultyRepository facultyRepo;

	@Override
	public Course launchNewCourse(Course c) {
//		 Optional<Faculty> f = facultyRepo.findById(c.getCourseFaculty().getId());
//		 Faculty faculty = f.orElseThrow(()->new ResourceNotFoundException("Faculty Not Found : Invalid Faculty Id"));
//		 c.setCourseFaculty(faculty);
		return courseRepo.save(c);

	}

	@Override
	public Course getCourseDetails(String courseName) {
		Optional<Course> optionalCourse = courseRepo.findByName(courseName);
		return optionalCourse.orElseThrow(() -> new ResourceNotFoundException("Course Not Found : Invalid Name"));
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}

}
