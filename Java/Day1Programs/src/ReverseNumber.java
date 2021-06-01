//12: Write a  program to enter a number and print its reverse.
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int revNum=0, rem;
		System.out.println("enter the number \n");
		int num = sc.nextInt();
		while(num!=0) {
			rem = num%10;
			revNum = revNum *10 +rem;
			num /= 10;
		}
		System.out.println("Reverse Number " +revNum);

	}

}
