<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>Session ID <%= session.getId() %></h5>
	<h5>
		<a href="login.jsp">User Login</a>
	</h5>
	<h5>
		<a href="test1.jsp">Error Handling in JSP</a>
	</h5>
	<h5>
		<a href="test2.jsp">Test include directive</a>
	</h5>
	<h5>
		<a href="test4.jsp?pid=123&pName=mobile">Test Forward Scenario</a>
	</h5>
</body>
</html>