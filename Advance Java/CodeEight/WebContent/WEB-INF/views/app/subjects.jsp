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
	<h4>${requestScope.status}</h4>
	<h4>Showing for Teacher ${sessionScope.teach.name}</h4>
	
	<table border="1">
	<c:forEach var="sub" items="${requestScope.subjects}">
		<tr>
		<td>${sub.name }</td>
		<td>${sub.duration }</td>
		<td>${sub.course }</td>
		<td><a href="updateSubject?subjectId=${sub.id}">Update Subject</a></td>
		</tr>
	</c:forEach>
	</table>
	
	<a href="addSubject">Add Subject</a>
</body>
</html>