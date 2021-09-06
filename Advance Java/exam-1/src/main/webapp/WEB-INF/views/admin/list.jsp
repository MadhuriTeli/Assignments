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
	
	<h5>Welcome : ${sessionScope.user_details}</h5>
	<table style="background-color: lightgrey; margin: auto;">
		<caption>List of Advertisements</caption>
		<tr>
			<th>ID</th>
			<th>product</th>
			<th>Brand</th>
			<th>Date of Tele Cast</th>
			<th>status</th>
		</tr>
		<c:forEach var="v" items="${requestScope.advertisement_list}">
			<tr>
				<td>${v.id}</td>
				<td>${v.product}</td>
				<td>${v.brand}</td>
				<td>${v.dateOfTeleCast}</td>
				<td>${v.status}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>