package com.app.vehicles;

//state(data members)  : registrationNo : int , color : String , price : double
public class Vehicle {
	private int registrationNo;
	private String color;
	private double price;

	public Vehicle(int registrationNo, String color, double price) {
		super();
		this.registrationNo = registrationNo;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [registrationNo=" + registrationNo + ", color=" + color + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object anotherObject) {
		// unique ID for testing equality : regNo (Primary key)
		System.out.println("in vehicle equals...");
		if (anotherObject instanceof Vehicle)
			return this.registrationNo == ((Vehicle) anotherObject).registrationNo;
		return false;
	}

}
