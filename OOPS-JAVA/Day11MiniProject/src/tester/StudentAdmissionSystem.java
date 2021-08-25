package tester;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static com.app.core.Department.valueOf;
import static utils.ValidationRules.*;

import com.app.core.Department;
import com.app.core.Emp;
import com.app.student.Student;
import com.app.student.StudentCourses;

import custom_exception.EmpHandlingException;

public class StudentAdmissionSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Student> std = new ArrayList<>(4);
			boolean exit = false;
			int counter = 0;

			while (!exit) {
				System.out.println(
						"1. Admit New Student 2. Assign Contact Details 3. Update Student's phone no.4. Cancel Admission 5. Display names & phone nos of students enrolled in a specified course 6 Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter prn,  name,  email,  password,  gpa,  dob(d-m-y),  course");
						// AL API : add
//						String prnNo = sc.next();
//						Student st=new Student(prnNo);
//					//	System.out.println(std.contains(st)?"PRN Exist":"New PRN");
//						System.out.println(std.contains(st));
						std.add(new Student(validatePRN(sc.next(), std), sc.next(), validateEmail(sc.next()), validatePassWord(sc.next()),
								validateGPA(sc.nextDouble()), convertDate(sc.next()), validateCourses(sc.next())

						));
						System.out.println("Student added");
						break;
					case 2:
						
						
					    //invoke a method to chk if customer with specified email exists
						System.out.println("Enter Student prn no to add contact details")
					    c1=findStudentByPRN(sc.next(), std);
					    System.out.println("Enter city , state , phoneNo");
						c1.addContactDetails(sc.next(), sc.next(), sc.next());
						
						
						break;
					case 3:
						break;
					case 4:
						
						
						System.out.println("Enter Student prn , Student's phone no");
						String prnNO = sc.next();
						String phoneNO = sc.next();
						Department dept = valueOf(sc.next().toUpperCase());
						// chekc if emp exists by it's id : search by PK
						index = emps.indexOf(new Emp(id));
						if (index == -1)
							throw new EmpHandlingException("Invalid emp id : Emp not found!!!!!");
						// => emp details exist
						// get emp details
						Emp emp = emps.get(index);
						emp.setSalary(emp.getSalary() + salIncr);
						emp.setDept(dept);
						System.out.println("updated emp details...");
						
						break;
					case 5:
						break;
					case 6:
						exit = true;
						break;

					case 7:
						System.out.println("Student Details");
						for (Student s : std)// 0 --size-1
							System.out.println(s);
						break;
					}

				}

				catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}

		}

	}

}
