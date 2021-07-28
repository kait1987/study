<%@page import="Dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


	<%
	
		// 1. 매개변수 요청 [ 기본타입 : String]
		int bno = Integer.parseInt(request.getParameter("bno"));
					// interger.parseint( 문자열 ) : 문자열 => 정수형 
		// 2. 게시물번호에 해당하는 db 검색해서 출력 
		BoardDao boardDao = BoardDao.getinstance();
		int result = boardDao.bdelete(bno);
		
		if ( result == 1 ) response.sendRedirect("boardlist.jsp");

	%>
</body>
</html>