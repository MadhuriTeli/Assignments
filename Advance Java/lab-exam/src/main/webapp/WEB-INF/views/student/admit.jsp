<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>${requestScope.status}</h5>
	<form:form method="post" modelAttribute="student">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Enter Student Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Enter Student Address</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td>Choose Student DoB</td>
				<td><form:input type="date" path="dob" /></td>
			</tr>
			<tr>
				<td>Enter Student CGPA</td>
				<td><form:input type="number" path="cgpa" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Student Admission"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>