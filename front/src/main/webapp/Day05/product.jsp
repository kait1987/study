<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	
		#ul2{
			width: 300px;
			margin: 30px auto;
			border: solid 1px #dddddd;
		}
		#ul2 li{
			list-style-type: none;
			padding: 5px;
		}
		.row1 img{
			width: 250px;
		}
		.row2{
			font-weight: bold;
			font-size: 20px;
			padding-top: 20px;
			border-top: solid 1px #dddddd;
		}
		.row3{
			font-weight: bold;
		}
		.row4{
			margin-top: 10px; line-height: 180%;
		}
		.row5{
			margin: 10px;
		}
		.row5 span{
			color: orange; font-weight: bold;
		}
	
	
	</style>

</head>
<body>

	<%@include file="menu.jsp" %>
	
	<ul id ="ul2">
		<li class="row1"><img alt="" src="파인애플.jpg"> </li>
		<li class="row2">프리미엄 파인애플 바구니세트 ...</li>
		<li class="row3">25,000원</li>
		<li class="row4">판매자가 직접키운 파인애플입니다. 집들이, 기념일, 병문안, 생일 등 특별한 날에 상큼한 파인애플과 함께...</li>
		<li class="row5">리뷰 <span>130</span> · 평점 <span>4.9/5</span></li>
	</ul>
	
	
	
</body>
</html>