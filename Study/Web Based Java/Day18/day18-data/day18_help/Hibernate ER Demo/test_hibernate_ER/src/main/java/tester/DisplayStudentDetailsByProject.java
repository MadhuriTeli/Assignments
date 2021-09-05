package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.ProjectDaoImpl;

public class DisplayStudentDetailsByProject {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter project title");

			ProjectDaoImpl dao = new ProjectDaoImpl();
			System.out.println(dao.getStudentDetailsByProject(sc.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
