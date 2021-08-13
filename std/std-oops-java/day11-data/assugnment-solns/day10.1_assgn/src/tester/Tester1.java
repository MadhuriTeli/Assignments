package tester;

import static utils.ValidationRules.*;

import java.util.Scanner;

import com.app.core.Customer;

public class Tester1 {

	public static void main(String[] args) /* throws Exception */ {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter customer details :  name,  email,  password,  regAmount,  dob(day-mon-yr) category");
			Customer c1 = new Customer(sc.next(), validateEmail(sc.next()), validatePassword(sc.next()),
					validateRegAmount(sc.nextDouble()), convertDate(sc.next()), validateCategory(sc.next()));
			// validation rules : success
			System.out.println(c1);
		} catch (Exception e) {
		//	e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
