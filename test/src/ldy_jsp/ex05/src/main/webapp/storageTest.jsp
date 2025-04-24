<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 내장객체
// pageContext 여기서만 쓸수 있음
pageContext.setAttribute("x", "page_X");

// 다른 페이지로 복사가능 한 저장소
request.setAttribute("x", "request_X");

// 개인화 된 저장소 : 페이지를 벗어나 브라우저에 가능 (예시 접속자가 1000명이면 1000개 나옴)
session.setAttribute("x", "session_X");

// 이 프로세스 이 서비스를 모든 사람들이 공유할수 있는 저장소
application.setAttribute("x", "application_X");

String s = "hello";

pageContext.setAttribute("s", s);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- page 저장소 값 :
	<%=pageContext.getAttribute("x")%><br> 
	request 저장소 값 :
	<%=request.getAttribute("x")%><br> 
	session 저장소 값 :
	<%=session.getAttribute("x")%><br> 
	application 저장소 값 :
	<%=application.getAttribute("x")%> --%>
	
	<!--section은 한번 활성화 되면 section을 지워도 전에 있던게 나온다!-->
	<!-- el표기법 ${변수명} -->
	page 저장소 값 : ${x}<br> 
	request 저장소 값 :${x}<br> 
	session 저장소 값 :${x}<br> 
	application 저장소 값 :${x}<br> 
	
	s(EL) : ${s}
	s(표현식) : <%=s%>
	<hr>
	파리미터 y : ${param.y}<br>
	
</body>
</html>