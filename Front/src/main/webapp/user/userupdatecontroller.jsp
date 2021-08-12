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
		// 1. 한글 인코딩 타입
		request.setCharacterEncoding("UTF-8");
		// 2.
			String upassword = request.getParameter("password");
			if( upassword.equals("") ){ // 새로운 비밀번호가 입력 안했으면
				upassword = request.getParameter("oldpassword");
			}
		String uname = request.getParameter("name");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String address3 = request.getParameter("address3");
		String address4 = request.getParameter("address4");
		String uaddress = address1+"/"+address2+"/"+address3+"/"+address4;
			if( address1.equals("") && address2.equals("") & address3.equals("") ){ // 새로운 주소 입력 안했으면
				uaddress = request.getParameter("oldaddress");
			}
		String uemail = request.getParameter("email");
		int nno = Integer.parseInt( request.getParameter("nno") ) ;
		
		// 3. 객체 
		UserDto userDto = new UserDto(null,upassword,uname,uaddress,uemail,0);
		// 4. Dao 연결 
		UserDao userDao = UserDao.getinstance();
		int result =  userDao.userupdate(nno, userDto);
		// 5. Dao 결과 
		if( result == 1 ){ response.sendRedirect("userinfo.jsp"); }
		else{ response.sendRedirect("userinfo.jsp"); }
		
		
	%>
	

</body>
</html>