package com.app.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Deposit;
import com.app.pojos.User;
import com.app.service.ServiceDepositInterface;

@Controller
@RequestMapping("/bank")
public class UserDepositController {
	@Autowired
	private ServiceDepositInterface service;
	
	public UserDepositController() {
		super();
		System.out.println("In Controller constr");
	}

	@GetMapping("/login")
	public String showLoginForm() {
		return "/bank/login";
	}
	
	@PostMapping("/login")
	public String processLoginForm(Model map,HttpSession hs,@RequestParam String username,@RequestParam String password) {
		try{
			hs.setAttribute("user",service.validateUser(username, password));
			return "/bank/dashboard";
		}catch(NoResultException e) {
			map.addAttribute("status", "Not Login");
		}
		return "/bank/login";
	}
	
	@GetMapping("/logout")
	public String Logout(HttpSession hs,Model map) {
		try {
			hs.invalidate();
			map.addAttribute("status", "Logout Succesfull");
			return "/bank/login";
		}catch(RuntimeException e)
		{
			return "/bank/dashboard";
		}
	}
	
	@GetMapping("/deposit")
	public String redirectDeposit() {
		return "/bank/deposit";
	}
	
	@PostMapping("/deposit")
	public String showDeposit(Model map,@RequestParam String startDate,@RequestParam String endDate) {
		List<Deposit> deposits = null;
		try {
			deposits = service.getDeposit(Date.valueOf(startDate), Date.valueOf(endDate));
			map.addAttribute("deposits",deposits);
		}catch(RuntimeException e){
			map.addAttribute("status","No Deposits Found");
			return "/bank/dashboard";
		}
		return "/bank/display";
	}
	
	@GetMapping("/register")
	public String showRegisterForm() {
		return "/bank/register";
	}
	@PostMapping("/register")
	public String  processRegistrform(Model map,@RequestParam String username,@RequestParam String password,@RequestParam String role) {
		try {
		map.addAttribute("status","Registration Successfull");
		service.registerUser(new User(username,password,role));
		}catch(RuntimeException e) {
			map.addAttribute("status","Registration failed");
			return "/bank/register";
		}
		return "redirect:/bank/login";
	}
	
	@GetMapping("/addDeposit")
	public String showDepositForm() {
		return "redirect:/bank/addDeposit";
	}
	@PostMapping("/addDeposit")
	public String ProcessDepositForm(Model map,@RequestParam double balance,@RequestParam String maturity,@RequestParam String bankName,HttpSession hs) {
		User u = null;
		try {
			u = (User) hs.getAttribute("user");
			map.addAttribute("status","AddDeposit successful");
			service.addDeposit(u,new Deposit(balance,Date.valueOf(maturity),bankName));
		}catch(RuntimeException e) {
			map.addAttribute("status","Failed to add");
		}
		return "/bank/dashboard";
	}
}
