<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
@font-face {
	font-family: 'WandohopeB';
	src:
		url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-10@1.0/WandohopeB.woff')
		format('woff');
	font-weight: normal;
	font-style: normal;
}

* {
	font-family: 'WandohopeB';
}

#menuul {
	padding: 15px;
	text-align: center;
	color: white;
	border-bottom: solid 1px black;
}

.menuli {
	display: inline;
	margin-left: 20px;
}

a {
	text-decoration: none;
}

a:hover {
	color: orange;
	text-decoration: none;
}
</style>
</head>
<body>
	<ul id="menuul">
		<li class="menuli"><a href="info1.jsp">회사 소개</a></li>
		<li class="menuli"><a href="product.jsp">제품 소개</a></li>
		<li class="menuli"><a href="board.jsp">고객 센터</a></li>
		<li class="menuli"><a href="login.jsp">로그인</a></li>
		<li class="menuli"><a href="signup.jsp">회원가입</a></li>
		<li class="menuli"><a href="direction.jsp">찾아 오시는길</a></li>
	</ul>
</body>
</html>







