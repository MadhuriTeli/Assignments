<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">
      <table style="background-color: lightgrey; margin: auto">
        <tr>
          <td>Enter Player Name</td>
          <td><input type="text" name="username" /></td>
        </tr>
       <td>
       <c:forEach></c:forEach>
       <select></select>
       </td>
        <tr>
          <td><input type="submit" value="Login" /></td>
        </tr>
      </table>
    </form>
</body>
</html>