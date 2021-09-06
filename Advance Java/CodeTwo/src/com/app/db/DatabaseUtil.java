package com.app.db;

import java.sql.*;

public class DatabaseUtil {
	public static Connection fetchConnection() throws Exception
	{
		// create table menu1(id int(20) primary key auto_increment,menu varchar(50),time varchar(20),price decimal(9,6))
		String url = "jdbc:mysql://localhost:3306/test_exam";
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url,"root","root");
	}
}
