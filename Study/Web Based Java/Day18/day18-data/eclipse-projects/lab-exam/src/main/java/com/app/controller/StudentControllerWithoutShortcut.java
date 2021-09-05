package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Student;
import com.app.service.IStudentService;

//@Controller
//@RequestMapping("/student")
public class StudentControllerWithoutShortcut {
	@Autowired
	private IStudentService studentService;
	
	//add req handling method to show student admisssion form
	@GetMapping("/admit")
	public String showAdmitForm(@RequestParam int cid,Model map)
	{
		System.out.println("in show admit form "+cid);
		//for form binding
		map.addAttribute("myStudent",new Student());//binding pojo(Model) --> view
		return "/student/admit";//AVN : /WEB-INF/views/student/admit.jsp
	}
	//add req handling method to process form
	@PostMapping("/admit")
	public String processAdmitForm(@ModelAttribute(name="myStudent") Student s)
	{
		System.out.println("in process form "+s);
		return "redirect:/";
	}
	
}
