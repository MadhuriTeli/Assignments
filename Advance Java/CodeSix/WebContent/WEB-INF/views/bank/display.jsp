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
	<c:forEach var="v" items="${requestScope.deposits}">
		<table>
			<tr>
				<td>${v.accountId}</td>
				<td>${v.balance}</td>
				<td>${v.maturity}</td>
				<td>${v.bankName}</td>
			</tr>
		</table>
	</c:forEach>


<a href="bank/home">home</a>
</body>
</html>