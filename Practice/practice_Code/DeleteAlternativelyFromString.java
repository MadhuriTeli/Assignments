package practice_Code;
import java.util.Scanner;
public class DeleteAlternativelyFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();

		for(int i=0; i<str.length();  i= i+2) {
			System.out.print(str.charAt(i));
		}
			
	}

}
