package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmployeeDao;
import com.app.pojo.Employee;
@Service
@Transactional
public class SeviceEmployeeImpl implements ServiceEmployeeInterface {
	@Autowired
	private EmployeeDao dao;
	@Override
	public String addEmployee(Employee e) {
		System.out.println("in service method");
		return dao.addEmployee(e);
	}
	@Override
	public List<Employee> viewEmployees() {
		System.out.println("in service method");
		return dao.viewEmployees();
	}
	@Override
	public Employee getEmployee(int id) {
		System.out.println("in service method");
		return dao.getEmployee(id);
	}
	@Override
	public String updateEmployee(int id, double sal) {
		System.out.println("in service method");
		return dao.updateEmployee(id, sal);
	}
	@Override
	public String deleteEmployee(int id) {
		System.out.println("in service method");
		return dao.deleteEmployee(id);
	}
	@Override
	public Employee authUser(String email,String password) {
		System.out.println("in service method");
		return dao.loginUser(email, password);
	}

}
