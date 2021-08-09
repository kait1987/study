<%@page import="java.io.PrintWriter"%>
<%@page import="Dao.UserDao"%>
<%@page import="Dto.UserDto"%>
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
		String uname = request.getParameter("name");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String address3 = request.getParameter("address3");
		String address4 = request.getParameter("address4");
		String uaddress = address1+"/"+address2+"/"+address3+"/"+address4;
		String uemail = request.getParameter("email");
		
		// 3. 객체 만들기
		UserDto userDto = new UserDto( uid, upassword, uname, uaddress , uemail, 100 );
		
		// 4. dao 객체 저장
		UserDao userDao = UserDao.getinstance();
		int result = userDao.usersignup(userDto);
		
		// 5. dao 결과 제정
		if( result == 1) {
			PrintWriter printWriter = response.getWriter();
			printWriter.println("<script>");
			printWriter.println("alert('회원 가입 등록')");
			printWriter.println("location.href='login.jsp'");
			printWriter.println("</script>");
		}else{
			PrintWriter printWriter = response.getWriter();
			printWriter.println("<script>");
			printWriter.println("alert('회원 가입 실패 [ 관리자에게 문의 ]')");
			printWriter.println("location.href='signup.jsp'");
			printWriter.println("</script>");
		}
	%>

</body>
</html>