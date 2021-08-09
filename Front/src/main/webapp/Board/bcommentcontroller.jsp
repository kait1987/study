<%@page import="Dao.BcommentDao"%>
<%@page import="Dto.BcommentDto"%>
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
	
		String loginid =  (String)session.getAttribute("loginid");
	
		request.setCharacterEncoding("UTF-8");
		int  nno = Integer.parseInt(request.getParameter("nno"));
		String bccontents = request.getParameter("contents");
		
		// 객체 
		BcommentDto bcommentDto = new BcommentDto( nno , bccontents , loginid );
		
		BcommentDao bcommentDao = BcommentDao.getinstance();
		int result =  bcommentDao.bcommentwrite(bcommentDto);
		if( result == 1 ) {
			response.sendRedirect("boardview.jsp?nno="+nno);
		}else{
			response.sendRedirect("boardview.jsp?nno="+nno);
		}
		
	%>

</body>
</html>