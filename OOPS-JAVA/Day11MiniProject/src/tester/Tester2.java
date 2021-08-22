package tester;

import static utils.ValidationRules.*;

import java.util.Scanner;

import com.app.customer.Customer;

public class Tester2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Customer Details");
			System.out.println("Name, email, password,registrationAmount, dob(dd-mm-yyyy) Category");
			Customer c1 = new Customer(sc.next(), validateEmail(sc.next()), validatePassword(sc.next()),
					validateAmount(sc.nextDouble()), convertDate(sc.next()), validateCategory(sc.next()));
			
			System.out.println("Enter adhar card details");
			System.out.println("Uid , CreatedOn(dd-mm-yyyy)");
			c1.linkAdharCard(sc.next(), sc.next());
			System.out.println(c1);
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
