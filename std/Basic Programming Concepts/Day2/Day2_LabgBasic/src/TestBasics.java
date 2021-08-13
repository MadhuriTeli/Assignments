import java.util.Scanner;
public class TestBasics {
public static void main(String[] args) {
	
	int empid;
	String name,address;
	double salary;
	double iTax;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Emp Info:");
	System.out.println("EmpId:");
	empid=sc.nextInt();//reading int
	System.out.println("Name:");
	name=sc.next();
	System.out.println("Address:");
	address=sc.next();
	System.out.println("Salary:");
	salary=sc.nextDouble();
	System.out.println("--------------------------------");
	
	if(salary>80000)
		iTax=8000;
	else if(salary <79000 && salary >40000)
		iTax=5000;
	else
		iTax=1000;
	System.out.println("EmpId:"+empid);
	System.out.println("Name:"+name);
	System.out.println("Address:"+address);
	System.out.println("Salary:"+salary);
	System.out.println("iTax="+iTax);
	System.out.println("--------------------------------");
	System.out.println("EmpId:"+empid +" Name:"+name +" Address:"+address+"  Salary:"+salary);
	
	
}
}
