<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    String result = request.getParameter("result");

    int[] score = (int[]) session.getAttribute("score");
    if (score == null) {
        score = new int[]{0, 0, 0};
    }

    // 결과에 따라 값 업데이트
    if ("win".equals(result)) score[0]++;
    else if ("lost".equals(result)) score[1]++;
    else if ("draw".equals(result)) score[2]++;

    session.setAttribute("score", score); // 업데이트된 전적 다시 저장
%>

<h2><%= (score[0] + score[1] + score[2]) %>전 <%= score[0] %>승 <%= score[1] %>패 <%= score[2] %>무</h2>
