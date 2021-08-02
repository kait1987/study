<%@page import="java.io.PrintWriter"%>
<%@page import="Dto.NoticeDto"%>
<%@page import="Dao.NoticeDao"%>
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
	// jsp 태그 : java 스트크립트문
	
	request.setCharacterEncoding("EUC-KR");
	
	String ntitle = request.getParameter("title");
	String ncontents = request.getParameter("contents");
	String nfile = request.getParameter("file");
	
	//객체
	NoticeDto noticeDto = new NoticeDto(ntitle , ncontents, "우원재" , 0 , nfile);
	
	// DB
	NoticeDao noticeDao = NoticeDao.getinstance();
	
	int result = noticeDao.noticewrite(noticeDto);
	
	if ( result == 1){
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<script>");
		printWriter.println("alert('글 작성 등록')");
		printWriter.println("location.href='boardlist.jsp'");
		printWriter.println("<script>");
	}
	else{
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<script>");
		printWriter.println("alert('글 작성 실패[관리자에게 문의]')");
		printWriter.println("location.href='boardlist.jsp'");
		printWriter.println("<script>");
	}
	
	%>
</body>
</html>