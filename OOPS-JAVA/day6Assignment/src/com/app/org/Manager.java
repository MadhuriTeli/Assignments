package com.app.org;

public class Manager extends Employee {
	private double performanceBonus;
	public Manager(int id, String name, int deptId, double basic, double performanceBonus) {
		super(id, name, deptId,basic);
		this.performanceBonus=performanceBonus;
	}
	public double getBonus() {
		return performanceBonus;
	}
	
	@Override
	public String toString() {
		return "Manager "+super.toString()+ " Performance Bonus: "+performanceBonus;
	}
	
	@Override
	public double computeNetSalary() {
		return getBasic()+performanceBonus;
	}

}
