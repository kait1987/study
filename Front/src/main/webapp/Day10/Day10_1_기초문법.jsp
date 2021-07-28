<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<p> html · css : 프론트엔드 </p>
	<p> JSP : html내에 자바 코드를 삽입 [html+java] </p>
		<p> 1. 태그안에서 java를 사용 </p>
		
		
	
	클라이언트		-------------요청 HTTP ---------->			서버
	[브라우저:크롬,익스플러 등] <------ 응답 HTTP -----			[ 웹 문서 보관 : HTML 파일]
				
														JSP 파일 
														서블릿 [ JAVA 웹 프로그래밍 클래스 ]
	<p> jsp 태그 
	<!--  
	<%! %> : 선언자 태그 								
	<%  %> : 스트립트 태그 
	<%= %> : 표현식 태그 
	<%@ %> : 지시자 태그 
	<%-- --%> : 주석 태그
	-->
	<% 
		int 변수 = 3;
		for( int i = 0 ; i<5 ; i++ ){ 
			변수 += i;
		}
		
	%>
	반복문 실행후 : <%=변수 %>
	
	
	

</body>
</html>