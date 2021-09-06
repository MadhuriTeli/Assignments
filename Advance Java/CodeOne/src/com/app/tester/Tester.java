package com.app.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.core.Employee;
import static com.app.collection.DummyData.emps;
import com.app.exception.CustomEmpException;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			boolean menuLoop = true;
			int menuChoice;
			List<Employee> emp = emps();
			while (menuLoop) {
				System.out.println(
						"1. Add Employee | 2. View Employee By ID | 3. View All Emp | 4. Delete Employee | 0. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter id,name, dob,doj,sal,email,dept");
						emp.add(new Employee(sc.nextInt(), sc.next(), LocalDate.parse(sc.next()),
								LocalDate.parse(sc.next()), sc.nextDouble(), sc.next(), sc.next()));
						break;
					case 2:
						// Calls Equals Method Internally
						System.out.println("Enter Employee Id");
						Employee emp1 = new Employee(sc.nextInt());
						int index = emp.indexOf((emp1));
						System.out.println(emp.get(index));
						break;
					case 3:
						Collections.sort(emp);
						for (Employee e : emp)
							System.out.println(e);
						break;
					case 4:
						System.out.println("Enter Employee Id");
						Employee emp2 = new Employee(sc.nextInt());
						int index1 = emp.indexOf((emp2));
						emp.remove(index1);
						break;
					case 0:
						System.out.println("Parat Bhetu");
						menuLoop = false;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} finally {
			if (sc != null)
				sc.close();
		}
	}

}
