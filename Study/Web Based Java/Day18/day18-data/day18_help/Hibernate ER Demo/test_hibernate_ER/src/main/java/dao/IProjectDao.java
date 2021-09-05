package dao;

import java.util.Set;

import pojos.Project;
import pojos.Student;

public interface IProjectDao {
	/*
	 * 7. Start a new project i/p project details
	 */
	String startNewProject(Project p);

	/*
	 * 8. Add student in a project i/p project title , student email
	 */
	String addStudentToProject(String projectTitle, String email);

	/*
	 * 9. Remove student from project i/p project title , student email
	 */
	String removeStudentFromProject(String projectTitle, String email);

	/*
	 * 10 Get Project details i/p project title o/p : Display only project's details
	 */
	Project getProjectDetails(String projectTitle);

	/*
	 * 11 Get Project details i/p project title o/p : Display only project's details
	 */
	Set<Student> getStudentDetailsByProject(String projectTitle);
	/*
	 * 11. Cancel Project i/p project id
	 */
	String cancelProject(int projectId);
}
