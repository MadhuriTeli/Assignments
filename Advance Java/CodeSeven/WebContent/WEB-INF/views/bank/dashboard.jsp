<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Welcome "${sessionScope.user}" To	All India Bank</h4>
	
	<br>
		<h4>${requestScope.status}</h4>
	<br>
	<h5><a href="deposit">View Maturing Deposits</a></h5>
	<h5><a href="viewAddress">View Address</a></h5>
			<h4>${requestScope.address}</h4>
	<br>
	<a href="addDeposit">Add Deposit</a>
	<a href="addAddress">Add Address</a>
	
	<a href="logout">Logout</a>
</body>
</html>