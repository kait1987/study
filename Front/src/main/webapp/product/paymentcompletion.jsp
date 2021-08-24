<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%@include file="../index/menu.jsp" %>
	
	<%
		int orders_no
	
	
	%>
		
		<!-- 결제 완료 페이지 -->
		<div class="container">
			<p align="right"> <span style="color: gray">주문결제 > </span> <span style="color: blue">주문완료</span>
		
	
		<div>
			<img alt="" src="../upload/ordercheck.PNG"> <br>
			<span style="font-size: 40px;">주문이 완료 되었습니다</span>
		</div>
		
		<div align="left" style="margin-top: 20px; font-size: 15px;">
			<h3 style="margin-top: 20px; border-top: 2px solid gray;">주문 정보</h3>
				<div>
					<label>받는사람</label>
					<label> </label>
				</div>
				
				<div>
					<label>상품명</label>
					<label> </label>
				</div>
				
				<div>
					<label>결제일시</label>
					<label> </label>
				</div>
				
				<div>
					<label>주문번호</label>
					<label> </label>
				</div>
				
				<div>
					<label>결제수단</label>
					<label> </label>
				</div>
				
				<div>
					<label>총 결제 금액</label>
					<label> </label>
				</div>			
		</div>
		
		<div align="center">
			<a href=""> <button class="btn btn-info">메인 홈</button></a>
			<a href=""> <button class="btn btn-info">결제 내역보기</button></a>
		</div>
	</div>	
	
	
	<%@include file="../index/footer.jsp" %>
</body>
</html>