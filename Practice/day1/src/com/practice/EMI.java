package com.practice;
//write a java program for EMI Calculator
import java.math.*;
import java.util.Scanner;
public class EMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal, EMI, rate;
		int numberOfMonths;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Principal Amount");
		principal = scan.nextDouble();
		System.out.println("Enter Rate");
		rate = scan.nextDouble();
		System.out.println("Enter Number Of Months");
		numberOfMonths = scan.nextInt();
		//EMI = (principal*rate)*(Math.pow((1+rate), numberOfMonths)/(Math.pow((1+rate), numberOfMonths)-1));
		System.out.println("EMI= " + getEMI(principal,rate, numberOfMonths));

	}
	
	static double getEMI(double p, double r, int n) {
		return (p*r)*(Math.pow((1+r), n)/(Math.pow((1+r), n)-1));
		
	}

}
