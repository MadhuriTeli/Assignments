package tester;

import static utils.HibernateUtils.getSf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.CourseDaoImpl;
import pojos.Course;
import pojos.Student;


public class LaunchNewCourseWithStudents {

	public static void main(String[] args) {
		
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			// create course dao instance
			CourseDaoImpl courseDao = new CourseDaoImpl();
			System.out.println("Enter course details  title,  startDate,  endDate,  fees,  capacity");
			Course c1 = new Course(sc.next(), sdf.parse(sc.next()), sdf.parse(sc.next()),
					sc.nextDouble(), sc.nextInt());
			//accept student details
			while(true)
			{
				System.out.println("Enter student details : name n email or 'quit' to exit");
				String name=sc.next();
				if(name.equalsIgnoreCase("quit"))
					break;
				c1.addStudent(new Student(name, sc.next()));		
				
			}
			System.out.println("Reg status "+courseDao.launchNewCourse(c1));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
