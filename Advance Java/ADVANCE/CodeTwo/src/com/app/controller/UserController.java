package com.app.controller;

import java.sql.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.User;
import com.app.services.UserServiceInterface;

@Controller
@RequestMapping("/app")
public class UserController {
	@Autowired
	private UserServiceInterface service;
	
	public UserController() {
		System.out.println("In Service Constr::");
	}
	
	@GetMapping("/register")
	public String getRegistration() {
		return "app/register";
	}
	
	@PostMapping("/register")
	public String processRegistration(HttpSession session,Model map,@RequestParam String name,@RequestParam String email, @RequestParam String regDate, @RequestParam String role) {
		boolean isactive = true;
		try {
			service.createUser(new User(name,email,Date.valueOf(regDate),role,isactive));
		}catch(RuntimeException e) {
			map.addAttribute("status","Unsuccesfull " + e);
			return "app/register";
		}
		map.addAttribute("status","Successfull Registration");
		
		User u = service.getUser(email);
		System.out.println(u);
		session.setAttribute("user",u);
		
		if(u.getRole().contains("admin")) {
			map.addAttribute("users",service.userList());
			return "app/details";
		}
		
			
		return "app/home";
	}
	
	@GetMapping("/logout")
	public String getRoot(HttpSession session,Model map) {
		session.invalidate();
		map.addAttribute("status","Logout Succesfull");
		return "redirect:/";
	}
}
