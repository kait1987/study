<%@page import="Dao.BoardDao"%>
<%@page import="Dto.Reply"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
		request.setCharacterEncoding("EUC-KR");
	
		int bno = Integer.parseInt (request.getParameter("bno") );
				//요청된 매게 변수의 기본타입 : String
		String rwriter = request.getParameter("rwriter");
		String rcontents = request.getParameter("rcontents");
		
			//날짜 
			Date date = new Date();
			//날짜 형식
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-mm-dd hh:mm:ss");
			String rdate = simpleDateFormat.format(date);
			
		Reply reply = new Reply( bno, rwriter, rcontents , rdate);
		
		BoardDao boardDao = BoardDao.getinstance();
		
		int result = boardDao.rwriter(reply);
		
		if (result == 1) {response.sendRedirect("boardview.jsp?bno=" + bno);}
		else{}
	
	%>

</body>
</html>