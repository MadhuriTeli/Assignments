package com.app.dao;


import java.util.List;

import com.app.pojo.Employee;

public interface EmployeeDao {
	String addEmployee(Employee e);
	List<Employee> viewEmployees();
	Employee getEmployee(int id);
	String updateEmployee(int id,double sal);
	String deleteEmployee(int id);
}
