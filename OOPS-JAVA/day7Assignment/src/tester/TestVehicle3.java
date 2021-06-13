package tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class TestVehicle3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st vehicle details : regno color price");
		Object v1=new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());//up casting
		System.out.println("Enter 2nd vehicle details : regno color price");
		Object v2=new Vehicle(sc.nextInt(), sc.next(), sc.nextDouble());//up casting
		System.out.println(v1.equals(v2)?"SAME":"DIFFERENT");
//		System.out.println(v1.hashCode()+" "+v2.hashCode());
		String s=new String("hello");
		System.out.println(v1.equals(null));//false
		System.out.println(v1.equals(s));//false
		sc.close();
	}

}
