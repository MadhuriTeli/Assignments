/*Problem Statement 2:
2.1: Create Employee class with empid,name,address,salary.Use Getter Setters
2.2 :create array of 5 employees...show all employees using for loop as well as for each loop...in same assignment
2.3:create array of 5 employees ...show those employee who are getting salary >20000.

*/


package day5.emp;

import java.util.Scanner;

public class Employee {
	private int empId;
	private String name, address;
	private double salary;
	private Scanner sc = new Scanner(System.in);/*
	public Employee(int empid, String name , String address, double salary) {
		this.empId = empid;
		this.name = name;
		this.address= address;
		this.salary= salary;
	}
*/	
	//Id
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empid) {
		this.empId = empid;
	}
	//Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//Salary
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void acceptInfo()
	{
		
		System.out.println("Enter Id: ");
		setEmpId(sc.nextInt());
		System.out.println("Enter Name: ");
		setName(sc.next());
		System.out.println("Enter Address");
		setAddress(sc.next());
		System.out.println("Enter Salary");
		setSalary(sc.nextDouble());
	}
	
	public void displayInfo()
	{
		System.out.println("Id: "+getEmpId());
		System.out.println("Name: "+getName());
		System.out.println("Address: "+getAddress());
		System.out.println("SAlary: "+getSalary());
		
	}
	

}
