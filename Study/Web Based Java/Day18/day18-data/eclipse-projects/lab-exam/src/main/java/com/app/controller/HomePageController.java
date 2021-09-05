package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dao.ICourseDao;

@Controller
public class HomePageController {
	@Autowired
	private ICourseDao courseDao;

	@RequestMapping("/")
	public String showAvailableCourses(Model map) {
		// invoke course dao's method for getting list of available courses n add the same under model map
		map.addAttribute("course_list", courseDao.getAllCourses());
		return "/course/courses";//LVN ---> AVN : /WEB-INF/views/course/courses.jsp
	}
}
