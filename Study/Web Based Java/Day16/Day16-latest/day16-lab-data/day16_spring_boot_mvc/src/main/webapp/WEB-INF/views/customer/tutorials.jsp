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
	<%-- <h5>Tutorial List : ${requestScope.tut_names}</h5> --%>
	<h3 align="center">Tutorials Under Topic : ${param.id}</h3>
	<c:forEach var="tutName" items="${requestScope.tut_names}">
		<a
			href="<spring:url value='/customer/tutorial_details?tut_name=${tutName}'/>">${tutName}</a>
		<br>
	</c:forEach>
</body>
</html>