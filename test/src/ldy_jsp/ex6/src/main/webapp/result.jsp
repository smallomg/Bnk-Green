<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="ex04.Member"%>
<%@page import="java.util.List"%>
<%
Member member =(Member)request.getAttribute("member");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>결과 페이지</h1>
	<hr>
	<%-- <%
			for (Member vo : list) {
			
			%>

	id :
	<%=vo.getId() %><br> pw :
	<%=vo.getPw() %><br> name :
	<%=vo.getName()%><br> grade :
	<%=vo.getGrade() %><br>
	<br>
	<%} %> --%>

<%=member.getId() %>
<%=member.getPw() %>
<%=member.getName() %>
<%=member.getGrade() %>

</body>
</html>