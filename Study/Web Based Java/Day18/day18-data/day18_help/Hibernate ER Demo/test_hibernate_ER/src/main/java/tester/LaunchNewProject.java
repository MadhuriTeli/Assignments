package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.ProjectDaoImpl;
import pojos.Project;

public class LaunchNewProject {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter New Project Details : projectTitle,  technlogy,  completionDate");

			ProjectDaoImpl dao = new ProjectDaoImpl();
			System.out.println(dao.startNewProject(new Project(sc.next(), sc.next(), LocalDate.parse(sc.next()))));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
