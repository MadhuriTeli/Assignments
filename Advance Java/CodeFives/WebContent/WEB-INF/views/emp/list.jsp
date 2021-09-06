<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4 align="center">${requestScope.status}</h4>

<table style="background-color: cyan; margin: auto;">
		<c:forEach var="v" items="${sessionScope.emplist}">
			<tr>
				<td>${v.id}</td>
				<td>${v.name}</td>
				<td>${v.email}</td>
				<td>${v.password}</td>
				<td>${v.deptid}</td>
				<td>${v.salary}</td>
				<td><a href="<spring:url value='/emp/delete?id=${v.id}'/>">delete</a></td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>