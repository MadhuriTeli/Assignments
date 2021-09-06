package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dao.IPlayerDao;
import com.app.pojos.Player;

@Controller
@RequestMapping("/player")

public class PlayerController {
	@Autowired 
	private IPlayerDao plDao;
//	@Autowired
//	private IStudentService studentService;
	
	//add req handling method to show student admisssion form
	@GetMapping("/player")
	public String showAdmitForm(Model map)
	{
		//System.out.println("in show admit form "+cid);
		//for form binding
		map.addAttribute("myPlayer",new Player());//binding pojo(Model) --> view
		return "/player/player";//AVN : /WEB-INF/views/student/admit.jsp
	}
	//add req handling method to process form
	@PostMapping("/player")
	public String processAdmitForm(@ModelAttribute(name="myPlayer") Player p)
	{
		System.out.println("in process form "+p);
		plDao.admitPlayer(p);
		return "redirect:/";
	}
	
}
