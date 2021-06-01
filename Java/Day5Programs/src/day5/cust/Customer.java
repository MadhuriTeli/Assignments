/*Problem Statement 4:
->Create a java applicstion for the following.
 Create a Customer class , with data members (all private : tight encapsulation)
name(String),email(String),age(int), creditLimit(double)

4.1 Supply a parameterized constructor to accept all details from user

4.2 Supply an argument less  constructor to init default name to "Riya" , email to "riya@gmail.com",age=25,creditLimit=10000
(Must use constructor chaining)

4.3 Write a method , getDetails to return String form of customer name & credit limit only.
4.4 Supply getter & setter for creditLimit.

Naming convention : public void setCreditLimit(double limit) {...}
public double getCreditLimit(){...}

4.5 Create a TestCustomer class . Use scanner to accept user i/ps.
Create 2 customers using 2 different constructors(4.1 : customer1 ,4.2 : customer2)
Display customer details of both customers.
Prompt user , for changing creditLimit of the customer2.
Display new credit limit on the console.
*/


package day5.cust;
import java.util.*;
public class Customer {
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	Scanner sc = new Scanner(System.in);
	public Customer(String name, String email, int age, double creditLimit) {
//		this();
		this.name = name;
		this.email = email;
		this.age = age;
		this.creditLimit = creditLimit;
		System.out.println("Parameterized Customer:\t"+name+"  "+email+"\t"+age+"\t"+creditLimit);
	}

	public Customer() {
		name= "Vinayak";
		email = "vnyk0901@gmail.com";
		age = 25;
		creditLimit = 20000;
		System.out.println("ArgumentLess Customer:\t"+name+"  "+email+"\t"+age+"\t"+creditLimit);
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public String acceptName()
	{
		name = sc.next(name);
		return name;
	}
}