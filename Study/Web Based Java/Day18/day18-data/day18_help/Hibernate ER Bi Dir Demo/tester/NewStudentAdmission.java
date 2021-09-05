package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Student;

public class NewStudentAdmission {

	public static void main(String[] args) {

		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {

			// create student dao instance
			StudentDaoImpl studentDao = new StudentDaoImpl();
			System.out.println("Enter course name ");
			String title = sc.next();
			System.out.println("Enter student details name email ");
			System.out.println(
					"Admission status " 
			+ studentDao.admitNewStudent(title, new Student(sc.next(), sc.next())));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
