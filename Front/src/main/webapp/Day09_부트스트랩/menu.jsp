<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<!-- 부트스트랩 css 가져오기 -->
	<link rel="stylesheet" href="../css/bootstrap.css">
	<!--  반응형 웹[디바이스크기 자동크기 조절] -->
	<meta name="viewport" content="width=device-width initial-scale = 1 ">
	
	<style type="text/css">
	
		@font-face{
		font-family: 'Eulyoo1945-semibold';
		src: url("https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2102-01@1.0/Eulyoo1945-SemiBold.woff"); format('woff');
		font-weight: normal;
		font-style: normal;
		}
		
		
		
		*{ font-family: Eulyoo1945-semibold }
		
		.navbar-nav li a{ font-size: 15px; color: black;  }

</style>
</head>	
<body>
	<nav class="navbar navbar-default navbar-fixed-top" style="background-color: white;">
		<div class="container">
			<div class="navbar-header">
			
				<!-- 화면 크기가 작을 경우 메뉴 버튼 -->
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
						<span class="sr-only"> toggle </span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>				
				</button>
			
			
				<a href="main.jsp"> <img alt="" src="logo.png" style="width: 120px; padding: 20px;"></a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				
				<ul class="nav navbar-nav">
					
					<li class="dropdown"> <!-- 드롭다운시작 -->
						
						<a href="#" class="dropdown-toggle" 
									data-toggle="dropdown" 
									role="button"
									aria-haspopup="true" 
									aria-expanded="false"> top <span class="caret"></span> </a>
						<ul class="dropdown-menu">
							<li> <a href="#">나이키</a> </li>
							<li> <a href="#">아디다스</a> </li>
							<li> <a href="#">휠라</a> </li>
						</ul>	
					<li>	<!-- 드롭다운 끝 -->	
						
						
					<li class="dropdown"> <!-- 드롭다운시작 -->
						
						<a href="#" class="dropdown-toggle" 
									data-toggle="dropdown" 
									role="button"
									aria-haspopup="true" 
									aria-expanded="false"> bottom </a>
						<ul class="dropdown-menu">
							<li> <a href="#">나이키</a> </li>
							<li> <a href="#">아디다스</a> </li>
							<li> <a href="#">휠라</a> </li>
						</ul>	
					<li>	<!-- 드롭다운 끝 -->	
					
					<li class="dropdown"> <!-- 드롭다운시작 -->
						
						<a href="#" class="dropdown-toggle" 
									data-toggle="dropdown" 
									role="button"
									aria-haspopup="true" 
									aria-expanded="false"> outer </a>
						<ul class="dropdown-menu">
							<li> <a href="#">나이키</a> </li>
							<li> <a href="#">아디다스</a> </li>
							<li> <a href="#">휠라</a> </li>
						</ul>	
					<li>	<!-- 드롭다운 끝 -->	
					
					<li class="dropdown"> <!-- 드롭다운시작 -->
						
						<a href="#" class="dropdown-toggle" 
									data-toggle="dropdown" 
									role="button"
									aria-haspopup="true" 
									aria-expanded="false"> etc </a>
						<ul class="dropdown-menu">
							<li> <a href="#">나이키</a> </li>
							<li> <a href="#">아디다스</a> </li>
							<li> <a href="#">휠라</a> </li>
						</ul>	
					<li>	<!-- 드롭다운 끝 -->	
						
				</ul>
				
				<ul class="nav navbar-nav navbar-right">
				<%
					// day11 로그인컨트롤에서 세션 부여 받은 후 코드
					
					String logid = (String)session.getAttribute("logid");
					if( logid !=null){
					%>
						<li> <%=logid %>님 안녕하세요</li>
					<%	
					}
					
				%>
					<li> <a href="boardlist.jsp" style="font-size: 13px;">공지사항</a> </li>
					<li> <a href="#" style="font-size: 13px;">로그인</a> </li>					
					<li> <a href="#" style="font-size: 13px;">회원가입</a> </li>
					<li> <a href="#" style="font-size: 13px;">로그아웃</a> </li>
					<li> <a href="#" style="font-size: 13px;">관리자페이지</a> </li>
					<li> <img alt="" src="cart.png" width="40px;" style="padding-top: 10px;"> </li>
				</ul> 
				
			</div>
		</div>
	</nav>
	<!--  jquery  -->
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<!--  부트스트랩 js -->
	<script src="../js/bootstrap.js"></script>

	

</body>
</html>