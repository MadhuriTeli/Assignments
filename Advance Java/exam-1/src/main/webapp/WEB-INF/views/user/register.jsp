<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%--import spring supplied form tag lib to enable data binding --%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<form:form  method="post" modelAttribute="user">
		<table style="background-color: lightgrey; margin: auto;">
			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td>DateOfBirth</td>
				<td><form:input type="date" path="dob" /></td>
			</tr>
			<tr>
				<td>Role</td>
				<td><form:radiobutton path="role" value="ADVERTISEMENT"/>Advertisement</td> 
			</tr>
			<tr>
			<td></td>
				<td><form:radiobutton path="role" value="ADMIN"/>Admin</td> 
			</tr>
			<tr>
				<td><input type="submit" value="Register User" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>