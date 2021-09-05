package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.Address;
import pojos.Student;

public class NewStudentAdmissionWithAddress {

	public static void main(String[] args) {

		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {

			// create student dao instance
			StudentDaoImpl studentDao = new StudentDaoImpl();
			System.out.println("Enter course name ");
			String title = sc.next();
			System.out.println("Enter student details name email ");
			Student s=new Student(sc.next(), sc.next());
			System.out.println("Enter Address details city state country");
			Address a=new Address(sc.next(), sc.next(), sc.next());
			System.out.println(
					"Admission status " 
			+ studentDao.admitNewStudentWithAddress(title,s,a));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
