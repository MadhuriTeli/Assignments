import java.util.Scanner;

public class Student {

	private int rollno;// hide from outer world
//private  are accesible inside the class only...hidden outside class
	private String name;// member variable/fields/attributes
	private double totalMarks;
	private String grade;

	private   static String nationality = "Indian";// static variable//static variable can be constat
	private final double pi = 3.14;// constant
	// methods//member functions/behaviour

	public void acceptInfo() {
// pi=9090.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("RollNo:");
		rollno = sc.nextInt();// local variable inside function
		System.out.println("Name:");
		name = sc.next();
		System.out.println("Total:");
		totalMarks = sc.nextDouble();
//sc.close();
	}
	
	public void setTotalMarks(double total)
	{
		totalMarks=total;
		
	}
	
	

	private void calGrade()// Helper Method
	{
		if (totalMarks > 80)
			grade = "A+";
		else if (totalMarks <= 80 && totalMarks >= 70)
			grade = "A";
		else
			grade = "B";

	}

	public void displayInfo() {
		int a = 10;// local
		calGrade();
		System.out.println("RollNo:" + rollno);
		System.out.println("Name:" + name);
		System.out.println("TotalMarks:" + totalMarks);
		System.out.println("Grade:" + grade);
	}

}
