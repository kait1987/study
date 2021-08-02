<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%@include file="menu.jsp" %>
				<!-- container width : 1200px -->
	<div class="container">
		
		<h3>글 작성</h3>
		<form method="post" action="boardwritecontroller.jsp">
			<div style="margin-top: 30px;">
				<label>제목</label>
				<input type="text" class="form-control" name="title">
			</div>
			
			<div tyle="margin-top: 30px;">
				<label>내용</label>
				<textarea rows="5" cols="" style="resize: none;" class="form-control" name="contents"></textarea>
			</div>
			
			<div tyle="margin-top: 30px;">
				<label>첨부파일</label>
				<input type="file" class="form-control" name="file" >
			</div>
			
			<div>
				<input type="submit" value="등록" class="form-control pull-right" style="width: 100px;">
			</div>
		</form>		
	</div>
	
</body>
</html>