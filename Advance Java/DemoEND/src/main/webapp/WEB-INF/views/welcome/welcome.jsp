<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome admin ${requestScope.user_dtls.username}</h3>
<ul>
<li><a href="<spring:url value='/player/player' />">Add Player Details</a></li>

<li>Display all team records.</li>
<li>Remove player from any <b>team</b>.</li>
<li>Display best Batsmen from all teams.</li>
<li>Display best Bowler from all teams.</li>
</ul>
</body>
</html>