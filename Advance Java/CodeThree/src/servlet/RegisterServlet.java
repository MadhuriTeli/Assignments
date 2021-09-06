package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDaoImpl;
import pojo.Student;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDaoImpl dao;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	@Override
	public void init() throws ServletException {
		try {
			dao = new StudentDaoImpl();
			System.out.println(dao);
		} catch (Exception e) {
			throw new ServletException("error " + e);
		}
	}

	@Override
	public void destroy() {
		if (dao != null)
			try {
				dao.cleanUp();
			} catch (Exception e) {
				throw new RuntimeException("error " + e);
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		try (PrintWriter pw = response.getWriter()) {
			String name = request.getParameter("name");
			String address = request.getParameter("address");
			String course = request.getParameter("course");
			double fees = Double.parseDouble(request.getParameter("fees"));
			int marks = Integer.parseInt(request.getParameter("marks"));

			String status = dao.register(new Student(name, address, course, fees, marks));
			if(status.contains("Success"))
				pw.print("<h4>Registration Succesfull</h4>");
			else
				pw.print("<h4>Registration UnSuccesfull</h4>");

		} catch (Exception e) {
			throw new ServletException("error " + e);
		}
	}

}
