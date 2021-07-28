<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

		<style type="text/css">
		
			#web{ /*홈페이지 가로 길이*/
				width: 800px;
				margin: 0 auto;
			}
			#header{
				height: 80px;
				background-color: green;
			}
			#sidebar{
				width: 200px;
				height: 300px;
				background-color: orange;
				float: left;					/* 가로정렬 = 왼쪽	*/
			}
			#section{
				width: 600px;
				height: 300px;
				background-color: skyblue;		/* 가로정렬 = 오른쪽 */
				float: right;
			}
			#footer{
				width: 80px;
				background-color: gray;
				clear: both;					/* 이전 float 제거 */
			}
			
			/* 태그로 레이아웃 만들기*/
			
			header{
				height: 80px;
				background-color: green;
			}
			sidebar{
				width: 200px;
				height: 300px;
				background-color: orange;
				float: left;					/* 가로정렬 = 왼쪽	*/
			}
			section{
				width: 600px;
				height: 300px;
				background-color: skyblue;		/* 가로정렬 = 오른쪽 */
				float: right;
			}
			footer{
				width: 80px;
				background-color: gray;
				clear: both;					/* 이전 float 제거 */
			}
			
			
		
		</style>
	
</head>
<body>

	<div id="web">	
		<div id="header">
			상단헤더
		</div>
		
		<div id="sidebar">
			사이드바
		</div>
		
		<div id="section">
			메인 섹션
		</div>
		
		<div id="footer">
			하단 푸터
		</div>
	</div>	
	
	<<div id="web">
		<header>
			상단 헤더 
		</header>
			
		<aside>
			사이드바
		</aside>
		
		<section>
			메인 세션
		</section>
		
		<footer>
			하단 푸터
		</footer>
	</div>
	
	
	


</body>
</html>