package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDaoImpl;
import pojo.Student;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/View")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDaoImpl dao;
	private List<Student> students;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			dao = new StudentDaoImpl();
			System.out.println(dao);
		}catch(Exception e)
		{
			throw new ServletException("error " + e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		if(dao!=null)
			try {
				dao.cleanUp();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new RuntimeException("error " + e);
			}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw = response.getWriter()) {
			String city = request.getParameter("address");
			students = dao.getStudent(city);
			
			for(Student s:students)
				pw.println(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
