<%@page import="Dao.ProductDao"%>
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

	<%
	
		// 장바구니에 담을 제품코드 
		int pcode = Integer.parseInt( request.getParameter("pcode") ) ;
		// 제품코드의 구매수량 
		int amount = Integer.parseInt( request.getParameter("amount") ) ;
		// 장바구니 [ 세션 ] => 기존의 장바구니 세션 호출 
		ArrayList<ProductDto> list = (ArrayList<ProductDto> ) session.getAttribute("cartlist");
										// 세션 형 변환
		if( list == null ){ // 기존 장바구니 세션이 없으면 
			list = new ArrayList<ProductDto>(); // 메모리 할당 
			session.setAttribute("cartlist", list); // 장바구니 세션 생성 
		}
		
		boolean check = true; // 중복여부 확인 변수
		for( ProductDto productDto : list  ){
			if( productDto.getProduct_code() == pcode ){
				// 장바구니에 기존 제품이 있으면 기존제품에 수량 추가 
				productDto.setProduct_amount( productDto.getProduct_amount() + amount );
					// 기존 제품 구매수량의 새로운 구매수량 추가 
				check = false;
			}
		}
		if( check ){ // 장바구니 세션에 동일한 제품코드가 없을경우 
			ProductDao productDao = ProductDao.getinstance();
			ProductDto productDto = productDao.getProduct(pcode); // 제품코드를 이용한 제품 해당 호출
			productDto.setProduct_amount( amount ); // 해당 제품의 구매수량 설정 
			list.add( productDto ); // 해당 제품 리스트 담기 
		}
		response.sendRedirect("productview.jsp?pcode="+pcode);
		
	
	%>

	

</body>
</html>