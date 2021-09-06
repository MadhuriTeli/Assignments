package com.app.service;

import java.util.List;

import com.app.pojo.Employee;

public interface ServiceEmployeeInterface {
	String addEmployee(Employee e);			//POST
	List<Employee> viewEmployees();			//GET
	Employee getEmployee(int id);			//GET
	String updateEmployee(int id,double sal);	//POST
	String deleteEmployee(int id);				//POST
	Employee authUser(String email,String password);

}
