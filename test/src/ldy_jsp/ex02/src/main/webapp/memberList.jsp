<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="ex02.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%
List<MemberVO> list = (List<MemberVO>) request.getAttribute("list");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>MemberList Page</h1>
	<hr>

	<table border="1">
		<thead>
		<tbody>
			<!-- 반복 시작 -->
			<%
			for (MemberVO vo : list) {
			
			%>
			<tr>
				<td><%=vo.getId() %></td>
				<td><%=vo.getPw() %></td>
				<td><%=vo.getName()%></td>
				<td><%=vo.getTel() %></td>
			</tr>
			<%} %>
		</tbody>
		</thead>
	</table>
</body>
</html>