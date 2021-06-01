/*8: Create a java application for the following.
 Create a Customer class , with data members (all private : tight encapsulation)
name(String),email(String),age(int).Supply a parameterized constructor to accept all details from user.
Supply an argument less  constructor to init default name to "Riya" , email to "riya@gmail.com",age=25.Write a method 
displayCustomer to display customer details.
*/
public class Customer {
	private String name, email;
	private int age;
	
	Customer(String cname, String cemail, int cage){
		name=cname;
		email = cemail;
		age =cage;
	}
	

	
	
	void displayData()
	{
		System.out.println("\nName:\t"+name+"\nEmail:\t"+email+"\nAge:\t"+age);
	}
}
