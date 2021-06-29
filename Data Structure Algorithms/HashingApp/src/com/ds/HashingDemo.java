package com.ds;

import java.util.Scanner;

public class HashingDemo {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int element;
		System.out.println("Input 5 +ve integers of the array");
		Scanner sc = new Scanner(System.in);
		Hashing obj = new Hashing();
		int hashCode;
		for (int i=1;i<=5;i++)
		{
			element = sc.nextInt();
			hashCode = obj.myHash(element);
			//System.out.println("Hash Code = " + hashCode);
		
			if (arr[hashCode]==0) // Array index is vacant
			{
				arr[hashCode] = element;
			}
			else  // If not zero, then element already exists.
			{
				System.out.println("Collision for element number " + i);
			}
		}

		System.out.println("Non zero elements of the array are:");
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]!=0)
			{
				System.out.println("arr[" + i + "] = " + arr[i]);
			}
		}
		sc.close();
	}
}