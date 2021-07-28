<%@page import="Dao.MemberDao" %>
<%@page import="Dto.Member" %>
<%@page import="java.util.Enumeration" %>
<%@page import="java.util.HashSet" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<!-- Controller 페이지 [view 없음] -->
	<% // java 스크립트 시작
	
		// 1. 매개변수 인코딩 타입설정
		request.setCharacterEncoding("EUC-KR");
	
		// 2. 매개변수 요청
		String mid = request.getParameter("id");
		String mpassword = request.getParameter("password");
		
		MemberDao memberDao = MemberDao.getinstance();
		
		int result = memberDao.login(mid, mpassword);
		
		if( result == 1){
			//로그인 성공시 main페이지 이동
			response.sendRedirect("../Day09/main.jsp");
			session.setAttribute("logid", mid); // 세션부여
		
		}else{
			response.sendRedirect("Login.jsp");
		}
		
	%>
</body>
</html>