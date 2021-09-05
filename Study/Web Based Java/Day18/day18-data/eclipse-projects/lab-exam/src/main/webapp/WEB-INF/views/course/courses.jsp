<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- ${requestScope.course_list} --%>
	<h4 align="center">${requestScope.status}</h4>
	<table style="background-color: lightgrey; margin: auto">
		<c:forEach var="c" items="${requestScope.course_list}">
			<tr>
				<td>${c.title}</td>
				<td><a href="<spring:url value='/course/delete?cid=${c.id}'/>">Delete
						Course</a></td>
				<td><a href="<spring:url value='/student/admit?cid=${c.id}'/>">Admit Student</a></td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>