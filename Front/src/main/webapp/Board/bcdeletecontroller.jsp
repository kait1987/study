<%@page import="Dao.BcommentDao"%>
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
		request.setCharacterEncoding("UTF-8");
	
		int bcno = Integer.parseInt(request.getParameter("bcno"));
		int nno = Integer.parseInt(request.getParameter("nno") );
		
		BcommentDao bcommentDao = BcommentDao.getinstance();
		bcommentDao.bcommentdelete(bcno);
		
		response.sendRedirect("boardciew.jsp?nno="+nno);
	%>
</body>
</html>