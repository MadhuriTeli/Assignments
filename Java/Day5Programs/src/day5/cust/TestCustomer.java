package day5.cust;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer c1 = new Customer();
		Customer c2 = new Customer("Harshal","harshal@gmail.com", 20, 50000);
		
		System.out.println("Change Credit Limit:");
		double creditLimit = sc.nextDouble();
		c2.setCreditLimit(creditLimit);
		System.out.println("Credit Limit Changed: "+c2.getCreditLimit());
	}


}
