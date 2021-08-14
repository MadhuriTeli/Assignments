package tester;

import static utils.ValidationRules.*;

import java.util.Scanner;

import com.app.core.Customer;

public class Tester2 {

	public static void main(String[] args) /* throws Exception */ {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(
					"Enter customer details :  name,  email,  password,  regAmount,  dob(day-mon-yr) category");
			Customer c1 = new Customer(sc.next(), validateEmail(sc.next()), validatePassword(sc.next()),
					validateRegAmount(sc.nextDouble()), convertDate(sc.next()), validateCategory(sc.next()));
			// validation rules : success
			// prompt user for adhar card details
			System.out.println("Enter adhar card no n creation date(day-mon-yr)");
			c1.linkAdharCard(sc.next(), sc.next());
		System.out.println(c1);//c1.toString
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
