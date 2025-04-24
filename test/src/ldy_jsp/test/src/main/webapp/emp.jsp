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
ResultSet rs = stmt.executeQuery("SELECT * FROM a_student");

%>
	<h1>A 페이지</h1>
	<hr>
	a.jsp 페이지 입니다
	
	<table border="1">
    <tr>
        <th>stu_no</th>
        <th>stu_name</th>
        <th>stu_dept</th>
        <th>stu_grade</th>
        <th>stu_class</th>
        <th>stu_gender</th>
        <th>stu_height</th>
        <th>stu_weight</th>
    </tr>

<% while(rs.next()) { 
     String stu_no = rs.getString("stu_no");
     String stu_name = rs.getString("stu_name");
     String stu_dept = rs.getString("stu_dept");
     int stu_grade = rs.getInt("stu_grade");
     String stu_class = rs.getString("stu_class");
     String stu_gender = rs.getString("stu_gender");
     int stu_height = rs.getInt("stu_height");
     int stu_weight = rs.getInt("stu_weight");
     
     
%>
    <tr>
        <td><%= stu_no %></td>
        <td><a href="detail.jsp?stu_name=<%= stu_name %>"><%= stu_name %></td>
        <td><%= stu_dept %></td>
        <td><%= stu_grade %></td>
        <td><%= stu_class %></td>
        <td><%= stu_gender %></td>
        <td><%= stu_height %></td>
        <td><%= stu_weight %></td>
    </tr>
    
<% } 

rs.close();
stmt.close();
con.close();
%>
	</table>
	
	
	<a href="b.jsp">b page 가기</a>
</body>
</html>