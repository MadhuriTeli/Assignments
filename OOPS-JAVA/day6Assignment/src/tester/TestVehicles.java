/*
 * 4. Create a class Vehicle , under the package : com.app.vehicles , to represent any vehicle. 
tight encapsulation
state(data members)  : registrationNo : int , color : String , price : double
registrationNo  MUST be unique (non duplicate) for any vehicle (primary Key : unique ID)
Override toString to return complete state.
DO NOT override equals



Create a class TestVehicle under the package "tester"
Accept details of 2 vehicles from user . 
Display "SAME" or "DIFFERENT" , in case of same or different reg nos.
(try to invoke equals : inherited from Object class : v1.equals(v2)) 

 */

package tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class TestVehicles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vehicle v1, v2;
		System.out.println("Enter vehicle 1  registrationNo : int , color : String , price : double");
		v1= new Vehicle(scan.nextInt(), scan.next(), scan.nextDouble());
		System.out.println("Enter vehicle 2  registrationNo : int , color : String , price : double");
		v2= new Vehicle(scan.nextInt(), scan.next(), scan.nextDouble());
		System.out.println(v1.equals(v2)? "SAME" : "DIFFERENT");
	}

}
