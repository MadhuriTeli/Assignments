package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.CourseDaoImpl;
import dao.ProjectDaoImpl;
import dao.StudentDaoImpl;
import pojos.Student;

public class CancelCourse {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter course title to cancel ");

			CourseDaoImpl dao=new CourseDaoImpl();
			System.out.println(dao.cancelCourse(sc.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
