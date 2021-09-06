package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.dao.IUserDao;
import com.app.pojos.Role;
import com.app.pojos.User;

@Controller
@RequestMapping("/user")
public class UserController {
	// dependency : Service layer i/f
	@Autowired
	private IUserDao userDao;

	public UserController() {
		System.out.println("in ctor of " + getClass().getName());
	}

	// add request handling method to show login form
	@GetMapping("/login")
	// Handler Mapping  : key : /user/login + method=get
	// value : UserController.showLoginForm
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/user/login";// Actual view name : /WEB-INF/views/user/login.jsp
	}

	// add req handling method to process login form
	@PostMapping("/login")
	// Handler MappingM : key : /user/login + method=post
	// value : UserController.processLoginForm
	// How to tell SC to inject request params in req handling method : D.I
	// Anno : @RequestParam
	// SC : String email=request.getParameter("email"); // MATCH req param name with
	// method arg name
	// String pass=request.getParamter("password");
	public String processLoginForm(@RequestParam String email, 
			@RequestParam(name = "password") String pass,
			Model modelMap, HttpSession hs,RedirectAttributes flashMap) {
		System.out.println("in process login form " + email + " " + pass + " " + modelMap);
		try {
			// Controller invokes --> service ---> DAO ---> DB
			User user = userDao.authenticateUser(email, pass);
			// store validated user details under session scope
			hs.setAttribute("user_details", user.getEmail());
			//add flash scoped attribute to add successful login message : scope till next request only!
			// => valid login, chk the role
			if (user.getRole().equals(Role.ADMIN))
				return "redirect:/admin/list";
			// vendor login
			return "redirect:/user/login";//UserController ---> redirect view Name --> D.S
			//D.S skips the view resolver n sends temp redirect resp
			//response.sendRedirect(response.encodeRedirectURL("/vendor/details"));
			//Resp pkt : SC 302 | location=/vendor/details | body =EMPTY
			//sends new req : http://host:port/day4-boot/vendor/details , method = GET
		} catch (RuntimeException e) {
			System.out.println("err in processing " + e);
			// add err mesg as a model atribute
			modelMap.addAttribute("message", "Invalid Login , Please retry!!!!!");
			// in case of invalid login , forward user to login page
			return "/user/login";// Actual view name : /WEB-INF/views/user/login.jsp
		}

	}
	
	@GetMapping("/register")
	public String showRegisterForm(User details)
	{
		System.out.println("in show register form");
		return "/user/register";
	}
	
	@PostMapping("/register")
	public String processRegisterForm(User userDetails, RedirectAttributes flashMap)
	{
		flashMap.addFlashAttribute("message", userDao.registerNewUser(userDetails));
		return "redirect:/user/login";
	}

}
