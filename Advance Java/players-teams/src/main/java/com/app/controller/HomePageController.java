package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dao.IAdminDao;

@Controller
public class HomePageController {
@Autowired
private IAdminDao  admin;


@GetMapping("/")
public String index() {
	
	return "/index";
}
//username=Rama&password=123
@PostMapping("/")
public String processForm(@RequestParam String username,@RequestParam String password,HttpSession session) {
	
		System.out.println(username+" "+password);
session.setAttribute("admin",	    admin.adminLogin(username, password));
	
	return "redirect:/list";
	}
@GetMapping("/list")
public String showLinks() {
	return "/list";
}
	

}
