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
		ArrayList<ProductDto> list = (ArrayList<ProductDto> ) session.getAttribute("cartlist");	
		if( list == null ){ // 만약에 세션이 비어있으면
			list = new ArrayList<>(); // 메모리 할당
		}
		int total = 0;		
		
		 DecimalFormat decimalFormat = new DecimalFormat("###,### 원");  // 천단위 구분 기호 객체
	%>		
		<div class="container">
		
			<h2>장바구니</h2>			
			<table class="table table-hover">
				<tr>
					<th> </th>
					<th>제품명</th>
					<th>구매수량</th>
					<th>가격</th>
					<th>비교</th>
				</tr>
				<tr>
					<%	
						for( ProductDto productDto : list ){							
						int sum = productDto.getProduct_price() * productDto.getProduct_amount(); // 제품가 * 제품수량
					%>
					<tr style="font-size: 20px;" align="center">
						 <td> <img alt="" src="../upload/<%=productDto.getProduct_img()%>" width="50px">
						 <td> <%=productDto.getProduct_name() %></td>
						 <td> 
						 	<%=productDto.getProduct_amount() %>
						 	<button onclick="add()" class="btn btn-info"> + </button>
						 	<%=productDto.getProduct_amount() %>
						 	<button onclick="del()" class="btn btn-info"> - </button>
						 </td>							
						 <td> <%=decimalFormat.format(sum)%> </td>
						 <td> <a href="cartdeletecontroller.jsp?sw=1&pcode=<%=productDto.getProduct_code() %>">삭제</a> </td>
					</tr>
					<%	
							total += sum; // 제품 하나씩 총금액 더하기
						}	
					%>
			</table>	
				<div align="right">
					<a href="cartdeletecontroller.jsp?sw=0" class="btn btn-info"> 모두 비우기 </a>
				</div>				
					
		</div>
		<% int shippingfee = 3000; %>
		<% int orderpay = total + shippingfee; %>
	
		<hr>
		
		<div class="container" style="margin-top: 50px; margin-bottom: 50px;">
			<div align="center" style="text-align: center; background-color: #D3302F; height: 100px; margin-bottom: 50px;" >
				
				<table style="margin: 0 auto;">
					<tr style="font-size: 20px;">
						<td> 총 상품가격</td>  
						<td width="100px;"> </td>
						<td> 총 배송비 </td> 
						<td width="100px;"> </td>
						<td>총 주문금액</td> 
					</tr>
					<tr>
						<td> <%=decimalFormat.format(total) %></td>
						<td> + </td>
						<td> <%=decimalFormat.format(shippingfee) %> </td>
						<td> = </td>
						<td style="color: red"><%=decimalFormat.format((total + shippingfee)) %></td>	
					</tr>	
				</table>
				
			</div>
	
	<%
	
		int orderpay = Integer.parseInt(request.getParameter("orderpay") ) ;
	
	%>
	
	<div class="container">
	
		<!-- 아임포트 결제창 -->
		
		<form name="payform">
			<input type="text" name="orderpay" value="<%=orderpay%>" >
			
		 	<button id="check_module" type="button"> 결제하기 </button>
		</form>
	</div>
	
	
	<!-- iamport.payment.js -->
  <script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.8.js"></script>
	
	<%@include file="../index/footer.jsp" %>
	
</body>
</html>