/*
 * 
 * 2. Can you apply abstraction in Day 5 assignment ?
Hint : computeNetSalary method in Emp class.

 */

package tester;

import java.util.Scanner;

import com.app.org.Employee;
import com.app.org.Manager;
import com.app.org.Worker;

public class TestOrganization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter capacity");
		Employee[] emp = new Employee[sc.nextInt()];
		boolean flag = false;
		int couter=0;
		while (!flag) {
			System.out.println("ENTER 1:Hire Manager 2: Hire Worker 3:Display Information of All Employee 10:Exit");
			switch (sc.nextInt()) {
			case 1:
				if(couter<emp.length) {
					System.out.println("enter Manger details");
					System.out.println("enter id(int), name, deptId , basic(double), perfmonceBonus");
					emp[couter++]= new Manager(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble() );
				}else
					System.out.println("NO Vacancies");
				break;
			case 2:
				if(couter<emp.length) {
					System.out.println("enter Worker details");
					System.out.println("enter id(int), name, deptId , basic(double) ,hoursWorked,hourlyRate");
					emp[couter++]= new Worker(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(),sc.nextInt(), sc.nextDouble());
				}else
					System.out.println("NO Vacancies");
				break;
			case 3:
					for(Employee e: emp) {
						if(e!= null) {
							System.out.println("Details: ");
							System.out.println(e);
							System.out.println("Net Salary: "+e.computeNetSalary());;
							if(e instanceof Manager)
								System.out.println("Manger Bonus: " +((Manager) e).getBonus());
							else if(e instanceof Worker)
								System.out.println("Worker Hourly rate: " +((Worker) e).getHourlyRate());
						System.out.println();	
						}
					}
				
				break;
			case 10:flag=true;
				break;
			default: System.out.println("INVALID CHOICE");
			}

		}

	}

}
