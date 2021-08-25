package com.app.student;

public enum StudentCourses {
	DBT(10), REACT(50),ANGULAR(20),REST(25),SPRING(15),HIBERNATE(20);

	private static int capacity;
	StudentCourses(int i) {
		// TODO Auto-generated constructor stub
	}
	public  int getCapacity() {
		return capacity;
	}
	public static  void setCapacity(int capacity) {
		capacity = capacity;
	}
//	StudentCourses(int i) {
//		capacity = i;
//	}
}
