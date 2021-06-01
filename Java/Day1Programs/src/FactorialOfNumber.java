//6:Write a program to find factorial of a given number.
import java.util.Scanner;
public class FactorialOfNumber {

	public static void main(String[] args) {
		int num, fact =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Number");
		num = sc.nextInt();
		for(int i = 1; i<=  num; i++) {
			fact *= i;
		}
		System.out.println("Factorial of Number= " + num + " is "+ fact);
	}

}
