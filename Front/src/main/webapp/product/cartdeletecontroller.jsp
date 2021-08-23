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
		String sw = request.getParameter("sw");
	
		if( sw.equals("0") ){
			session.setAttribute("cartlist", null);
		}else{
			int pcode = Integer.parseInt( request.getParameter("pcode") ); // 삭제할 제품 코드 
			ArrayList<ProductDto> list = (ArrayList<ProductDto> ) session.getAttribute("cartlist"); // 장바구니 리스트
			
			for( ProductDto productDto : list ){
				if( productDto.getProduct_code() == pcode ){ // 만약에 리스트에 삭제할 제품코드가 있으면 
					list.remove(productDto);	// 장바구니리스트에서 해당 제품 삭제 
					session.setAttribute("cartlist", list ); // 장바구니리스트 세션 새롭게 부여 
					break;
				}
			}
		}
		response.sendRedirect("cartpage.jsp");
	%>

</body>
</html>