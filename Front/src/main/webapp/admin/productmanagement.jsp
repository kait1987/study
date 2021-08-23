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


	<%@include file="../index/menu.jsp"%>

	<div class="container">
		<!-- 현재가로길이 12등분 했을때 -->
		<div class="col-md-3">
			<!-- 관리자 사이드 포함 -->
			<%@include file="../admin/adminsiebar.jsp"%>
		</div>

		<!-- 공백 -->
		<div class="col-md-1"></div>

		<div class="col-md-8">
			제품관리
			<!-- 제품검색 -->
			<form method="post" action="productmanagement.jsp">
				<table>
					<tr>
						<td><select name="key" class="form-control">
								<option value="product_code">코드</option>
								<option value="product_name">제품명</option>
								<option value="product_manufacturer">제조사</option>
								<option value="product_category">분류</option>
								<option value="product_releasedate">출시일</option>
								<option value="product_active">활성화</option>
						</select></td>
						<td><input type="text" class="form-control" name="keyword"
							placeholder="검색어" style="margin: 3px;"></td>
						<td><input type="submit" value="검색" class="form-control"
							style="margin: 6px;"></td>
					</tr>
				</table>
			</form>

			<table class="table table-striped">
				<tr>
					<th>이미지</th>
					<th>코드</th>
					<th>제품명</th>
					<th>제조사</th>
					<th>분류</th>
					<th>출시일</th>
					<th>활성화</th>
					<th>비고</th>
				</tr>
				<%
						ProductDao productDao = ProductDao.getinstance();
						
						// 검색이 있는 경우
						
						// 검색이 없는 경우
						ArrayList<ProductDto> productDtos = productDao.productlist();
						
						for( ProductDto productDto : productDtos ){
					%>
				<tr>
					<td><img src="../upload/<%=productDto.getProduct_img()%> "></td>
					<td><%=productDto.getProduct_code() %></td>
					<td><%=productDto.getProduct_name() %></td>

					<td><%=productDto.getProduct_manufacturer() %></td>
					<td><%=productDto.getProduct_category() %></td>

					<td><%=productDto.getProduct_releasedate() %></td>
					<td><%=productDto.getProduct_active() %></td>
					<td>
						<!-- 0:준비중 1:판매중 2:품절 --> <a href="#">
							<button class="btn btn-info">활성화</button>
					</a> <a href="#">
							<button class="btn btn-info">수정</button>
					</a> <a href="#">
							<button class="btn btn-info">삭제</button>
					</a>
					</td>
				</tr>
				<%
						}
					%>
			</table>
		</div>
	</div>
	<%@include file="../index/footer.jsp"%>
</body>
</html>