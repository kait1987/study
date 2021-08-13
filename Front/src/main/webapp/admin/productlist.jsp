<%@page import="Dto.ProductDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.ProductDao"%>
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
	
		<div class="container">
			<!-- 현재 가로길이를 12등분 했을때 -->
			<div class="col-md-3">
				<!-- 관리자 사이드바 포함 -->
				<%@include file="../admin/adminsiebar.jsp" %>
			</div>
			
			<!-- 공백 -->
			<div class="col-md-1"></div>
			
			<div class="col-md-8">
				
				제품리스트
				<table class="table">
					<tr>
						<th>이미지</th>
						<th>코드</th>
						<th>제품명</th>
						<th>제조사</th>
						<th>분류</th>
						<th>출시일</th>
						<th>활성화상태</th>
						<th>판매량</th>
					</tr>
					<%
						ProductDao productDao = ProductDao.getinstance();
						ArrayList<ProductDto> productDtos = productDao.productlist();
						
						for( ProductDto productDto : productDtos ){
					%>	
						<tr>
							<td> <img src="../upload/<%=productDto.getProduct_img() %>" width="30px;"> </td>
							<td><%=productDto.getProduct_code() %></td>
							<td><%=productDto.getProduct_name() %></td>
			
							<td><%=productDto.getProduct_manufacturer() %></td>
							<td><%=productDto.getProduct_category() %></td>
	
							<td><%=productDto.getProduct_releasedate() %></td>
							<td><%=productDto.getProduct_active() %></td>
							<td><%=productDto.getProduct_salesrate() %></td>
						</tr>
					<%
						}
					%>	
				</table>
			</div>
		</div>
	<%@include file="../index/footer.jsp" %>	
</body>
</html>