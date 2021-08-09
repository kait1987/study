<%@page import="Dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
		// 1. 매개변수 요청 [기본타입 : String]
		int rno = Integer.parseInt(request.getParameter("rno"));
		int bno = Integer.parseInt(request.getParameter("bno"));
					// integer.parseInt(문자열)	: 문자열 => 정수형
		// 2. 게시물번호에 해당되는 db검색해서 출력
		BoardDao boardDao = BoardDao.getinstance();
		int result = boardDao.rdelete(rno);
		
		if ( result == 1 ) response.sendRedirect("boardview.jsp?bno="+bno);
	%>
</body>
</html>