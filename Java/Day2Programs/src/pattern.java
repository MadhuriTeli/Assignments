/*
 1:Java program to print the following pattern on the console
*
* *
* * *
* * * *
* * * * *
 */
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j ,rows;
		System.out.println("enter the num row");
		rows = sc.nextInt();
		   for (i = 1; i <= rows; ++i) {
			   for (j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
		

	}

}
