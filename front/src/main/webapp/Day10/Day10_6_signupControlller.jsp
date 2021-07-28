<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<% // 1. java 사용시 스트크립문 태크 열기 
	
		//2. 전 페이지로부터 매개변수 요청 
			// 1. 인코딩 타입
			request.setCharacterEncoding("UTF-8");
			// 2. 매개변수 요청하기 
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			String passwordconfirm = request.getParameter("passowrdconfirm");
			String name = request.getParameter("name");
			
			/*
			out.print( request.getParameterNames() );
			out.print( request.getParameterValues("id") );
			*/
			
			
		// 3. 매개변수 출력 
			out.print("입력하신 아이디 " + id ); 
			out.print("입력하신 비밀번호 " + password );
			out.print("입력하신 비밀번호확인 " + passwordconfirm );
			out.print("입력하신 이름 " + name );

							
	// 스트립트문 끝 
	%>
	
	<% if( !password.equals(passwordconfirm) ){
	%>	
		<script type="text/javascript">
			alert('패스워드가 서로 다릅니다');
			location.href="Day10_5_signup.jsp";
		</script>
	<%
	}else{
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<script>");
		printWriter.println("alert('회원가입이 되었습니다')");
		printWriter.println("location.href='../Day09/main.jsp'");
		printWriter.println("</script>");
	}
	%>
	


</body>
</html>