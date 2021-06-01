//13:Write a  program to print all Prime numbers between 1 to n.
import java.util.Scanner;
public class PrimeNumberInRange {

	public static void main(String[] args) {
		int num,  count;
		boolean flag= false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		num = sc.nextInt();
		for(int i =1; i<= num; i++) {
			 count = 0;
		for(int j = 2; j<= i/2; j++) {
			if(i%j == 0) {
				//flag = true;
				count++;
				//System.out.println("Number is not Prime \n");
				break;
			}
		}
		if(count == 0) {
			System.out.println(i);
		}
	}
		}

}
