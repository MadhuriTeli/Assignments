<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>
		Session ID :
		<%=session.getId()%></h5>
	<h5>
		<a href="test1.jsp?begin=10&end=50">Test RD's Forward Technique</a>
	</h5>
	<h5>
		<a href="test3.jsp">page vs pageContext </a>
	</h5>
</body>
</html>