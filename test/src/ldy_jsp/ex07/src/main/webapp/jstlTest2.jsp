<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JSTL Test2 Page</h2>

	<p>msg : ${msg }</p>
	<p>age : ${age }</p>

	<c:if test="${param.color==1 }">
		<span style="color: red;">빨강</span>
	</c:if>
	<c:if test="${param.color==2 }">
		<span style="color: green;">초록</span>
	</c:if>
	<c:if test="${param.color==3 }">
		<span style="color: blue;">파랑</span>
	</c:if>
	

<h3>1부터 10까지 반복 출력</h3>

<c:forEach var="cnt" begin="1" end="10" step="1" varStatus="vs">
    현재 숫자: ${cnt}, 
    반복 인덱스: ${vs.index}, 
    반복 순번: ${vs.count} <br>
</c:forEach>

</body>
</html>