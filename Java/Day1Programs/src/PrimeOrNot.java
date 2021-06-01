//8:Check if number is a prime number or not.
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		int num;
		boolean flag= false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		num = sc.nextInt();
		for(int i = 2; i<= num/2; i++) {
			if(num%i == 0) {
				flag = true;
				System.out.println("Number is not Prime \n");
				break;
			}
		}
		if(flag == false) {
			System.out.println("Number is Prime \n");
		}

	}

}
