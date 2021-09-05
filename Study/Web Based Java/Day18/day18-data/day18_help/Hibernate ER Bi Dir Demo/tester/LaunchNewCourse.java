package tester;

import static utils.HibernateUtils.getSf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.CourseDaoImpl;
import pojos.Course;


public class LaunchNewCourse {

	public static void main(String[] args) {
		
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			// create course dao instance
			CourseDaoImpl courseDao = new CourseDaoImpl();
			System.out.println("Enter course details  title,  startDate,  endDate,  fees,  capacity");
			Course c1 = new Course(sc.next(), sdf.parse(sc.next()), sdf.parse(sc.next()),
					sc.nextDouble(), sc.nextInt());
			System.out.println("Reg status "+courseDao.launchNewCourse(c1));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
