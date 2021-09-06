package com.app.controller;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojo.Employee;
import com.app.service.ServiceEmployeeInterface;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private ServiceEmployeeInterface service;
	
	public UserController(){
		System.out.println("In UserController Constructor" + getClass().getName());
	}
	
	@GetMapping("/login")
	public String returnLogin() {
		return "/user/login";
	}
	@PostMapping("/login")
	public String authenticateUser(@RequestParam String email,@RequestParam String password,Model map,HttpSession hs)
	{
		System.out.println("In Login Auth::");
		Employee emp = null;
		try {
			emp = service.authUser(email, password);
			System.out.println(emp);
		}catch(NoResultException e) {
			map.addAttribute("status", "login failed");
			return "/user/login";
		}
		
		hs.setAttribute("user", emp);
		//return "redirect:/employee/list";
		return "/user/home";
	}
	@GetMapping("/logout")
	public String userLogout(Model map,HttpSession hs,HttpServletRequest request,HttpServletResponse response) {
		System.out.println("in logout");
		map.addAttribute("status", "logout succesfull");
		hs.invalidate();
		response.setHeader("refresh", "5;url=" + request.getContextPath());
		return "/user/logout";
	}
}
