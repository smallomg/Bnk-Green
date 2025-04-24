<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 회원등록
아이디
패스워드
이름
폼에서 사용자 입력받음
회원정보는 Member클래스로 묶어서 관리
DAO db전용 클래스



서블릿에서 처리
등급
최초가입시 "일반" -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>member page</h1>
	<hr>
	<form action="memberServlet"method="post">
	ID : <input type="text"name="id"><br>
	PW : <input type="password"name="pw"><br>
	NAME : <input type="text"name="name"><br>
	<input type="submit"value="등록">
	</form>
	<hr>
	<a href="storageTest.jsp?y=yyy">StorageTest페이지로 파라미터 보내기</a>
</body>
</html>