package tester;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utils.validationUtils.validateStudent;
import static utils.CollectionUtils.populateList;
import pojo.Student;

public class StudentTester {

	public static void main(String[] args) throws Exception {

		try (Scanner sc = new Scanner(System.in)) {
			List<Student> students = populateList();
			boolean menu = true;
			int choice;
			while (menu) {
				try {
					System.out.println("1. Enroll Student | 2. Display Student | 3. Exit");
					choice = sc.nextInt();
					switch (choice) {
					case 1:
						List<String> courses = new ArrayList<>();
						System.out.println("Enter Student name,age,registration date(dd/mm/yyyy)");

						String name = sc.next();
						int age = sc.nextInt();
						String regDate = sc.next();

						System.out.println("Enter courses One By One for which student is enrolled");
						int i = 1;
						while (i == 1) {
							System.out.println("Enter Course Name");
							courses.add(sc.next());
							System.out.println("Want to Add More Press 1 or else 0");
							i = sc.nextInt();
						}

						Student s = validateStudent(name, age, courses, regDate, students);
						students.add(s);
						System.out.println("Student Added Succesfull");
						break;
					case 2:
						students.forEach(System.out::println);
						break;
					case 3:
						try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.list"))) {
							out.writeObject(students);
						}
						menu = false;
						System.out.println("Thank You For Using Application");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
