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
	<form method="post">
		<input type="text" name="username"/>Username
		<br>
		<input type="text" name="password"/>Password
		<br>
		<input type="submit" name="login">
	</form>
</body>
</html>