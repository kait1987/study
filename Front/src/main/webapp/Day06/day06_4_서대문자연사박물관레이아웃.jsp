<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	
		<style type="text/css">
			/* 전체 여백 제거*/
			*{margin: 0; padding: 0; text-align: center;}
			li{ list-style-type: none;}/*글머리제거*/
			.box{width: 1000px; margin: 0 auto; border: solid 1px black;}
			
			header{ height: 100px; border: solid 1px red;}
			header #top{ height: 30px; border: border: solid 1px green;}
			header #top_menu{ border: solid 1px blue; float: right; }
						
			section #main_image{ width: 750px; height: 300px;
				margin-top: 20px; border: solid 1px orange; float: left;}
				
			section aside { width: 246px; height: 300px;
				margin-top: 20px; border: solid 1px blue; float: right;}
				
			#main{ clear: both;}
			
			#main li{ display: inline-block; margin-top: 20px;}
			
			main .itme1 { width: 200px; height: 250px; border: solid 1px orange; }		
			main .itme2 { width: 250px; height: 250px; border: solid 1px orange; }
			
			footer{ height: 100px; margin-top: 50px; border: solid 1px orange; }
			footer #footer1{ float: left; border: solid 1px orange;}
			footer #footer2{ float: right; border: solid 1px orange;}
		
		</style>
</head>
<body>

		<header>
			<div id="top">
				<div class="box">
					<div id="top_menu">
						상단 메뉴
					</div>
				</div>
			</div>	
			
			<div class="box">
				<div id="main_menu">
					로고 & 메인 메뉴 & 검색
				</div>
			</div>
		</header>
		
		<section>
			<div class="box">
				<div id=main_image>
					메인 이미지
				</div>
				<aside>
					사이드바
				</aside>
				<div id="main">
					<ul>
						<li class="item1"> 항목1 </li>
						<li class="item2"> 항목2 </li>
						<li class="item3"> 항목3 </li>
						<li class="item4"> 항목4 </li>
					</ul>
				</div>
			</div>
		</section>
		
		<footer>
			<div class="box">
				<div id="footer1">
						푸터1
				</div>
				<div id="footer2">
						푸터2
				</div>
			</div>
		</footer>	
		

</body>
</html>