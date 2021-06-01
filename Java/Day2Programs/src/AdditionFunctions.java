//4:Write functions for making addition of diffrent types(use FunctionOverloading);
import java.util.Scanner;
public class AdditionFunctions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Integer Number");
		int num1Int = sc.nextInt();
		int num2Int = sc.nextInt();
		
		System.out.println("Enter two Double Number");
		double num1Double = sc.nextDouble();
		double num2Double = sc.nextDouble();

		System.out.println("Enter two float Number");
		float num1Float= sc.nextFloat();
		float num2Float = sc.nextFloat();
		
		System.out.println("Enter two Char");
		char c1 = sc.next().charAt(0);
		char c2 = sc.next().charAt(0);
		Addition(c1 ,c2);
		

		System.out.println("Addition of number: "+ Addition(num1Int, num2Int));
		System.out.println("Addition of double: "+ Addition(num1Double, num2Double));
		System.out.println("Addition of float: "+ Addition(num1Float, num2Float));
		
	}
	
	public static int Addition(int a , int b) {
		return a+b;
	}
	public static double Addition(double a ,double b) {
		return a+b;
	}
	public static float Addition(float a, float b) {
		return a+b;
	}
	public static void Addition(char a, char b) {
		System.out.println("Addition of char: "+a+""+b);
	}

}
