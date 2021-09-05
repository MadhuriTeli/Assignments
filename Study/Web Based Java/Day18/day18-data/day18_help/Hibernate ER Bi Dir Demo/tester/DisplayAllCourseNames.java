package tester;

import static utils.HibernateUtils.getSf;

import org.hibernate.SessionFactory;

import dao.CourseDaoImpl;

public class DisplayAllCourseNames {

	public static void main(String[] args) {
		// invoke static method of HibernateUtils to trigger class loading => creation
		// of
		// the singleton SF
		try (SessionFactory sf = getSf()) {
			CourseDaoImpl dao = new CourseDaoImpl();
			dao.getAllCourseNames().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
