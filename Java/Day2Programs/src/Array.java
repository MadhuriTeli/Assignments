//5:Write a program to accept array of 5 numbers and display it.

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] arr;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scan.nextInt();
		 arr = new int[size];
		

		System.out.println("Enter elements");
		for(int i=0 ; i< arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
