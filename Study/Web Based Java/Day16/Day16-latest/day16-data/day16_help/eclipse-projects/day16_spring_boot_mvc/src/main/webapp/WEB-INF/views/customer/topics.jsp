<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--import JSTL supplied core tag lib --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--import Spring supplied JSP tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>Validated Customer Details retrieved from session scope:
		${sessionScope.user_details}</h5>
	<%--Spring tag url : URL rewriting n creating URLs relative to root of  curnt web ctx --%>
	<spring:url var="url" value="/customer/tutorials" />
	<form action="${url}" method="get">
		<table style="background-color: lightgrey; margin: auto">
			<c:forEach var="topic" items="${requestScope.topic_list}">
				<tr>
					<td><input type="radio" name="topicId" value="${topic.id}" /></td>
					<td>${topic.topicName}</td>
				</tr>
			</c:forEach>
			<tr>
				<td><input type="submit" value="Choose Topic" /></td>
			</tr>
		</table>
	</form>
</body>
</html>