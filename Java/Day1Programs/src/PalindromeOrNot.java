//10:Check whether the number is palindrome or not?

import java.util.Scanner;
public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int revNum=0, orginalNum, rem;
		System.out.println("enter the number \n");
		int num = sc.nextInt();
		orginalNum = num;
		while(num!=0) {
			rem = num%10;
			revNum = revNum *10 +rem;
			num /= 10;
		}

		if(orginalNum == revNum) {
			System.out.println("Number is Palindrom");
		}
		else {
			System.out.println("Number is Not Palindrom");	
		}
		
	}

}
