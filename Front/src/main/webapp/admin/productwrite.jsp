<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%@include file="../index/menu.jsp" %>
		
		<div class="container">
		
			<!-- 현재 가로길이를 12등분 했을때  -->
			<div class="col-md-3">
				<!-- 관리자 사이드바 포함 -->
				<%@include file="../admin/adminsiebar.jsp" %>
			</div>
			
			<!-- 공백 -->
			<div class="col-md-1"></div>
			
			<div class="col-md-5">
				제품등록
			</div>
		</div>
		
	<%@include file="../index/footer.jsp" %>	
</body>
</html>