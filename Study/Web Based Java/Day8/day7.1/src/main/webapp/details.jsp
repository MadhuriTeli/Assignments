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
	<h4>Successful Login!!!!</h4>
	<h5>User Details : ${sessionScope.user_details}</h5>
	<%
	 String encodedURL=response.encodeURL("logout.jsp");
	%>
	<h5>
		<a href="<%= encodedURL %>">Log Out</a>
	</h5>
</body>
</html>