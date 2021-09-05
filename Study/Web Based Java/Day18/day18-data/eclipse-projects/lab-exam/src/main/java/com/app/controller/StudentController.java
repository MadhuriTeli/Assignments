package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Student;
import com.app.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private IStudentService studentService;

	// add req handling method to show student admisssion form
	@GetMapping("/admit")
	public String showAdmitForm(@RequestParam int cid, Student s, RedirectAttributes flashMap) {
		System.out.println("in show admit form " + cid);
		// for form binding
		// map.addAttribute("student",new Student());//binding pojo(Model) --> view :
		// done by SC
		// add course id in flash map : so that it will be available in the next request
		// : after user submits the form
		flashMap.addFlashAttribute("courseId", cid);
		return "/student/admit";// AVN : /WEB-INF/views/student/admit.jsp
	}

	// add req handling method to process form
	@PostMapping("/admit")
	public String processAdmitForm(Student s, @RequestParam int cid, RedirectAttributes flashMap) {
		System.out.println("in process form " + s + " course id=" + cid);
		// invoke service layer method for validation + insertion
		String message = studentService.admitStudent(cid, s);
		flashMap.addFlashAttribute("status", message);
		if (message.contains("Failed"))
			return "redirect:/student/admit?cid="+cid;
		//no validation errs 
		return "redirect:/";
	}

}
