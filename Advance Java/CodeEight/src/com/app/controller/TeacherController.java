package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Subject;
import com.app.pojos.Teacher;
import com.app.service.TeacherServiceInterface;

@Controller
@RequestMapping("/app")
public class TeacherController {
	@Autowired
	private TeacherServiceInterface service;
	
	public TeacherController(){
		System.out.println("in teacher controller constr::");
	}
	
	@GetMapping("/showTeachers")
	public String getTeachers(Model map){
		 map.addAttribute("teachers",service.getTeachers());
		 return "/app/teachers";
	}
	
	@GetMapping("/viewSubjects")
	public String getSubjects(@RequestParam int teacherId,HttpSession session,Model map) {
		session.setAttribute("teacherid", teacherId);
		session.setAttribute("teach", service.getTeacher(teacherId));
		map.addAttribute("subjects",service.getSubjects(teacherId));
		return "/app/subjects";
	}
	
	@GetMapping("/addSubject")
	public String getSubjectPage() {
		return "/app/addSubject";		
	}
	
	@PostMapping("/addSubject")
	public String addSubject(HttpSession session,Model map,@RequestParam String name,@RequestParam int duration,@RequestParam String course) {
		try {
		Teacher t = (Teacher) session.getAttribute("teach");
		map.addAttribute("status","Subject Added");
		service.addSubject(new Subject(name,duration,course),t);
		map.addAttribute("subjects",service.getSubjects((int) session.getAttribute("teacherid")));
		return "/app/subjects";
		}catch(RuntimeException e)
		{
			map.addAttribute("status","Subject Not Added");
			return "/app/subjects";
		}
		
	}
	
	@GetMapping("/updateSubject")
	public String getUpdateSubject(@RequestParam int subjectId,Model map) {
		map.addAttribute("subject",service.getSubject(subjectId));
		return "/app/updateSubject";
	}
	
	@PostMapping("/updateSubject")
	public String updateSubject(HttpSession session,Model map,@RequestParam int id,@RequestParam String name,@RequestParam int duration,@RequestParam String course)
	{
		try {
			Subject s = service.getSubject(id);
			s.setName(name);
			s.setDuration(duration);
			s.setCourse(course);
			service.updateSubject(s);
			map.addAttribute("status","Subject Updated");
			map.addAttribute("subjects",service.getSubjects((int) session.getAttribute("teacherid")));
		}catch(RuntimeException e) {
			map.addAttribute("status","Subject Not Updated");
		}
		return "/app/subjects";
	}
}
