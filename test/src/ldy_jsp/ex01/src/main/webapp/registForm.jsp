<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Regist Form Page</h1>
	
	<form action="registProc.jsp" method="GET">
		title : <input type="text" name="title"> <br>
		content : <input type="text"name="content"> <br>
		writer : <input type="text" name="writer"> <br>
		<input type="submit" value="등록">
	</form>
</body>
</html>