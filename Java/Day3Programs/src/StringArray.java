//1:Write a function to accept array of string.Display all elements in uppercase.
import java.util.Scanner;
public class StringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Array Size: ");
		int n = sc.nextInt();
		String arr[]= new String[n];
		System.out.println("Enter Array Elements: ");
		for(int i=0; i<n; i++)
		{
			arr[i] =sc.next();
		}
		System.out.print("\nArray Elements Converted into UpperCase: ");
		for(int j=0; j<n;j++)
		{
			System.out.print(" "+arr[j].toUpperCase());
		}
		sc.close();
	}

}
