//15:Write a program to find greatest of three numbers using nested if-else.
import java.util.Scanner;
public class GreatestOfThreeNumber {

	public static void main(String[] args) {
		int num1,  num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three nums ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1+" is Greatest");
		}else {
			if(num2> num3) {
				System.out.println(num2+" is Greatest");
			}else {

				System.out.println(num3+ " is Greatest");
			}
		}
		
	}

}
