package utils;

import com.app.vehicles.Vehicle;

import custom_exception.VehicleHandlingException;

public class ValidationRules {

	public static Vehicle checkDuplication(Vehicle[] vehicleData, int regNo, String color,double price)
			throws VehicleHandlingException {
		Vehicle newVehicle = new Vehicle(regNo, color, price);
		for (Vehicle v : vehicleData)
			if (v != null)
				if (v.equals(newVehicle))
					throw new VehicleHandlingException("Duplicate Vehicle Detected");
		System.out.println("NO DUPLICATION");
		return newVehicle;
	}

}
