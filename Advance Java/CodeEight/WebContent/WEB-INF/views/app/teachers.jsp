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
	
	<table border="1">
	<c:forEach var="t" items="${requestScope.teachers}">
		<tr>
			<td>${t.id}</td>
			<td>${t.name}</td>
			<td><a href="viewSubjects?teacherId=${t.id}">View Subjects</a>
		</tr>
	</c:forEach>
	</table>
</body>
</html>