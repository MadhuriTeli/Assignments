<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter Player</title>
</head>
<body>
	<h5>${requestScope.status}</h5>
	<form:form method="post" modelAttribute="myPlayer">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Player Name</td>
				<td><form:input path="player_name" /></td>
			</tr>
			<tr>
				<td>Team Name</td>
				<td><form:input path="team_name" /></td>
			</tr>
			<tr>
				<td>Player role</td>
				<td><form:input  path="player_role" /></td>
			</tr>
			<tr>
				<td>Team Name</td>
				<td><form:input  path="against_team_name" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="player Admission"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>