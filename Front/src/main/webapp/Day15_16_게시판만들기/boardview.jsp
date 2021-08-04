<%@page import="Dao.NoticeDao"%>
<%@page import="Dto.NoticeDto"%>
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
		request.setCharacterEncoding("UTF-8");
		int nno =Integer.parseInt( request.getParameter("nno") );
		
		NoticeDao noticeDao = NoticeDao.getinstance();
		NoticeDto noticeDto = noticeDao.getnotice(nno);
		
	%>

	<%@include file="menu.jsp" %>
	
		<div class="container">
			
			<table class="table table-striped" style="text-align: center;">
				<thead>
					<tr>
						<th colspan="3"> 게시물 조회수 :<%=noticeDto.getNcount() %>
						 작성자 :<%=noticeDto.getNwriter() %> 
						 작성일 :<%=noticeDto.getNDate() %> </th>
					</tr>
				</thead>
				
				<tbody>
					<tr>
						<td width="200px;" style="vertical-align: middle;"> 게시물 제목 </td>
						<td colspan="2" style="text-align: left;"> <%=noticeDto.getNtitle() %> </td>
					</tr>
					<tr>
						<td width="200px;" style="vertical-align: middle;">게시물 내용 </td>
						<td colspan="2" height="400px;" style="text-align: left;" ><%=noticeDto.getNcontents()%> </td>
					</tr>
					<tr>
						<td colspan="2"> <img alt="" src="../upload/<%=noticeDto.getNfile() %>" width="100px;"> </td>
					</tr>
					<tr>
						<td width="200px;">게시물 첨부파일</td>
						<% if(noticeDto.getNfile() == null ){
							%>
							<td colspan="2"> </td>
						<%
						}else{
						%>
							<td colspan="2" > <a href="filecontroller.jsp?file=<%=noticeDto.getNfile() %>"><%=noticeDto.getNfile() %> </a>  </td>
						<%
						}
						%>		
					</tr>
													
				</tbody>
				
			</table>
			<a href="boardupdate.jsp?nno<%=nno %>" class="btn btn-info pull-right">글수정</a>	
			<a href="boarddeletecontroller.jsp?nno=<%=nno %>" class="btn btn-info pull-right" style="margin:  0 10pxl">글삭제</a>
			<a href="boardlist.jsp" class="btn btn-info pull-right">목록보기</a>
		</div>

</body>
</html>