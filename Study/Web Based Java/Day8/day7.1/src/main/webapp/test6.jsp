<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--import JSTL supplied core tag lib--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5> In 1st page....</h5>
	<%--add 2 attributes : one in page scope n other in request scope(w/o java code) --%>
	<%--pageContext.setAttribute(:nm1",1234) --%>
	<c:set var="nm1" value="1234" scope="page" />
	<%-- request.setAttribute("nm2",3456); --%>
	<c:set var="nm2" value="3456" scope="request" />
	<%-- Use include action  --%>
	<%--RD rd=request.getRD("test7.jsp"); rd.include(rq,rs); --%>
	<%-- <jsp:include page="test7.jsp"/> --%>
	<%@ include file="test7.jsp" %>
	
</body>
</html>