package practice_Code;
import java.util.Scanner;
public class ChildPalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Num");
		int num = sc.nextInt();
		int num1=palindromeOrNot(num);
		System.out.println(num1);
		System.out.println(PalindromeCheck(num1));	
	}
	
	public static int palindromeOrNot(int num) {
		int rem=0, i=0, sum=0, newNum=0, count=0;
		int cp=num;
		while(cp != 0) {
			int rem1= cp%10;
			cp= cp/10;
			count++;
		}
		int[] A = new int[count] ;
		while(num != 0) {
			A[i]= num%10;
			num= num/10;
			i++;
		}	 	
		for(int j=A.length-1; j>0; j=j-2) {
			sum=A[j]+A[j-1];
			newNum= newNum*10+sum;
			sum=0;
		}	
		return newNum;
	}
	public static boolean PalindromeCheck(int num) {
		int rem=0, rev=0;
		int copy=num;
		while(num>0) {
			rem = num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(copy== rev) 
			return true;
		else
			return false;
	}
	

}


