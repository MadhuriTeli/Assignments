package com.app.controller;
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

import com.app.pojos.Admin;
import com.app.service.IAdminService;
@Controller // mandatory
@RequestMapping("/admin") // optional
public class AdminController {
	// dependency : service layer i/f
	@Autowired
	private IAdminService adminService;

	public AdminController() {
		System.out.println("in ctor of " + getClass().getName());
	}
	// add req handling method (to service GET) : to show login form
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/admin/login";
	}
	// add req handling method(to service POST) : to process the form
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String username, @RequestParam(name = "password") String pwd,
			Model map, HttpSession session)
	{
		System.out.println("in process login form " + username + " " + pwd);
		try {
			Admin admin = adminService.validateUser(username, pwd);
			session.setAttribute("user_details", admin);
			return "redirect:/welcome/welcome";
		} catch (RuntimeException e) {
			System.out.println("err in user controller " + e);// NoResultExc
			map.addAttribute("message", "Invalid Login , Please retry !!!!!!");
			return "/admin/login";// Actual View Name(AVN) : /WEB-INF/views/user/login.jsp
		}
	}
	// add request handling method to log out user
	@GetMapping("/logout")
	public String logOut(HttpSession session, Model map, HttpServletResponse resp, HttpServletRequest request) {
		System.out.println("in user logout");	
		map.addAttribute("user_dtls", session.getAttribute("user_details"));
		resp.setHeader("refresh", "5;url=" + request.getContextPath());// : /day16_spring_boot_mvc
		session.invalidate();
		return "/login/logout";// LVN ---> AVN : /WEB-INF/views/user/logout.jsp
	}
}
