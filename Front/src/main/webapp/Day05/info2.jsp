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

#info {
	width: 600px;
	margin: 0 auto;
}

td {
	border-bottom: solid 1px #eeeeee;
}

.col1 {
	width: 80px;
	font-size: 30px;
	vertical-align: top;
}

.col2 {
	width: 50px;
	font-size: 20px;
}

.col3 {
	width: 400px;
	font-size: 15px;
}
</style>
</head>
<body>

	<%@include file="menu.jsp"%>
	<%@include file="companyinfo.jsp"%>

	<h3>회사 연혁</h3>

	<div id="info">

		<table>
			<tr>
				<td rowspan="2" class="col1">2001</td>
				<td class="col2">12</td>
				<td class="col3">TUV NORD와 상호 업무 협정 체결</td>
			</tr>
			<tr>
				<td class="col2">12</td>
				<td class="col3">aT공사 & 한국전력 지정 컨설팅사 등록</td>
			</tr>
			<tr>
				<td rowspan="2" class="col1">2002</td>
				<td class="col2">01</td>
				<td class="col3">중소벤처기업부 지정 컨설팅사 등록</td>
			</tr>
			<tr>
				<td class="col2">04</td>
				<td class="col3">미국 FDA 인정 연구기관 Microbac Analytical
					Laboratories Partnership</td>
			</tr>
			<tr>
				<td class="col1">2003</td>
				<td class="col2">02</td>
				<td class="col3">서울대학교 경영정보연구소와 산학연 체결</td>
			</tr>
		</table>

	</div>


</body>
</html>