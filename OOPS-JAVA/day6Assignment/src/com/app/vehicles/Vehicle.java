package com.app.vehicles;

public class Vehicle {
	private int registrationNO;
	private String color;
	private double price;

	public Vehicle(int registrationNO, String color, double price) {
		super();
		this.registrationNO = registrationNO;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [registrationNO=" + registrationNO + ", color=" + color + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object v2) {
		if (v2 instanceof Vehicle)
			return this.registrationNO == ((Vehicle) v2).registrationNO;
		return false;
	}
}
