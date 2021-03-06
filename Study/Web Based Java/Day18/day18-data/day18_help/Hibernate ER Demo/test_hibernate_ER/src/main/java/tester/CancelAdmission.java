package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Student;

public class CancelAdmission {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Student id to cancel admission");

			StudentDaoImpl dao = new StudentDaoImpl();
			System.out.println(dao.cancelAdmission(sc.nextInt()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
