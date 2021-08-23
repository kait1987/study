<%@page import="Dao.ProductDao"%>
<%@page import="Dto.ProductDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body onload="init()">

	<%@include file="../index/menu.jsp"%>

	<%
		int pcode = Integer.parseInt( request.getParameter("pcode") ) ;
	
		ProductDao productDao = ProductDao.getinstance();
		ProductDto productDto = productDao.getProduct(pcode);
		
		
	%>

	<div class="container" style="margin-top: 50px;">

		<div class="col-md-6">
			<img alt="" src="../upload/<%=productDto.getProduct_img() %>"
				style="width: 100%">
		</div>

		<div class="col-md-6">
			<div class="view">

				<h3>
					<%=productDto.getProduct_name() %></h3>
				<h6>
					<%=productDto.getProduct_comment() %></h6>
				<p>
					<%=productDto.getProduct_category() %>
				</p>
				<p>
					<%=productDto.getProduct_price() %>
				</p>
				<p>
					<%=productDto.getProduct_stock() %>
				</p>
				<p>
					<%=productDto.getProduct_releasedate() %>
				</p>
				<p>
					<%=productDto.getProduct_active() %>
				</p>
				<p>
					<%=productDto.getProduct_salesrate() %>
				</p>


				<form name="viewform" method="post" action="cartcontroller.jsp">

					<input type="hidden" name="pcode"
						value="<%=productDto.getProduct_code() %>"> <input
						type="hidden" name="max"
						value="<%=productDto.getProduct_stock() %>"> <input
						type="hidden" name="sell_price"
						value="<%=productDto.getProduct_price() %>">

					<!-- 구매 수량 버튼 [ 구매수량 최대값 = 재고수량 ] -->
					<input type="text" name="amount" value="1" size="3"> <input
						type="button" value="+" onclick="add()"> <input
						type="button" value="-" onclick="del()">

					<!-- 총 금액 표시 -->
					총금액 : <input type="text" name="sum" size="10" disabled="disabled">
					원 <br> <a href="#" class="btn btn-info" onclick="addtocart()">
						장바구니 </a> <a href="#" class="btn btn-info"> 구매하기 </a>
				</form>

			</div>
		</div>
	</div>


	<div class="container" style="margin-top: 100px;">
		<!--  탭 메뉴  -->
		<div class="container">
			<!-- 부트스트랩 탭메뉴 -->
			<!-- nav-justified : 탭 자동 간격 -->
			<ul class="nav nav-tabs nav-justified">

				<li class="nav-item"><a class="nav-link " data-toggle="tab"
					href="#productview" style="font-size: 23px;">상품상세</a></li>

				<li class="nav-item"><a class="nav-link " data-toggle="tab"
					href="#productreview" style="font-size: 23px;">상품평</a></li>
				<li class="nav-item"><a class="nav-link " data-toggle="tab"
					href="#productquestion" style="font-size: 23px;">상품문의</a></li>

				<li class="nav-item"><a class="nav-link" data-toggle="tab"
					href="#productinfo" style="font-size: 23px;">배송/교환/반품 안내</a></li>

			</ul>

			<div class="tab-content">
				<div class="tab-pane fade" id="productview">
					<div>상품상제</div>
				</div>

				<div class="tab-pane fade" id="productreview">
					<div>상품평</div>
				</div>

				<div class="tab-pane fade" id="productquestion">
					<div>상품문의</div>
				</div>

				<div class="tab-pane fade" id="productinfo">
					<div>상품평</div>
				</div>

			</div>
		</div>



	</div>

	<%@include file="../index/footer.jsp"%>

</body>
</html>