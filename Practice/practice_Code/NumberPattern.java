/*
 * 		1
 * 		1 2 1
 * 		1 2 3 2 1
 *		1 2 3 5 3 2 1
*/


package practice_Code;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num");
		int num= sc.nextInt();

        for(int i=1; i<=num; i++) // outer loop for rows
        { 
 
            for(int j=1; j<=i; j++)
            { 
            	System.out.print(j); 
            } 
            for(int j=i-1; j>=1; j--) 
            { 
            	System.out.print(j); 
            }
    
            // ending line after each row 
            System.out.println(); 
        } 

	}

}
