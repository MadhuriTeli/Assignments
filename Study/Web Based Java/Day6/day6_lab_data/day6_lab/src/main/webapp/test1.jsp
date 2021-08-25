<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.stream.Collectors"%>
<%@page import="java.util.stream.IntStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h5>From test1 page.....</h5>
	<%
	int start = Integer.parseInt(request.getParameter("begin"));
	int end = Integer.parseInt(request.getParameter("end"));
	 List<Integer> list=  IntStream.rangeClosed(start, end).//IntStream : strm of prim types
	boxed().//Stream<Integer>
	collect(Collectors.toList()); 
	/* ArrayList<Integer> list=new ArrayList<>();
	for(int i=start;i<=end;i++)
		list.add(i); */
		//add this list under suitable scope : min scope : request scope
		request.setAttribute("num_list", list);
		//RD
		RequestDispatcher rd=request.getRequestDispatcher("test2.jsp");
		//forward
		rd.forward(request, response);
		
	%>
</body>
</html>