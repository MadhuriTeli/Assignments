package com.app.org;

public class Worker extends Employee {
	private int hoursWorked;
	private double hourlyRate;
	public Worker(int id, String name, int deptId, double basic, int hoursWorked, double hourlyRate) {
		super(id, name, deptId, basic);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	@Override
	public String toString() {
		return "Worker [hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + ", toString()=" + super.toString()
				+ "]";
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	@Override
	public double computeNetSalary() {
		return getBasic()+(hoursWorked*hourlyRate);
	}

}
