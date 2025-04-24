<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%	
	
	/* response.sendRedirect("b.jsp"); */

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 

Class.forName("oracle.jdbc.driver.OracleDriver");

String url = "jdbc:oracle:thin:@localhost:1521:testdb";
String user = "green";
String password = "1234";

Connection con = DriverManager.getConnection(url,user,password);
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM tbl_board");

%>
	<h1>list 페이지</h1>
	<hr>
	
	<table border="1">
    <tr>
        <th>bno</th>
        <th>title</th>
        <th>writer</th>
        <th>regdate</th>
       
    </tr>

<% while(rs.next()) { 
     String bno = rs.getString("bno");
     String title = rs.getString("title");
     String writer = rs.getString("writer");
     String regdate = rs.getString("regdate");
    
  
%>
    <tr>
        <td><%= bno %></td>
     	<td><a href="boardDetail.jsp?bno=<%= bno %>"><%= title %></a></td>
        <td><%= writer %></td>
        <td><%= regdate %></td>
        
    </tr>
    
<% } 

rs.close();
stmt.close();
con.close();
%>
	</table>
	
	
	
</body>
</html>