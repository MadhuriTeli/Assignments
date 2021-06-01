//4:Write a program to calculate power of a number.
//7:Write a program to find m to the power n
import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base, power;
        long result = 1;
		System.out.println("enter Number and  its power");
		base = sc.nextInt();
		power = sc.nextInt();
		
		//for(; power != 0; --power) {
			for(int i=0; i< power; i++) {

            result *= base;
		//	System.out.println("power of number ="+ result);
		}	
        System.out.println("Answer = " + result);
	}

}
