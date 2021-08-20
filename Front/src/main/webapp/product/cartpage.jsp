<%@page import="java.text.DecimalFormat"%>
<%@page import="Dto.ProductDto"%>
<%@page import="java.util.ArrayList"%>
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
			
			<div align="center" style="margin-bottom: 50px;">
				<a href="payment.jsp?orderpay=<%=orderpay %>" class="btn btn-info"> 주문 하기</a>
				<a href="#" class="btn btn-info" style="margin-left: 20px;"> 계속 쇼핑하기 </a>
			</div>
			
			<div style="border: 1px solid gray; padding: 30px;">
				<div style="margin-bottom: 20px; font-size: 20px;">
					이용안내
				</div>		
				<div>
					장바구니 이용안내
					<ol>
						<li>해외배송 상품과 국내배송 상품은 함께 결제하실 수 없으니 장바구니 별로 따로 결제해 주시기 바랍니다.
						<li>해외배송 가능 상품의 경우 국내배송 장바구니에 담았다가 해외배송 장바구니로 이동하여 결제하실 수 있습니다.
						<li>선택하신 상품의 수량을 변경하시려면 수량변경 후 [변경] 버튼을 누르시면 됩니다.
						<li>[쇼핑계속하기] 버튼을 누르시면 쇼핑을 계속 하실 수 있습니다.
						<li>장바구니와 관심상품을 이용하여 원하시는 상품만 주문하거나 관심상품으로 등록하실 수 있습니다.
						<li>파일첨부 옵션은 동일상품을 장바구니에 추가할 경우 마지막에 업로드 한 파일로 교체됩니다.
					</ol>	
						결제 안내
					<ol>
						<li>상품별 무이자할부 혜택을 받으시려면 무이자할부 상품만 선택하여 [주문하기] 버튼을 눌러 주문/결제 하시면 됩니다.
						<li>[전체 상품 주문] 버튼을 누르시면 장바구니의 구분없이 선택된 모든 상품에 대한 주문/결제가 이루어집니다.
						<li>단, 전체 상품을 주문/결제하실 경우, 상품별 무이자할부 혜택을 받으실 수 없습니다.
					</ol>
				</div>
			</div>
			
		</div>
		
		
				
		
		
	
		

	<%@include file="../index/footer.jsp" %>
	
</body>
</html>