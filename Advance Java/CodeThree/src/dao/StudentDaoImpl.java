package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static utils.DBUtils.fetchConnection;
import pojo.Student;

public class StudentDaoImpl implements StudentDao {
	private Connection cn;
	private PreparedStatement pst1,pst2;
	
/*	mysql> create table students(student_id int(10) primary key auto_increment,name
			varchar(10),address varchar(20),course_name varchar(10),fees double(6,1),marks i
			nt(5));
			*/
	
	public StudentDaoImpl() throws Exception{
		cn = fetchConnection();
		pst1 = cn.prepareStatement("insert into students VALUES(default,?,?,?,?,?)");
		pst2 = cn.prepareStatement("select * from students where address=?");
	}
	
	public void cleanUp() throws Exception{
		if(pst1 != null)
				pst1.close();
		if(pst2!=null)
				pst2.close();
		if(cn!=null)
				cn.close();
	}
	
	@Override
	public String register(Student s) throws Exception {
		pst1.setString(1, s.getName());
		pst1.setString(2, s.getAddress());
		pst1.setString(3, s.getCourse());
		pst1.setDouble(4, s.getFees());
		pst1.setInt(5, s.getMarks());
		
		int status = pst1.executeUpdate();
		if(status == 1)
			return "Success";
		return "Failure";
	}

	@Override
	public List<Student> getStudent(String city) throws Exception {
		pst2.setString(1, city);
		List<Student> students = new ArrayList<>();
		try(ResultSet rst = pst2.executeQuery()){
			while(rst.next())
				students.add(new Student(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getDouble(5),rst.getInt(6)));
		}
		return students;
	}

}
