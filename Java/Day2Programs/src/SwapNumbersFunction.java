//3:Write function to swap two numbers.
import java.util.Scanner;

public class SwapNumbersFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before Swap a ="+a+ " and b = "+b);
		SwapFunction(a, b);
	}
	
	public static void SwapFunction(int a , int b) {
		int temp;
		temp = a;
		a = b; 
		b= temp;
		System.out.println("After Swap a ="+a+ " and b = "+b);
		
	}

}
