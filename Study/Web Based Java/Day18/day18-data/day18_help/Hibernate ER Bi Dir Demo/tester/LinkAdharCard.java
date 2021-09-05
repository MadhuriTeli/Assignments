package tester;

import static utils.HibernateUtils.getSf;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.StudentDaoImpl;
import pojos.AdharCard;
import pojos.Student;

public class LinkAdharCard {

	public static void main(String[] args) {

		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {

			// create student dao instance
			StudentDaoImpl studentDao = new StudentDaoImpl();
			System.out.println("Enter student id n adhar card details : card no location date ");

			System.out.println("Status  : " + studentDao.linkAdharCard(sc.nextInt(),
					new AdharCard(sc.next(), sc.next(), LocalDate.parse(sc.next()))));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
