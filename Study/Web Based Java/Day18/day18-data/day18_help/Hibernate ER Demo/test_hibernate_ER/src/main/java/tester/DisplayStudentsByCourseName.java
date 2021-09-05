package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Student;

public class DisplayStudentsByCourseName {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Course title");

			StudentDaoImpl dao = new StudentDaoImpl();
			dao.getStudentDetailsByCourseName(sc.next()).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
