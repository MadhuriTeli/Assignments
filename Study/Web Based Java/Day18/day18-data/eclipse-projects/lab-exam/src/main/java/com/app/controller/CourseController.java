package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.dao.ICourseDao;

@Controller
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private ICourseDao courseDao;

	@GetMapping("/delete")
	public String deleteCourse(@RequestParam int cid,RedirectAttributes flashMap) {
		System.out.println("in del course "+cid);
		//invoke dao's method for deleting selected course
		flashMap.addFlashAttribute("status", courseDao.cancelCourse(cid));//scope will be till the next request
		//redirect 
		return "redirect:/";
	}
}
