/*
 * Problem Statement 1
1.1:Create 2 classes Student and Batch. Student class is in pack1 and Batch
class is in pack2. Write accept() and  display() methid in both the class to accept and to display info.
Write a Test class to print Student and Batch
information.
1.2:Use the Student and Batch classes created earlier. It should contain
public  rollNo,Public  Name, private  Grade and default  totalMarks attributes and using Batch
class, check accessibility of there attributes in same package .
1.3:
Create new package pack2.
create class testStudent in pack3;
create object of Student class from pack1 and access methods.Try to check accessibility.

 * 
 */


package first.pack1;
import java.util.Scanner;
public class Student {
	private int rollNo;
	private String name;
	private char Grade;
	int  totalMarks;
	Scanner sc = new Scanner(System.in);

	public void  accept() {
        System.out.println("Enter roll no and Name");
		setRollNo(sc.nextInt());
		name = sc.next();
		
	}
	
	public void display() {
		System.out.println("RollNo = "+getRollNo()+ " name "+name);
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	

}
