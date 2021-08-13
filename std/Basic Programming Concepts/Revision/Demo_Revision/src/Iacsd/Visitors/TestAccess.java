package Iacsd.Visitors;

import IacsdStudent.Student;

public class TestAccess {

	public static void main(String[] args) {


		Student s=new Student();
		//s.name="vaishali";//private not outside class
		//s.rollno=90;//default not accessible outside package
		//s.total=90;// accessible outside package but in sub class 
		s.address="pune";//everywhere 
		s.acceptData();
		s.displayData();

	}

}
