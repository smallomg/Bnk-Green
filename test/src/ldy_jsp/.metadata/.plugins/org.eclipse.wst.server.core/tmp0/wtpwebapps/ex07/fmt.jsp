<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ page import="java.util.Date" %>
<jsp:useBean id="today" class="java.util.Date" />

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>JSTL fmt 태그 예제</title>
</head>
<body>
<h2>📌 JSTL fmt 태그 실습</h2>

<hr>
<h3>1. 숫자 포맷</h3>
<fmt:formatNumber value="1234567.89" type="number" groupingUsed="true" /><br>
<fmt:formatNumber value="0.75" type="percent" /><br>
<fmt:formatNumber value="1234.56" type="currency" /><br>

<hr>
<h3>2. 날짜 포맷</h3>
오늘 날짜: <fmt:formatDate value="${today}" pattern="yyyy-MM-dd HH:mm:ss" /><br>

<hr>
<h3>3. 문자열 → 숫자 변환 (parseNumber)</h3>
<fmt:parseNumber var="parsedNumber" value="3,000" />
파싱 결과 +1000 = ${parsedNumber + 1000}<br>

<hr>
<h3>4. 문자열 → 날짜 변환 (parseDate)</h3>
<fmt:parseDate var="parsedDate" value="2025-04-25" pattern="yyyy-MM-dd" />
<fmt:formatDate value="${parsedDate}" pattern="yyyy/MM/dd (E)" /><br>

<hr>
<h3>5. 로케일 설정 후 통화 포맷 비교</h3>

<b>영문 로케일 (en_US)</b><br>
<fmt:setLocale value="en_US" />
<fmt:formatNumber value="1234.56" type="currency" /><br>

<b>한글 로케일 (ko_KR)</b><br>
<fmt:setLocale value="ko_KR" />
<fmt:formatNumber value="1234.56" type="currency" /><br>

<hr>
<h3>6. 다국어 메시지 출력</h3>
<!-- /WEB-INF/classes/messages_ko.properties 필요 -->
<fmt:setLocale value="ko" />
<fmt:setBundle basename="messages" />
메시지: <fmt:message key="hello" /><br>
메시지2: <fmt:message key="bye" /><br>

<hr>
<h3>7. 메시지 안에 변수 삽입</h3>
<!-- messages_ko.properties: greet=안녕하세요, {0}님! -->
<fmt:message key="greet">
   <fmt:param value="홍길동" />
</fmt:message>

</body>
</html>
