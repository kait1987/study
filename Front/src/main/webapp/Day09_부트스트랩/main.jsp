<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		.carousel-control{
		background: none; !important; /*효과가 겹쳐있을 경우 최우선*/
		}
	</style>
</head>
<body>

	<%@include file="menu.jsp" %>
		
		<!-- 사진 슬라이드 = 캐러셀[부트스트랩용] -->
		
		<div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="1000" >
																						<!-- 슬라이드 시간 3000 -> 3초 -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slie-to='0' class="active"></li>
				<li data-target="#myCarousel" data-slie-to='1' ></li>
				<li data-target="#myCarousel" data-slie-to='2' ></li>
			</ol>
			
				<div class="carousel-inner">
					<div class="item active">
						<a href="#"> <img src="carouselimg.jpg" class="img-responsive center-block"></a>
					</div>
					
					<div class="item">
						<a href="#"> <img src="carouselimg2.jpg" class="img-responsive center-block"></a>
					</div>
					
					<div class="item">
						<a href="#"> <img src="carouselimg.jpg" class="img-responsive center-block"></a>
					</div>
				</div>
				
				<a class="left carousel-control" href="#myCarousel" data-slide="prev">
					<span class="glyphicon glyphicon-chevron-left "></span>
				</a>
				
				<a class="left carousel-control" href="#myCarousel" data-slide="next">
					<span class="glyphicon glyphicon-chevron-right "></span>
				</a>
		</div>

</body>
</html>