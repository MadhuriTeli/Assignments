/*
  2:>Create a java applicstion for the following.
 Create a Customer class , with data members (all private : tight encapsulation)
name(String),email(String),age(int), creditLimit(double)

2.1 Write acceptInfo() method to accept customer details:

2.2 Write a method , showDetails to display customer name & credit limit only.

Naming convention : public void setCreditLimit(double limit) {...}
public double getCreditLimit(){...}

2.3 Create a TestCustomer class . Use scanner to accept user i/ps.
Create 2 customers object.
Display customer details of both customers.
Prompt user , for changing creditLimit of the customer2.
Display new credit limit on the console.
 * 
 */

package FirstCustomerPackage;
import java.util.Scanner;
class Customer {
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	static Scanner sc = new Scanner(System.in);
	public Customer(String n, String e, int a, double cl)
	{
		name= n;
		email= e;
		age = a;
		creditLimit = cl;
	}
	public Customer() {
			
	}
	public void acceptData()
	{
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter email: ");
		email = sc.next();
		System.out.println("Enter age: ");
		age = sc.nextInt();
		System.out.println("Enter credit limit: ");
		creditLimit = sc.nextDouble();
		
	}
	
	public String getName()
	{
		return name;
	}
	void setName(String n)
	{
		name=n;	
	}
	
	public String getEmail()
	{
		return email;
	}
	void setEmail(String em)
	{
		email=em;	
	}
	
	public int getAge()
	{
		return age;
	}
	void setAge(int a)
	{
		age=a;	
	}
	
	public double getCreditsLimit()
	{
		return creditLimit;
	}
	void setCreditLimit(double cl)
	{
		this.creditLimit = cl;

	}
	
	public void displayData() 
	{
		System.out.println("");
		System.out.println("Customer Name:\t"+name);
		System.out.println("Customer Credit Limit:\t"+creditLimit);
	}
	
}
