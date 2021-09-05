package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.CourseDaoImpl;
import pojos.Course;

public class GetCourseNStudentsDetails {

	public static void main(String[] args) {
		// invoke static method of HibernateUtils to trigger class loading => creation
		// of
		// the singleton SF
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			CourseDaoImpl dao = new CourseDaoImpl();
			System.out.println("Enter course name to display course details ");
			Course c = dao.getCourseStudentDetails(sc.next());
			System.out.println("Couse details");
			System.out.println(c);
			System.out.println("Student details ");
			c.getStudents().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
