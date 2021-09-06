package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.pojos.Player;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
	@GetMapping("/welcome")
	public String showAdmitForm()
	{
		//System.out.println("in show admit form "+cid);
		//for form binding
	
		return "/welcome/welcome";//AVN : /WEB-INF/views/student/admit.jsp
	}
}
