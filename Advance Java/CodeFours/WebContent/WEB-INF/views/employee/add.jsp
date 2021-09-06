<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sf:form method="post" modelAttribute="emp">
	
	Email<sf:input type="email" path="email" />
		<sf:errors path="email" /><br>
	
	Name<sf:input path="name" />
		<sf:errors path="name" /><br>
	
	Password<sf:password path="password" />
		<sf:errors path="password" /><br>
	
	DeptId<sf:input type="number" path="deptid" />
		<sf:errors path="deptid" /><br>
	
	Salary<sf:input type="number" path="salary" />
		<sf:errors path="salary" /><br>
	
	Date<sf:input type="date" path="regDate" />
		<sf:errors path="regDate" /><br>

		<input type="submit" value="Register">
	</sf:form>
</body>
</html>