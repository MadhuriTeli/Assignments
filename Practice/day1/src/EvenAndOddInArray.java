import java.util.Scanner;
public class EvenAndOddInArray {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter size of 1D array");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements  1D of array");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}		
		System.out.println("enter rows and columns for  of 2D array");
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		int[][] arr2D = new int[rows][cols];
		System.out.println("enter elements  2D of array");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
			arr2D[i][j] = scan.nextInt();
			}
		}			
		System.out.println("IN 1D Array");	
		EvenAndOddIn1DArray(arr);
	
		System.out.println("IN 2D Array");
		EvenAndOddIn2DArray(arr2D, rows, cols);
		scan.close();
	}	

	/***********************1DArray****************************/
	static void EvenAndOddIn1DArray(int[] arr) {
		int numberOfEven=0, NumberOfOdd=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				numberOfEven+=1;
			}
			else {
				NumberOfOdd+=1;
			}
		}
		System.out.println("numberOfEven :  "+numberOfEven);
		System.out.println("NumberOfOdd: "+NumberOfOdd);
	}
	/***********************2DArray****************************/
	static void EvenAndOddIn2DArray(int[][] arr, int rows, int cols) {
		int numberOfEven=0, NumberOfOdd=0;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
			if(arr[i][j]%2==0) {
				numberOfEven+=1;
			}
			else {
				NumberOfOdd+=1;
			}
			}
		}
		System.out.println("numberOfEven:  "+numberOfEven);
		System.out.println("NumberOfOdd: "+NumberOfOdd);
	}
	

}
