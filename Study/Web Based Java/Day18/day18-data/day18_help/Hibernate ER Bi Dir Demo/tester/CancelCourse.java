package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.CourseDaoImpl;

public class CancelCourse {

	public static void main(String[] args) {
		// invoke static method of HibernateUtils to trigger class loading => creation
		// of
		// the singleton SF
		try (SessionFactory sf = getSf();Scanner sc=new Scanner(System.in)) {
			CourseDaoImpl dao = new CourseDaoImpl();
			System.out.println("Enter course name to cancel a course");
			System.out.println("Status "+dao.deleteCourseByName(sc.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
