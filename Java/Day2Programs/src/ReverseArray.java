//6:Write a program which read aaray 	of 5 elements and print reverse array.
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter size of array");
	int size = scan.nextInt();
	int[] arr = new int[size];
	System.out.println("enter elements of array");
	for(int i=0; i<arr.length; i++) {
		arr[i] = scan.nextInt();
	}
	for(int i= arr.length-1; i >=0; i--) {
		System.out.print(arr[i]+" ");
	}

	}

}
