//5:Write a program to swap two numbers.
import java.util.Scanner;
public class SwapNumbers {

	public static void main(String[] args) {
		int a, b, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before swap a= "+a+" b= "+b);
		temp =a;
		a = b;
		b=temp;

		System.out.println("Afterr swap a= "+a+" b= "+b);

	}

}
