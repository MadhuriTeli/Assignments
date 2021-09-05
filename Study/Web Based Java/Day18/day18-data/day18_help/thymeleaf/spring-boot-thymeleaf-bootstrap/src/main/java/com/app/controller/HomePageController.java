package com.app.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomePageController {
	@RequestMapping("/")
	public String showHomePage()
	{
		return "index";
	}
	@RequestMapping("/hello")
	public String sayHello(Model map)
	{
		map.addAttribute("server_time",LocalDateTime.now());
		return "hello";
	}
}
