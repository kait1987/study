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
		// 유효성 검사 : js
	%>

	<%@include file="menu.jsp" %>
				<!-- container width : 1200px -->
	<div class="container">
		
		<h3>글 작성</h3>
		<form name="boardform" method="post" action="boardwritecontroller.jsp" enctype="multipart/form-data">
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
	
		<!--  
			HTML : 웹문서
			CSS : HTML 꾸미기 [스타일 시트]
			JS :
		
		 -->
	
	<script type="text/javascript"> <!-- js[javascript] 유효성 검사 -->
		function boardcheck() {
			// boardcheck 메소드 정의
			
			if( boardform.title.value.length == 0 ) {
				alert("제목을 입력해주세요"); // 메시지 창 띄우기
				return false;
			}
			if (boardform.title.value.length == 0) {
				alert("내용을 입력해주세요"); // 메세지 창 띄우기
				return false;
			}
		}
	
	</script>
	
</body>
</html>