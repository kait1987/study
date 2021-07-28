<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

		<style type="text/css">
			
			*{ margin: 0; padding: 0; text-align: center;}
			.box{width: 1100px; margin: 0 auto; border: solid 1px black;}
			header{ height: 150px; border: solid 1px blue;}
			#main{width: 800px; height: 400px; border: solid 1px green; float: left;}
			aside{width: 296px; height: 400px; border: solid 1px blue; float: right;}
			footer{height: 150px; border: solid 1px blue; clear: both;}
				
		
		</style>
</head>
<body>

		<header>
			<div class="box">
				<div id="logo">
					로고 · 검색
				</div>
			</div>	
			
			<div class="box">
				<div id="main_menu">
					메인 메뉴
				</div>
			</div>
		
		</header>

		
		<section>
			<div class="box">
				<div id="main">
					main
				</div>
				<aside>
					사이드바
				</aside>
			</div>
		</section>


		<footer>
			<div class="box">
				푸터
			</div>
		</footer>


</body>
</html>