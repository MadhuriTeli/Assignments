package com.app.pojo;

import java.io.Serializable;

public class Menu implements Serializable{
	private int id;
	private String menu;
	private String time;
	private double price;
	
	public Menu(int id,String menu, String time, double price) {
		this.id = id;
		this.menu = menu;
		this.time = time;
		this.price = price;
	}
	
	public Menu(String menu, String time, double price) {
		this.menu = menu;
		this.time = time;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Menu [id=" + id + ", menu=" + menu + ", time=" + time + ", price=" + price + "]";
	}
	
	
	
}
