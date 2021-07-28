<%@page import="Dto.Member"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<!-- Controller 페이지 [ view 없음 ] -->
	<% // java 스크립트 시작
	
		// 1. 매개변수 요청
		request.setCharacterEncoding("EUC-KR");

		// 2. 매개변수 요청
		String mid = request.getParameter("id");
		String mpassword = request.getParameter("password");
		String mpasswordconfirm = request.getParameter("passwordconfirm");
		String mname = request.getParameter("name");
		String memail = request.getParameter("email");
		
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String mphone = phone1 + phone2 + phone3;
		
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String address3 = request.getParameter("address3");
		String address4 = request.getParameter("address4");
		String address5 = request.getParameter("address5");
		String maddress = address1 + "," + address2+ ","  + address3+ ","  + address4+ ","  + address5;
		
		// 객체 => DB
		Member member = new Member( mid , mpassword, mname, memail, mphone, maddress);
		
		out.print( member.getMaddress());
		
		
		
		
		
		
		
		
/* 		// Enumeration 인터페이스 : 순서가 없느 ㄴ여러개의 항목을 하나씩 순회
		Enumeration<String> enumeration = request.getParameterNames();
		
		while( enumeration.hasMoreElements() ){
			 String name2 = enumeration.nextElement();
			 String value = request.getParameter(name2);
			 out.println(name2 + ":" + value);
		}
 */		

	// java 스크립트 끝	
	%>
	
	
	
</body>
</html>