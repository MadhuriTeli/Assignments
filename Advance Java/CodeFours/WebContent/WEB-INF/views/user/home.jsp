<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4 align="center">${requestScope.status}</h4>

	<a href="employee/add">Add Employee</a>
	<a href="/employee/update">Update Employee</a>
	<a href="/employee/delete">Delete Employee</a>
	<a href="/employee/view.jsp">View Employees</a>
	<a href="/employee/list">List Employees</a>
	
		<a href="<spring:url value='/user/logout'/>">Log Out</a>
	
</body>
</html>