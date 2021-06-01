//11:Write a  program to find sum of all even and odd numbers between 1 to n.

import java.util.Scanner;
public class SumOfEvenAndOddInRange {

	public static void main(String[] args) {
		int sumOfEven=0, SumOfOdd =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++) {
			if(i%2 == 0) {
				sumOfEven +=i;
			}
			else {
			SumOfOdd +=i;	
			}
		}

		System.out.println("Sum of all even num"+sumOfEven);
		System.out.println("Sum of all even num"+SumOfOdd);
	}

}
