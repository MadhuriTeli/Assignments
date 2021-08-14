package utils;

import com.app.vehicles.Vehicle;

import custom_exception.VehicleHandlingException;

public class ValidationRules {
//add a static method to chk for dup vehicle
	public static void checkForDup(Vehicle[] vehicleData, int regNo, String color) throws VehicleHandlingException {
		// create vehicle type of object holding regNo n clr
		Vehicle newVehicle = new Vehicle(regNo, color);// id based fields
		// for-each : equals of Vehicle class : Vehicle ref
		for (Vehicle v : vehicleData)
			if (v != null)
				if (v.equals(newVehicle))
					throw new VehicleHandlingException("Dup vehicle detected!!!!!!");
		System.out.println("no dup detected....");

	}

}
