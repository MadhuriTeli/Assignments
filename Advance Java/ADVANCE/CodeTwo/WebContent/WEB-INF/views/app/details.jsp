<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h5>${requestScope.status}</h4>
		
		<h3>Welcome ${sessionScope.user.name} to Admin Dashboard</h3>
		
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>RegDate</th>
				<th>Active Status</th>
				<th>Role</th>
			</tr>
		<c:forEach var="user" items="${requestScope.users}">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>				
				<td>${user.email}</td>
				<td>${user.regDate}</td>
				<td>${user.isactive}</td>
				<td>${user.role}</td>
			</tr>
		</c:forEach>
		</table>
		
		<a href="logout">Logout</a>
		
</body>
</html>