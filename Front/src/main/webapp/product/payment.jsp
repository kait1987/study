<%@page import="Dto.UserDto"%>
<%@page import="Dao.UserDao"%>
<%@page import="Dto.ProductDto"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<style type="text/css">
table {
	border-top: solid 2px gray;
	width: 100%;
	margin-bottom: 25px;
	border-spacing: 0 15px;
}

table tr {
	
}

table .col1 {
	width: 150px;
	padding: 20px;
}

table .col2 {
	
}
</style>
</head>
<body>
	<%@include file="../index/menu.jsp"%>

	<%
		ArrayList<ProductDto> list = (ArrayList<ProductDto> ) session.getAttribute("cartlist");
		if( list == null ){ // 만약에 세션이 비어 있으면
			list = new ArrayList<>(); // 메모리 할당
		}
		int total = 0; // 장바구니 내 제품들의 총금액 
		
		 DecimalFormat decimalFormat = new DecimalFormat("###,### 원");  // 천단위 구분 기호 객체
		 
		 int orderpay = Integer.parseInt( request.getParameter("orderpay") ) ;
		 
	%>


	<div class="container">
		<p align="right">
			<span style="color: blue">주문결제 > </span> <span style="color: gray">주문완료</span>
		</p>

		<h2>주문/결제</h2>
		<table class="table table-hover">
			<tr>
				<th></th>
				<th>제품명</th>
				<th>구매수량</th>
				<th>가격</th>

			</tr>
			<%
						for( ProductDto productDto : list ){	
						int sum = productDto.getProduct_price() * productDto.getProduct_amount(); // 제품가 * 제품수량 
					%>
			<tr style="font-size: 20px;" align="center">
				<td><img alt=""
					src="../upload/<%=productDto.getProduct_img() %>" width="50px">
				<td><%=productDto.getProduct_name() %></td>
				<td><%=productDto.getProduct_amount() %></td>
				<td><%=decimalFormat.format(sum) %></td>

			</tr>
			<%	
							total += sum; // 제품 하나씩 총금액에 더하기 
						}
					%>
		</table>

	</div>
	<% int shippingfee = 3000;%>
	<hr>
	<div class="container" style="margin-top: 50px; margin-bottom: 50px;">
		<div
			style="text-align: center; background-color: #FFFBEE; height: 100px; margin-bottom: 50px;">

			<table style="margin: 0 auto;">
				<tr style="font-size: 20px;">
					<td>총 상품가격</td>
					<td width="100px;"></td>
					<td>총 배송비</td>
					<td width="100px;"></td>
					<td>총 주문금액</td>
				</tr>
				<tr style="font-size: 30px;">
					<td><%=decimalFormat.format(total) %></td>
					<td>+</td>
					<td><%=decimalFormat.format(shippingfee) %></td>
					<td>=</td>
					<td style="color: red"><%=decimalFormat.format(orderpay) %></td>
				</tr>
			</table>

		</div>
	</div>

	<%
			// 로그인 회원의 정보 호출 
			String uid = (String)session.getAttribute("loginid");
			UserDao userDao = UserDao.getinstance();
			UserDto userDto =userDao.getuser(uid);
			
		%>
	<div class="container">
		<h3>주문 고객</h3>
		<div>
			<table>

				<tr>
					<td class="col1">성명*</td>
					<td class="col2"><%=userDto.getUid() %></td>
				</tr>
				<tr>
					<td class="col1">주소*</td>
					<td class="col2"><%=userDto.getUaddress() %></td>
				</tr>
				<tr>
					<td class="col1">이메일*</td>
					<td class="col2"><%=userDto.getUemail() %></td>

				</tr>
			</table>
		</div>
	</div>

	<div class="container">
		<h3 style="display: inline-block;">배송지 정보</h3>
		<input type="checkbox"> 주문자 정보와 동일
		<div>
			<form class="form-inline" method="post"
				action="paymentcontroller.jsp">

				<input type="hidden" name="orderpay" value="<%=orderpay%>">

				<div class="form-group">
					<label>성명</label> <br> <input type="text" name="rname"
						class="form-control"><br>
				</div>

				<br>
				<br>

				<div class="form-group">
					<label>주소</label> <br> <input type="text"
						id="sample4_postcode" placeholder="우편번호" name="address1"
						class="form-control"> <input type="button"
						onclick="sample4_execDaumPostcode()" value="주소 검색"
						class="form-control" size="18"> <br> <input
						type="text" id="sample4_roadAddress" placeholder="도로명주소"
						name="address2" class="form-control"> <input type="text"
						id="sample4_jibunAddress" placeholder="지번주소" name="address3"
						class="form-control"> <br> <input type="text"
						id="sample4_detailAddress" placeholder="상세주소" name="address4"
						class="form-control" size="46px;">

				</div>
				<br>
				<br>
				<div class="form-group">
					<label>연락처</label> <br> <select name="rphone1"
						class="form-control">
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="02">02</option>
					</select> - <input type="text" name="rphone2" maxlength="4" size="4"
						class="form-control"> - <input type="text" name="rphone3"
						maxlength="4" size="4" class="form-control">
				</div>
				<br>
				<br>
				<div class="form-group">
					<label>배송시 요청사항</label> <br> <input type="text"
						name="rcomment" class="form-control" size="46px;">
				</div>
				<!-- 테스트버튼 -->
				<input type="submit" value="결제완료">

			</form>
		</div>
	</div>

	<div class="container">
		<div>
			<h3>구매 혜택</h3>
			<form class="form-inline" style="border-top: solid 2px gray;">
				<label style="margin-right: 30px;"> 현재 포인트 <%=userDto.getUpoint() %></label>
				<input type="text" size="4" class="form-control">
				<button class="btn btn-info">포인트사용</button>
				</td>
			</form>
		</div>
	</div>


	<div class="container" style="margin-top: 50px;">
		<h3>결제 수단</h3>
		<div style="border-top: solid 2px gray;">

			<!-- 아임포트 결제창 -->
			<form name="payform">
				<input type="hidden" name="orderpay" value="<%=orderpay%>">
				<button id="check_module" type="button" class="btn btn-info">
					카드 결제</button>
				<button id="check_module" type="button" class="btn btn-info">
					모바일</button>
				<button id="check_module" type="button" class="btn btn-info">
					삼성 페이</button>
				<button id="check_module" type="button" class="btn btn-info">
					카카오 페이</button>
			</form>

			<h2>결제 이용안내</h2>

			<h2>결제 수단</h2>
		</div>
	</div>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<!-- iamport.payment.js -->
	<script type="text/javascript"
		src="https://cdn.iamport.kr/js/iamport.payment-1.1.8.js"></script>
	<%@include file="../index/footer.jsp"%>

</body>
</html>