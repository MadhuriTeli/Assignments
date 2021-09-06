package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojo.Employee;
import com.app.service.ServiceEmployeeInterface;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private ServiceEmployeeInterface service;
	
	public EmployeeController(){
		System.out.println("In Controller Constructor" + getClass().getName());
	}
	
	@GetMapping("/list")
	public String getEmployees(HttpSession session) {
		session.setAttribute("emplist", service.viewEmployees());
		return "/emp/list";
	}
	
	@GetMapping("/view")
	public String fetchEmployee(Model map,@RequestParam int id) {
		map.addAttribute("employee",service.getEmployee(id));
		return "/emp/view";
	}
	
	@GetMapping("/add")
	public String addEmp()
	{
		System.out.println("In Add Employee");
		return "/emp/add";
	}
	
	@PostMapping("/add")
	public String addEmployee(Model map,HttpSession session,@RequestParam String name,@RequestParam String email,@RequestParam String password,@RequestParam int deptid,@RequestParam double salary)
	{
		map.addAttribute("status",service.addEmployee(new Employee(name,email,password,deptid,salary)));
		session.setAttribute("emplist", service.viewEmployees());
		return "redirect:/emp/list";
	}
	
	@GetMapping("/update")
	public String updateEmp()
	{
		System.out.println("In Update Employee");
		return "/emp/update";
	}
	
	@PostMapping("/update")
	public String updateEmployee(Model map,HttpSession session,@RequestParam int id,@RequestParam double salary)
	{
		map.addAttribute("status", service.updateEmployee(id, salary));
		session.setAttribute("emplist", service.viewEmployees());
		return "redirect:/emp/list";
	}
	
	@GetMapping("/delete")
	public String deleteEmp()
	{
		System.out.println("In Delete Employee");
		return "/emp/delete";
	}
	
	@PostMapping("/delete")
	public String deleteEmployee(Model map,HttpSession session,@RequestParam int id)
	{
		map.addAttribute("status", service.deleteEmployee(id));
		session.setAttribute("emplist", service.viewEmployees());
		return "redirect:/emp/list";
	}
}
