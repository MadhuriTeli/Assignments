<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h4>${requestScope.status}</h4>
		<h3>User HomePage</h3>
		<table border="1">
			<tr>
				<td>ID</td>
				<td>${sessionScope.user.id}</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>${sessionScope.user.name}</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${sessionScope.user.email}</td>
			</tr>
			<tr>
				<td>RegDate</td>
				<td>${sessionScope.user.regDate}</td>
			</tr>
			<tr>
				<td>isActive</td>
				<td>${sessionScope.user.isactive}</td>
			</tr>
		</table>
		
		<a href="logout">Logout</a>
</body>
</html>