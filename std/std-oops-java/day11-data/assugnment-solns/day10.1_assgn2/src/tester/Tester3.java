package tester;

import static utils.ValidationRules.convertDate;
import static utils.ValidationRules.validateCategory;
import static utils.ValidationRules.validateEmail;
import static utils.ValidationRules.validatePassword;
import static utils.ValidationRules.findCustomerByEmail;

import java.util.Scanner;

import com.app.core.Customer;

public class Tester3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Customer[] customers = new Customer[100];
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				System.out.println("Options 1. Register Customer 2. Link Adhar Card 3. Display Services"
						+ " 4. Change Plan 5. Display All customers 10.Exit ");
				try {
					switch (sc.nextInt()) {
					case 1:
						double amount = 0;
						System.out.println(
								"Enter customer details :  name,  email,  password,  regAmount,  dob(day-mon-yr) category");
						Customer c1 = new Customer(sc.next(), validateEmail(sc.next()), validatePassword(sc.next()),
								amount = sc.nextDouble(), convertDate(sc.next()), validateCategory(amount, sc.next()));
						customers[counter++] = c1;
						break;
					case 2 : System.out.println("Enter email to link your adhar card");
					    //invoke a method to chk if customer with specified email exists
					    c1=findCustomerByEmail(sc.next(),customers);
						System.out.println("Enter adhar card no n creation date(day-mon-yr)");
						c1.linkAdharCard(sc.next(), sc.next());
						break;
						
					case 5:
						for (Customer c : customers)
							if (c != null)
								System.out.println(c);
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				//read off data from the scanner till end of line
				sc.nextLine();
			}
		}

	}

}
