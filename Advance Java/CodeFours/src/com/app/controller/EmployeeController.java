package com.app.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojo.Employee;
import com.app.service.ServiceEmployeeInterface;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private ServiceEmployeeInterface service;

	public EmployeeController() {
		System.out.println("In Controller Constructor" + getClass().getName());
	}

	@GetMapping("/list")
	public String getEmployees(HttpSession session) {
		session.setAttribute("emplist", service.viewEmployees());
		return "/employee/list";
	}

	@GetMapping("/view")
	public String fetchEmployee(Model map, @RequestParam int id) {
		map.addAttribute("employee", service.getEmployee(id));
		return "/employee/view";
	}

	@GetMapping("/add")
	public String addEmp(Model map) {
		System.out.println("In Add Employee");
		//For Presentation Logic set Map key as ModelAttribute
        map.addAttribute("emp", new Employee());  
		return "employee/add";
	}

	// Changed for Presentation Valid karan I dont know how to parse date
	@PostMapping("/add")
	public String addEmployee(@Valid @ModelAttribute("emp") Employee e,BindingResult result,Model map)
	{
		System.out.println("Tuzach Registration Chaluy");
		if(result.hasErrors()) {
			System.out.println("Are Error Ahe");
			return "/employee/add";
		}
		try {
			service.addEmployee(e);
			return "redirect:/emp/list";
		}catch(RuntimeException exception) {
			map.addAttribute("status", "Reg Failed");
			return "/employee/add";
		}
	}

	@GetMapping("/update")
	public String updateEmp() {
		System.out.println("In Update Employee");
		return "/employee/update";
	}

	@PostMapping("/update")
	public String updateEmployee(Model map, HttpSession session, @RequestParam int id, @RequestParam double salary) {
		map.addAttribute("status", service.updateEmployee(id, salary));
		session.setAttribute("emplist", service.viewEmployees());
		return "redirect:/employee/list";
	}

	@GetMapping("/delete")
	public String deleteEmp() {
		System.out.println("In Delete Employee");
		return "/employee/delete";
	}

	@PostMapping("/delete")
	public String deleteEmployee(Model map, HttpSession session, @RequestParam int id) {
		map.addAttribute("status", service.deleteEmployee(id));
		session.setAttribute("emplist", service.viewEmployees());
		return "redirect:/employee/list";
	}
}
