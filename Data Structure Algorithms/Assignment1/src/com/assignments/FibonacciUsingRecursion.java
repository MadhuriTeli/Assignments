package com.assignments;

import java.util.Scanner;

public class FibonacciUsingRecursion {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Number");
			int n = sc.nextInt();
			System.out.println(fibonacci(n));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public static int fibonacci(int num) {
		if(num <= 1) {
			return num;
		}
		else {
			return (fibonacci(num-1)+fibonacci(num-2));
		}
		
	}

}
