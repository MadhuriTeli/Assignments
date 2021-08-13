package com.app.core;

import java.util.Arrays;

public enum CustomerCategory {
	SILVER(500,new String[] {"Platform"}),
	GOLD(1000,new String[] {"Platform","Web Server"}),
	DIAMOND(1500,new String[] {"Platform","Web Server","App Deployment"})
	,PLATINUM(2000,new String[] {"Platform","Web Server","App Deployment","Docker"});
	//additional state
	private double charges;
	private String[] services;
	//add parameterized constr to init additional state
	 CustomerCategory(double charges,String[] services) {
		//super(name,ordinal) : implicitly called : by javac
		 this.charges=charges;
		 this.services=services;		 
	}
	 //for later validations : supply getters
	public double getCharges() {
		return charges;
	}
	public String[] getServices() {
		return services;
	}
	@Override
	public String toString()
	{
		return name()+" charges : "+charges+" Services "+Arrays.toString(services);
	}
	 
	 

}
