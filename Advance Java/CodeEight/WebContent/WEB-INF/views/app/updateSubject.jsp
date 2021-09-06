<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		ID<input type="text" name="id" value="${requestScope.subject.id}"/> 
		Subject Name<input type="text" name="name" value="${requestScope.subject.name}"/> 
		Duration<input	type="number" name="duration" value="${requestScope.subject.duration}"/> 
		Course Name<input type="text"	name="course" value="${requestScope.subject.course}"/>
		<input type="submit" value="Update Subject">
	</form>
</body>
</html>