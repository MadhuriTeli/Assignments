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

	<h3>Registration Form</h3>
	
	<center>
		<table border="1">
		
		<form method="post">
			<tr><td>
				Name <input type="text" name="name">
			</td></tr>
			<tr><td>
				Email <input type="email" name="email">.
			</td></tr>
			<tr><td>
				RegDate <input type="date" name="regDate">
			</td></tr>
			<tr><td>
				Role:	<br>
				Admin	<input type="radio" name="role" value="admin">
				User	<input type="radio" name="role" value="user">
			</td></tr>
			<tr><td>
			<input type="submit" name="register" value="Register">		
			</td></tr>	
		</form>
		</table>
	</center>
</body>
</html>