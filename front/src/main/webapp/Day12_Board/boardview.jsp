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
	<a href="boardlist.jsp"><button>목록</button> </a>
	<a href="#"><button>수정</button> </a>
	<a href="boarddeletecontroller.jsp?bno=<%=bno%>"><button>삭제</button> </a>
	<table border="1">
		<tr>
			<td colspan="3"> 제목 :  <%=board.getBtitle() %> </td>
		</tr>
		
		<tr>
			<td> 작성자 :  <%=board.getBwriter() %> </td> 
			<td> 작성일 : <%=board.getBdate() %> </td> 
			<td> 조회수 : <%=board.getBcount() %> </td>
		</tr>
		
		<tr>
			<td colspan="3"> 내용 : <%=board.getBcontents() %> </td> 
		</tr>
		
		
	</table>
	
	
	

</body>
</html>