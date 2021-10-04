package com.app.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.EmpRepository;
import com.app.dto.ResponseDTO;
import com.app.pojos.Emp;

@RestController
@CrossOrigin
@RequestMapping("/emps")
public class EmpController {
	@Autowired
	private EmpRepository repo;

	@GetMapping
	public List<Emp> getAllEmps()  {
		
		return repo.findAll(Sort.by("id"));
	}
	@GetMapping("/{empId}")
	public Emp getEmpDetails(@PathVariable int empId){
	
		return repo.findById(empId).get();
	}
	
	@PostMapping
	public Emp addEmp(@RequestBody Emp e)
	{
		return repo.save(e);
	}
	@DeleteMapping("/{empId}")
	public ResponseDTO deleteEmp(@PathVariable int empId)
	{
		repo.deleteById(empId);
		return new ResponseDTO("Emp deleted with ID="+empId,LocalDateTime.now());
	}
	@PutMapping("/{empId}")
	public Emp updateEmp(@PathVariable int empId,@RequestBody Emp e)
	{
		Emp e1=repo.findById(empId).get();
		e1.setDesignation(e.getDesignation());
		e1.setSalary(e.getSalary());
		return repo.save(e1);
	}
}
