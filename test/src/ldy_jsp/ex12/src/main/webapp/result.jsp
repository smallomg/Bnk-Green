<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이체 결과</title>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 20px;
}

.result-container {
	max-width: 500px;
	margin: 0 auto;
	padding: 20px;
	border: 1px solid #ddd;
	border-radius: 5px;
}

.success {
	color: green;
}

.error {
	color: red;
}

.back-link {
	margin-top: 20px;
}
</style>
</head>
<body>
	<div class="result-container">
		<h2>이체 결과</h2>
		<%
		if (request.getAttribute("message") != null) {
		%>
		<p class="success"><%=request.getAttribute("message")%></p>
		<%
		}
		%>
		<%
		if (request.getAttribute("errormessage") != null) {
		%>
		<p class="error"><%=request.getAttribute("errormessage")%></p>
		<%
		}
		%>
		<div class="back-link">
			<a href="transfer_form.jsp">다시 이체하기</a>
		</div>
	</div>
</body>
</html>