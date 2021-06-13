/*3.4 Create a Tester : VehicleShowroom 
Create suitable data structure to store vehicle information.
Add Options
1. Add new vehicle :
It should add a vehicle iff it's not duplicate.
2. Display all vehicles
3. Exit
 */

package tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;
import static utils.ValidationRules.checkDuplication;
import custom_exception.VehicleHandlingException;

public class VehicleShowroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Vehicle[] vehicles = new Vehicle[5];
			boolean exit = false;
			int counter = 0;
			while (!exit) {
				System.out.println("1. Add new vehicle 2. Display all vehicles 3. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						if (counter < vehicles.length) {
							System.out.println("Enter Vehicle Details: regNo, color, price");
							// int regNO=sc.nextInt();
							// String clr=sc.next();
							// double price= sc.nextDouble();
							// tester has to invoke method of validationRule: static
							// checkDuplication(vehicles, regNO, clr);
							// If not duplicate add data to array
							// if duplicate then goto catch exception
							// vehicles[counter++]= new Vehicle(regNO, clr,price);
							Vehicle v = checkDuplication(vehicles, sc.nextInt(), sc.next(), sc.nextDouble());
							vehicles[counter++] = v;
							System.out.println("Vehicle added Successfully");
						} else {
							throw new VehicleHandlingException("Showroom Full");
						}

						break;
					case 2:
						System.out.println("Showroom Details");
						for (Vehicle v : vehicles) {
							if (v != null)
								System.out.println(v);
						}
						break;
					case 3:
						exit = true;
						break;
					default:
						System.out.println("Invalid Option");
					}
				} 
				catch (Exception e) {
					e.printStackTrace();
				}

			}

		}

	}

}
