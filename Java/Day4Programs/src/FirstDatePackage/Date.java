/*1:Create Date class with  data members day,month,year.
Write a method to accept all data members.write display function to display date.
		*/

package FirstDatePackage;

import java.util.Scanner;
public class Date {
	private int day;
	private String month;
	private int year;
	
	void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter date: ");
		day = sc.nextInt();
		System.out.println("Enter Month: ");
		month = sc.next();
		System.out.println("Enter Year: ");
		year = sc.nextInt();
		
		sc.close();
	}
	
	void displayData()
	{
		System.out.println("\nYour Birthdate: "+day+" "+month+" "+year);
	}
}