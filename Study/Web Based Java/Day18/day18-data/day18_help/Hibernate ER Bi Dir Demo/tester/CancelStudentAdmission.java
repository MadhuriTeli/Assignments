package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Student;

public class CancelStudentAdmission {

	public static void main(String[] args) {

		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {

			// create student dao instance
			StudentDaoImpl studentDao = new StudentDaoImpl();
			System.out.println("Enter course id n student id ");
			System.out.println(studentDao.cancelAdmission(sc.nextInt(), sc.nextInt()));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
