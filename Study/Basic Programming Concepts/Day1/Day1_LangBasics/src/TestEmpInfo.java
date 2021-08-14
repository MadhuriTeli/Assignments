import java.util.Scanner;
public class TestEmpInfo {

public static void main(String[] args) {
	
	//how to accept data from user
	
	System.out.println("Employee Information");
	//Scanner class is used for reading information from console
	Scanner sc=new Scanner(System.in);//
	int empid;
	String name;
	String address;
	double salary;
	boolean married;
	System.out.println("Enter EmpId:");
	empid=sc.nextInt();//read int value
	System.out.println("Enter Name:");
	name=sc.next();//read string
	System.out.println("Enter Address:");
	address=sc.next();//read string
	System.out.println("Enter Salary:");
	salary=sc.nextDouble();
	System.out.println("Married:");
	married=sc.nextBoolean();
	System.out.println("-------------------------");
	System.out.println("Empid="+empid);
	System.out.println("Name="+name);
	System.out.println("Address:"+address);
	System.out.println("Salary:"+salary);
	System.out.println("Married:"+married);
	
	
}
}
