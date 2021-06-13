package p7;

import java.util.Scanner;

/*
 * Allow user 1. to choose only a single bank.
 *  Once user chooses the bank , another option : 2. withdraw funds
 * 3. Pay Bills 
 * 4 : Exit
 * 
 */

public class TestBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		Bank ref = null;
		while (!exit) {
			System.out.println("1. Create A/C in BoB  2. Create A/C in HDFC 3. Withdraw 4. Pay Bills 5.Exit");
			switch (sc.nextInt()) {
			case 1: // create a/c in BoB
				if (ref == null) {
					ref = new BankOfBaroda();// up casting
					System.out.println("Enter a/c no name balance");
					ref.createAccount(sc.nextInt(), sc.next(), sc.nextDouble());
				} else
					System.out.println("You have already chosen a bank!!!!!!!!!!!");
				break;
			case 2:
				if (ref == null) {
					ref = new HDFC();// up casting
					System.out.println("Enter a/c no name balance");
					ref.createAccount(sc.nextInt(), sc.next(), sc.nextDouble());
				} else
					System.out.println("You have already chosen a bank!!!!!!!!!!!");
				break;
			case 3:
				if (ref != null) {
					// withdraw
					System.out.println("Enter acct no n amount to withdraw");
					ref.withdraw(sc.nextInt(), sc.nextDouble());
				} else
					System.out.println("You have not yet chosen a bank!!!!!!!!!!!");
				break;
			case 4:
				if (ref != null) {
					if (ref instanceof HDFC)
						((HDFC) ref).payBills();
					else
						System.out.println("Not Provided Option");
				} else {
					System.out.println("Bank account is not created");
				}
				break;
			case 5:
				exit = true;

				break;

			}
		}

		sc.close();

	}

}
