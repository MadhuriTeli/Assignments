package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PlayerController {
@GetMapping("/admitplayer")
public String showForm() {
	return "/admitplayer";
}
}
