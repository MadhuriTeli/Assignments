<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Welcome To	All India Bank</h4>
	<br>
		<h4>${requestScope.status}</h4>
	<br>
	<h5><a href="bank/deposit">View Maturing Deposits</a></h5>
	<a href="bank/addDeposit">Add Deposit</a>
	<a href="bank/logout">Logout</a>
</body>
</html>