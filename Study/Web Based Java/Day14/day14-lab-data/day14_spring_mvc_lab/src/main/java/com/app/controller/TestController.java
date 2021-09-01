package com.app.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // mandatory
@RequestMapping("/test") // optional BUT reco : for the purpose of separation
public class TestController {
	public TestController() {
		System.out.println("in ctor of " + getClass().getName());
	}

	// add a req handling method (method=GET): to understand o.s.w.s.ModelAndView
	@GetMapping("/test1")
	public ModelAndView testModelAndView() {
		System.out.println("in test M n V");
		/*
		 * public ModelAndView(String logicalViewName, String modelAttributeName, Object modelAttributeValue)
		 * Convenient constructor to take a single model object.
		 */
		return new ModelAndView("/test/test1", "server_ts", LocalDateTime.now());
		//Handler ---> ModelAndView obj --> D.S
		//D.S ---> logicalViewName --> V.R
		//Actual view name : /WEB-INF/views/test/test1.jsp
	}
}
