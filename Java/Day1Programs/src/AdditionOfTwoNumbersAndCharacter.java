//2:Write a program to adddition of two numbers also addition of two characters.

import java.util.Scanner;
public class AdditionOfTwoNumbersAndCharacter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 , num2;
		System.out.println("enter two numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Addition Of two Numbers= "+(num1+num2));
		
		System.out.println("enter two characters");
		char c1 = sc.next().charAt(0);
		char c2 = sc.next().charAt(0);
		//char c3 = c1+c2;
		System.out.println("Addition of Two Characters="+c1 +c2);
	}

}
