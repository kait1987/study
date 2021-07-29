<%@page import="Dto.Board"%>
<%@page import="java.util.ArrayList"%>
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
	<h3>글목록 페이지</h3>
	<a href="boardwrite.jsp"><button>글쓰기</button></a>
		<table>
			<tr>
				<th> 번호 </th>
				<th> 제목 </th>
				<th> 작성자 </th>
				<th> 작성일 </th>
				<th> 조회수 </th>
			</tr>	
			
			<%
				BoardDao boardDao = BoardDao.getinstance();
			
				ArrayList<Board> boards = boardDao.blist();
				
				
				for(Board board : boards ){
				
				
			
			%>
			<tr> <!-- for문이용이한 출력 -->
				<td><%=board.getBno()%></td>
				<td><%=board.getBtitle()%></td>
				<td><%=board.getBwriter()%></td>
				<td><%=board.getBdate()%></td>
				<td><%=board.getBcount()%></td>
			</tr>
			<%
			
				}
				
			%>		
		</table>

</body>
</html>