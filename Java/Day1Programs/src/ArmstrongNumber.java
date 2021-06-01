//14:Write a program to check entered number is Armstrong number or not.
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num \n");
		int num, rem, originalNum, cubeSum=0;
		num = sc.nextInt();
		double cube=0;
		originalNum = num;
		while(num != 0) {
			rem = num%10;
			cube = Math.pow(rem, 3);
			cubeSum +=cube;
			num /= 10;	
		}
		//System.out.println(cubeSum);
		if(originalNum == cubeSum) {
			System.out.println("It is a Armstrong Number");
		}
		else {
			System.out.println("It is not a Armstrong Number");
		}

	}

}
