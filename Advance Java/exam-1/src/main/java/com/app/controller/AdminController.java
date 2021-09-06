package com.app.controller;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dao.IAdminDao;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private IAdminDao adminDao;
	
	@GetMapping("/list")
	public String showAdvertisementDetails(Model map)
	{
		map.addAttribute("advertisement_list", adminDao.listAdvertisements());
		return "/admin/list";
	}
}
