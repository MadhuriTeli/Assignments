import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Id Name Address Sal");
		int no=sc.nextInt();
		String nm=sc.next();
		String add=sc.next();
		double sal=sc.nextDouble();
		
		Employee emp1=new Employee();//imp
		//emp1.acceptInfo(no, nm, add, sal);
		
		emp1.displayInfo();
		
		Employee emp2=new Employee();
		//emp2.acceptInfo();
		emp2.displayInfo();
		
		
		
	}

}
