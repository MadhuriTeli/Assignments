///7:Write a java program to convert char array into String.
import java.util.Scanner;
public class CharToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of character array: ");
		int size = sc.nextInt();
		char[] ch =new char [size];
		System.out.println("Enter array elements: ");
		for(int i=0; i<size; i++)
		{
			ch[i]= sc.next().charAt(0);
		}
		System.out.print("\nCharater Array: |");
		for(int i=0; i<size; i++)
		{
			System.out.print(ch[i]+"|");;
		}
		String s = new String(ch);
		System.out.println("\n\nConverting Char Array to String: "+s);
		sc.close();
	}

}
