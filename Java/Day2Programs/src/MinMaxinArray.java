/*
 9: Write a program to create an array of integers and perform following operations on that array like 
finding the sum, average, maximum and minimum number in that array. Accept the numbers of the 
array from user.

 */

import java.util.Scanner;
public class MinMaxinArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements of array");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Sum of elements of array : "+SumOfArray(arr));
		int sum = SumOfArray(arr);
		float avg = sum/size;
		System.out.println("Average of elements of array : "+avg);
		System.out.println("Minimum of elements of array : "+MinInArray(arr));
		System.out.println("Maximum of elements of array : "+MaxInArray(arr));
		
	}
	public static int MinInArray(int[] arr) {
		int min = 256;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] < min)
			   {
			     min = arr[i];
			   }
		}
		return min;
	}
	
	
	public static int MaxInArray(int[] arr) {
		int max = -256;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] > max)
			   {
			     max = arr[i];
			   }
		}
		return max;
	}
	
	
	
	
	public static int SumOfArray(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	
	

}
