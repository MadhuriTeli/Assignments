package com.app.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.cust_excs.ResourceNotFoundException;
import com.app.dto.ErrorResponse;
import com.app.dto.ResponseDTO;
import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;

@RestController
@RequestMapping("/emps")
@Validated //To enable :  validation err handling on request params & path variables
public class EmpCRUDController {
	// dependency : repository(DAO layer i/f)
	@Autowired
	private EmployeeRepository empRepo;

	// get list of all emps
	@GetMapping
	public ResponseEntity<?> getAllEmpDetails() {
		List<Employee> emps = empRepo.findAll();
	//	return new ResponseEntity<>(emps, HttpStatus.OK); OR
		return ResponseEntity.ok(emps);//sts code : 200 , body : list of emps
	}

	// get specific emp details
	@GetMapping("/{emp_id}")
	public ResponseEntity<?> getEmpDetails(@PathVariable int emp_id) {
		System.out.println("in get emp dtls " + emp_id);
		Optional<Employee> optional = empRepo.findById(emp_id);
		if (optional.isPresent())
	//		return new ResponseEntity<>(optional.get(), HttpStatus.OK);
			return ResponseEntity.ok(optional.get());
		// invalid id
		throw new ResourceNotFoundException("Emp ID Invalid");
	}

	// add new emp details : Create : POST
	// @RequestBody : un marshalling (json ---> java obj)
	//plus validation rules will be invoked from the POJO.
	@PostMapping
	public ResponseEntity<?> addEmpDetails(@RequestBody @Valid Employee e) {
		System.out.println("in add emp " + e);
		return new ResponseEntity<>(empRepo.save(e), HttpStatus.CREATED);
	}

	// update existing emp details : post / put
	// http://host:port/emps/15
	@PutMapping("/{empId}")
	public ResponseEntity<?> updateEmpDetails(@PathVariable int empId, @RequestBody @Valid Employee emp) {
		System.out.println("in update emp " + empId + " " + emp);
		// check if emp exists
		Optional<Employee> optional = empRepo.findById(empId);
		if (optional.isPresent()) {
			// emp id valid : update the same
			Employee existingEmp = optional.get();// DETACHED
			System.out.println("existing emp " + existingEmp);
			existingEmp.setDesignation(emp.getDesignation());
			existingEmp.setSalary(emp.getSalary());
			// update detached POJO
			return new ResponseEntity<>(empRepo.save(existingEmp), HttpStatus.OK);
			// invokes save or update (insert: transient(value of ID : default
			// or non default value BUT existing on DB -- update
		} else
			throw new ResourceNotFoundException("Emp ID Invalid");

	}

	// delete emp details
	@DeleteMapping("/{empId}")
	public ResponseEntity<?> deleteEmpDetails(@PathVariable @Min(1) @Max(100) int empId) {
		System.out.println("in delete emp " + empId);
		// check if emp exists
		Optional<Employee> optional = empRepo.findById(empId);
		if (optional.isPresent()) {
			empRepo.deleteById(empId);
			return new ResponseEntity<>(new ResponseDTO("Emp rec deleted with ID " + empId), HttpStatus.OK);
		} else
//			 throw new ResourceNotFoundException("Emp ID Invalid : rec deletion failed");
			throw new RuntimeException("my own err mesg");

	}
	

}
