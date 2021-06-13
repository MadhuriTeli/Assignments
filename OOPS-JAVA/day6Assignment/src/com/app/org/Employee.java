package com.app.org;

public abstract class Employee {
	private int id, deptId;
	private String name;
	private double basic;
	
	public Employee(int id, String name, int deptId, double basic) {
		this.id = id;
		this.name=name;
		this.deptId=deptId;
		this.basic=basic;				
	}
	public double getBasic() {
		return this.basic;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", deptId=" + deptId + ", name=" + name + ", basic=" + basic + "]";
	}
	
	public abstract double computeNetSalary();
}
