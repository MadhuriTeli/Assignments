//4.Write a function /method which takes variable no of int numbers as an argument and returns the sum of these arguments as an output.
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		

		Sum obj = new Sum();
		int result = obj.test(10,10,10,10,10);
		System.out.println("Sum of Arguements: "+result);
	}
	int test(int...a)
	{
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		return sum;
	}

}
