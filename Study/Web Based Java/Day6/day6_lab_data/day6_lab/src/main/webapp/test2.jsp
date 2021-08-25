<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>from test2 page</h5>
	<h5>
		Session ID :
		<%=session.getId()%></h5>
	
	<h5>Via JSP Scriptlet</h5>
	<%--Display number list from request scope : using a scriptlet --%>
	<%
	 out.print("Number List "+request.getAttribute("num_list"));
	
	%>
	
	<%--Display number list from request scope : using a JSP expression --%>
	<h5>Via JSP Expression</h5>
	<h5>Number List <%= request.getAttribute("num_list") %></h5>
		<%--Display number list from request scope : using a EL syntax --%>
	<h5>Via JSP EL</h5>
	<h5>Request Parameter Map :  ${param}</h5>
	<h5>Number List : ${requestScope.num_list}</h5>
	
</body>
</html>