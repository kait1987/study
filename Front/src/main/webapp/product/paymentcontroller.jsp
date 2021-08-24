<%@page import="Dao.ProductDao"%>
<%@page import="Dto.Orders_detail"%>
<%@page import="Dto.ProductDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Dao.OrderDao"%>
<%@page import="Dao.UserDao"%>
<%@page import="Dto.UserDto"%>
<%@page import="Dto.Orders"%>
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
		request.setCharacterEncoding("UTF-8");
		// 0. 필요한 매개변수 요청 
		String loginid = (String)session.getAttribute("loginid");
		UserDao userDao = UserDao.getinstance();
		UserDto userDto = userDao.getuser(loginid); // 로그인된 회원정보
		
		// 받는 사람 
		String rname = request.getParameter("rname");
		
		// 받는 사람 주소 
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String address3 = request.getParameter("address3");
		String address4 = request.getParameter("address4");
		String raddress = address1+"/"+address2+"/"+address3+"/"+address4;
		
		// 받는 사람 연락처 
		String rphone1 = request.getParameter("address1");
		String rphone2 = request.getParameter("address2");
		String rphone3 = request.getParameter("address3");
		String rphone = rphone1+"-"+rphone2+"-"+rphone3;
	
		// 받는 사람 요청사항
		String rcomment = request.getParameter("rcomment");
		
		// 주문 가격 
		int orders_fee = Integer.parseInt( request.getParameter("orderpay") );
		
		// 1. 주문 등록 
			// 1. dto
		Orders orders = new Orders( userDto.getUno() , rname , raddress , rphone , rcomment , orders_fee , 1 );
									// 1. 회원번호 ,  2. 이름  , 주소        연락처   ,  요청사항 ,  상태 , 총결제액 
			// 2. dao
		OrderDao orderDao = OrderDao.getinstance();
		boolean result = orderDao.orderswrite(orders);
		
		if( result){
			
		// 2. 주문 상세 등록 [제품코드별 등록]
			ArrayList<ProductDto> productDtos = (ArrayList<ProductDto>)session.getAttribute("cartlist");
			
			int orders_no = orderDao.getorders_no();
			
			for( ProductDto productDto : productDtos ){
								
				// 1. dto 
				Orders_detail orders_detail = new Orders_detail( orders_no, productDto.getProduct_code() , productDto.getProduct_amount() , 1);
			
				// 2. dao				
				boolean result2 = orderDao.orders_datailwrite(orders_detail);
				
				// 2. 주문 받은 수량만큼 재고 차감
				productDao.stockupdate(productDto);
				
				if( !result2){
					break;
				}
			
			
			}
			
			
			
		// 3. 
			// 1. 장바구니 세션 초기화 
			session.setAttribute("cartlist", null);
			// 2. 결제 완료 페이지로 이동
			response.sendRedirect("paymentcompletion.jsp?orders_no"+orders_no); // 임시
			
			
		}else{
			
		}
			
		
		
		
	
	%>















</body>
</html>