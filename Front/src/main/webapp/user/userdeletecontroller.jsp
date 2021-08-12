<%@page import="java.io.PrintWriter"%>
<%@page import="Dao.UserDao"%>
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
	
	int uno = Integer.parseInt(request.getParameter("uno") );
	String password = request.getParameter("password");
	
	UserDao userDao = UserDao.getinstance();
	
	int result = userDao.userdelete(uno, password);
	if( result == 1) {
		/// 탈퇴 성공 => 탈퇴성공 페이지 => 세션 null
				session.setAttribute("loginid", null);
				response.sendRedirect("userdelete.jsp");
	}else{
		//메시지 띄우기
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<script>");
		printWriter.println("alert('비밀번호가 일치하지 않습니다 ')");
		printWriter.println("location.href='../User/userinfo.jsp'");
		printWriter.println("</script>");
	}
	
	%>

</body>
</html>