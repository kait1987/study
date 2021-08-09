<%@page import="java.io.PrintWriter"%>
<%@page import="org.apache.catalina.ssi.SSICommand"%>
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
		// 1. 요청 : request 인코딩 타입
		request.setCharacterEncoding("UTF-8");
	
		// 2. request 매개변수
		String uid = request.getParameter("id");
		String upassword = request.getParameter("password");
		
		// 3. 객체 만들기
		
		// 4. dao 객체 저장
		UserDao userDao = UserDao.getinstance();
		int result = userDao.userlogin(uid, upassword);
		
		// 5. dao 결과 제어
		if( result == 1){
			
			// 세션 부여 : 서버에 메모리 저장 [모든 페이지내에서 사용 가능 메모리]
			session.setAttribute("loginid", uid);
								// 세션이름, 세션담을 데이터
		
			PrintWriter printWriter = response.getWriter();
			printWriter.println("<script>");
			printWriter.println("location.href='../index/main.jsp'");
			printWriter.println("<script>");
		}else if( result == 2){
			PrintWriter printWriter = response.getWriter();
			printWriter.println("<script>");
			printWriter.println("alert('로그인 실패 [ 아이디 혹은 패스워드가 다릅니다]')");
			printWriter.println("location.href='login.jsp'");
			printWriter.println("<script>");
		}else{
			PrintWriter printWriter = response.getWriter();
			printWriter.println("<script>");
			printWriter.println("alert('로그인 실패 [ 오류발생 관리자에게 문의바랍니다]')");
			printWriter.println("location.href='login.jsp'");
			printWriter.println("<script>");
		}
	%>

</body>
</html>