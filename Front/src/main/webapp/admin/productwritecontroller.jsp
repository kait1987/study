<%@page import="Dto.ProductDto"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="Dao.ProductDao"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
		 // 1.COS 라이브러리 [톰캣 9.0]
				 
		// 2. 폴더 경로 설정
		String realFolder = "C:/Users/me/git/study/Front/src/main/webapp/upload";
	
		// 3. 파일 요청 클래스 [java에서]
				
		MultipartRequest multi = new MultipartRequest ( request , realFolder , 1024 * 1024 , "UTF-8" , new DefaultFileRenamePolicy() );
														// 요청방식   ,  폴더 경로   , 용량[바이트]		, 인코딩타입 , 보안[ 동일한 파일명은 번호 매기기 ]
		// 4. form 태그 속성 enctype="multipart/form-data"
		String product_name = multi.getParameter("name");
		String product_comment = multi.getParameter("comment");
		int product_price = Integer.parseInt( multi.getParameter("price" ) );
		String product_manufacturer = multi.getParameter("manufacturer");
		String product_category = multi.getParameter("category");
		int product_stock = Integer.parseInt( multi.getParameter("stock") );
		String product_releasedate = multi.getParameter("releasedate");
		String product_img = multi.getFilesystemName("img");
						// 첨부파일은 getFilesystemName
		
		// 5. 객체
		ProductDto productDto = new ProductDto(
				product_name, product_comment , product_price , product_manufacturer,
				product_category , product_stock , product_releasedate , product_img );
		
		// 6. DAO
		ProductDao productDao = ProductDao.getinstance();
		boolean result = productDao.productwrite(productDto);
		if( result ) {response.sendRedirect("admininfo.jsp");}
		else{
			PrintWriter printWriter = response.getWriter();
			printWriter.println("<script>");
			printWriter.println("alert('제품 등록 실패[관리자에게 문의] ')");
			printWriter.println("history.back()"); // 전페이지로 이동
			printWriter.println("</script>");
		} // 감사합니다!!!!
	%>
</body>
</html>