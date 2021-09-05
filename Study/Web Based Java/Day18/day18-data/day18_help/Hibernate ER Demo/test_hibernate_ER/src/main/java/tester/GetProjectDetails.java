package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.ProjectDaoImpl;
import pojos.Project;

public class GetProjectDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter project title");

			ProjectDaoImpl dao = new ProjectDaoImpl();
			System.out.println(dao.getProjectDetails(sc.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
