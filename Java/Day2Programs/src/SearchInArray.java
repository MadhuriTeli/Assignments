/*7:Write a Java program , accept array ,
 * accept number from user and  find the index of
 *  number in array if present else show message not exist.
 * 
 */
import java.util.Scanner;
public class SearchInArray {
	
	
	public static int SearchInArray(int[] arr, int num){
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) 
				return i;
			}
		return  -1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements of array");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("enter Number to which index is searched");
		int num = scan.nextInt();
		int resutlt = SearchInArray(arr, num);
		if(resutlt == -1) {
			System.out.println("num not exist");
		}else {
		System.out.println(num+ "Number at " +resutlt  +" position in  array");
		}
		scan.close();
		
	}

}
