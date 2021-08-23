<%@page import="Dto.Board"%>
<%@page import="Dao.BoardDao"%>
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
		// 1. 매개변수 요청 [ 기본타입 : String ] 
		int bno = Integer.parseInt(request.getParameter("bno"));
					// interger.parseint( 문자열 ) : 문자열 => 정수형 
		// 2. 게시물번호에 해당하는 db 검색해서 출력 
		BoardDao boardDao = BoardDao.getinstance();
		Board board  = boardDao.bview(bno);
		
		
		
	%>

	<h3>글수정 페이지</h3>
	<a href="boardlist.jsp"><button>글목록</button></a>
	<a href="boardview.jsp?bno=<%=bno%>"><button>취소</button></a>

	<form method="post" action="boardupdateController.jsp">
		<!-- 숨겨서 보내기 -->
		<input type="hidden" name="bno" value="<%=board.getBno()%>">
		제목 : <input type="text" name="btitle" size="50"
			value="<%=board.getBtitle()%>"> <br> 작성자 : <input
			type="text" name="bwriter" size="10" value="<%=board.getBwriter()%>"
			disabled="disabled"> <br> 내용 :
		<textarea rows="10" cols="40" style="resize: none" name="bcontents"><%=board.getBcontents() %></textarea>
		<br> <input type="submit" value="수정"> <a
			href="boardview.jsp?bno=<%=bno%>">
	</form>

</body>
</html>