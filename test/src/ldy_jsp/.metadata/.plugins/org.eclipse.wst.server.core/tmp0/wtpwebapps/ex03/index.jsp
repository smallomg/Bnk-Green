<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index page</h1>
	<hr>
	<h2>GET방식1 - a태그 활용</h2>
	
	<a href="p1.jsp">p1페이지로 가기(jsp로 바로 연결)</a>
	<br>
	<a href="p1">p1페이지로 가기(Servlect로 연결)</a>
	
	<h2>GET방식2 - a태그 활용</h2>
	
	<a href="p2.jsp?name=James&age=26">p2페이지로 가기(jsp로 바로 연결)</a>
	<br>
	<a href="p2">p2페이지로 가기(Servlect로 연결)</a>
	
	<h2>GET방식3 - Form 활용</h2>
	
	<form action="p2" method="get">
		<input type="text"name="fruit"value="apple"><br>
		<input type="radio"name="subject"value="java">java<br>
		<input type="radio"name="subject"value="sql">sql<br>
		<input type="radio"name="subject"value="html">html<br>
		<select name="animal">
			<option value ="dog">강아지</option>
			<option value ="cat">고양이</option>
			<option value ="tiger">호랑이</option>
		</select>
		<br>
		<input type="checkbox" name="movies" value="Taxi Driver">택시드라이버
		<input type="checkbox" name="movies" value="Le Grand Blue">그랑블루
		<input type="checkbox" name="movies" value="The God Father">대부
		<input type="submit"value="전송">
	</form>
	
	<h2>GET방식4 - Form 활용</h2>
	
	<form action="p3" method="get">
		<input type="text"name="fruit"value="apple"><br>
		<input type="radio"name="subject"value="java">java<br>
		<input type="radio"name="subject"value="sql">sql<br>
		<input type="radio"name="subject"value="html">html<br>
		<select name="animal">
			<option value ="dog">강아지</option>
			<option value ="cat">고양이</option>
			<option value ="tiger">호랑이</option>
		</select>
		<br>
		<input type="checkbox" name="movies" value="Taxi Driver">택시드라이버
		<input type="checkbox" name="movies" value="Le Grand Blue">그랑블루
		<input type="checkbox" name="movies" value="The God Father">대부
		<input type="submit"value="전송">
	</form>
</body>
</html>