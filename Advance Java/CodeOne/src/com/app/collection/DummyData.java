package com.app.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Employee;

public class DummyData {
	public static List<Employee> emps(){
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1,"Kirtish",LocalDate.parse("2012-12-01"),LocalDate.parse("2013-12-01"),250000,"zopliska@kirtish.com","SDEIII"));
		emp.add(new Employee(2,"Sushant",LocalDate.parse("2008-12-01"),LocalDate.parse("2009-06-01"),250000,"bjp@congress.com","SDEIV"));
		return emp;
	}
	
}
