<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- 부트스트랩 CDN -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">


<!-- 웹페이지 전체 폰트 눈누 -->
<style type="text/css">
@font-face {
	font-family: 'ONE-Mobile-POP';
	src:
		url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2105_2@1.0/ONE-Mobile-POP.woff')
		format('woff');
	font-weight: normal;
	font-style: normal;
}

/* 모든 곳에 기본폰트 적용*/
* {
	font-family: 'ONE-Mobile-POP';
}

a {
	text-decoration: none;
	color: black;
}

a:hober {
	text-decoration: none;
	color: black;
}
</style>

</head>
<body>
	<div align="center"">
		<!-- URL : IP주소 : HTTP포트 / 프로젝트명 /폴더명/파일명 -->
		<a href="Front/index/main.jsp"> <img alt=""
			src="/Front/img/logo2.jpg" width='300px;';>
		</a>
	</div>

	<nav>
		<div class="container">
			<ul class="nav navbar-nav navbar-right">
				<%
				// 세션 가져오기
				String loginid = (String)session.getAttribute("loginid");
				if( loginid !=null ){
					if( loginid.equals("admin") ) {
			%>
				<li style="font-size: 8px;"><a href="../admin/admininfo.jsp">관리자</a></li>
				<%
					}
			%>
				<li style="margin: 0 1px; font-size: 8px;"><a
					href="../user/logout.jsp"> 로그아웃 </a></li>
				<li style="margin: 0 1px; font-size: 8px;"><a href="#">
						회원정보 </a></li>
				<%
				}else{
			%>
				<li style="margin: 0 1px; font-size: 8px;"><a
					href="../user/login.jsp"> 로그인 </a></li>
				<li style="margin: 0 1px; font-size: 8px;"><a
					href="../user/signup.jsp"> 회원가입 </a></li>
				<%
			}
			 %>
			</ul>

		</div>
	</nav>

	<nav class="navbar navbar-inverse"
		style="background-color: white !important; margin-bottom: 30px;">
		<div class="container">

			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">toggle</span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>

			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="#"> BSET</a></li>
					<li><a href="#"> TOP</a></li>
					<li><a href="#"> BOTTOM</a></li>
					<li><a href="#"> OUTER</a></li>
					<li><a href="#"> ACC</a></li>
					<li><a href="#"> BRANDS</a></li>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<li style="font-size: 10px;"><a href="#"> CART </a></li>
					<li style="font-size: 10px;"><a href="#"> REVIEW </a></li>
					<li style="font-size: 10px;"><a href="#"> ABOUT </a></li>
					<li style="font-size: 10px;"><a href="#"> Q/A </a></li>
					<li style="font-size: 10px;"><a href="../Board/boardlist.jsp">
							COMMUNITY </a></li>
				</ul>

			</div>
		</div>
	</nav>

	<!-- jquery -->
	<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
	<!-- 부트스트랩 js -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bpptstrap/3.3.2/js/bootsstrap.min.js"></script>
</body>
</html>