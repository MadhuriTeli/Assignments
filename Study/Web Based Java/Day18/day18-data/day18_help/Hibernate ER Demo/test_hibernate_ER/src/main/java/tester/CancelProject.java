package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.ProjectDaoImpl;
import dao.StudentDaoImpl;
import pojos.Student;

public class CancelProject {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter project id to cancel ");

			ProjectDaoImpl dao=new ProjectDaoImpl();
			System.out.println(dao.cancelProject(sc.nextInt()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
