<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Dto.NoticeDto"%>
<%@page import="java.util.ArrayList"%>
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


	<%@include file='menu.jsp' %>
	
	<div class="container">
	
		<h3> 커뮤니티 </h3>
		
		<table class="table table-striped">
			<thead>
				<tr>
					<th> 번호 </th>
					<th> 이미지 </th>
					<th> 제목 </th>
					<th> 작성자 </th>
					<th> 작성일 </th>
					<th> 조회수 </th>
				</tr>	
			</thead>
			
			<tbody>
				<!-- 게시글 보이게 하기 -->
				<%
				NoticeDao noticeDao = NoticeDao.getinstance();
				
				ArrayList<NoticeDto> noticeDtos = noticeDao.noticelist();
				
				for ( NoticeDto noticeDto : noticeDtos){
				%>
					<tr>
						<td><%=noticeDto.getNno()%></td>
						<td><%=noticeDto.getNfile() %></td>
						<td width:"700px;"><a href="#"> <%=noticeDto.getNtitle() %></a></td>
						<td><%=noticeDto.getNwriter()%></td>
						
						<%
							String dbdate = noticeDto.getNDate();
							Date date = new Date();
							SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
							
							if( dbdate.substring(0, 10).equals(simpleDateFormat.format(date) ) ){
							%>
								<td><%=dbdate.subSequence(10, 16) %></td>
							<%
							} else {
							%>		
								<td><%=dbdate.subSequence(0, 10) %></td>
							 <%
							}
						%>
						
						<td><%=noticeDto.getNcount() %></td>
					</tr>
					
				<%
				}
				%>		
						
			</tbody>		
		</table>
		
		<a href="boardwrite.jsp" class="btn btn-info pull-right">글작성</a>
		
		 <form>
		 	<table	style="margin: 0 auto;">
		 		<tr>
		 			<td>
		 				<select name="key" class="form-control">
		 					<option> 제목 </option>
		 					<option> 내용 </option>
		 					<option> 작성자 </option>
		 				</select>
		 			</td>
		 			<td>
		 				<input type="text" class="form-control" name="keyword" placeholder="검색어" style="margin: 3px;">
		 			</td>
		 			<td>
		 				<input type="submit" value="검색" class="form-control" style="margin: 6px;">
		 			</td>		
		 		</tr>		
		 	</table>
		 </form>		
		 
		 <div align="center">
		 	<ul class="pagination">
		 		<li class="page-item"> <a href="#"> 이전 </a> </li>
		 		<li class="page-item"> <a href="#"> 1 </a> </li>
		 		<li class="page-item"> <a href="#"> 2 </a> </li>
		 		<li class="page-item"> <a href="#"> 3 </a> </li>
		 		<li class="page-item"> <a href="#"> 다음 </a> </li>
		 	</ul>
		 </div>
	</div>

</body>
</html>