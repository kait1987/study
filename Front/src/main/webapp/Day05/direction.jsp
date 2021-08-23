<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
h3 {
	text-align: center;
}

#google {
	width: 500px;
	margin: 0 auto;
}
</style>

</head>
<body>

	<%@include file="menu.jsp"%>
	<h3>찾아오시는 길</h3>

	<div id="google">
		<iframe
			src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d664.9344599568216!2d126.93985092078832!3d37.5555547031322!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357c991fe5d235f9%3A0x176caad49800ed93!2z66mU6rCA7Iqk7YSw65SUSVTslYTsubTrjbDrr7gg7Iug7LSM7Lqg7Y287Iqk!5e0!3m2!1sko!2skr!4v1626414378777!5m2!1sko!2skr"
			width="400" height="350" style="border: 0;" allowfullscreen=""
			loading="lazy"></iframe>
	</div>
</body>
</html>