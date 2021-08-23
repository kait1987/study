<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<ul>
		<li>
			<h3>jsp : html에서 태그를 이용한 java 사용</h3>
		</li>
		<li>jsp에서 java코드를 ---> 서블릿 변환 ---> 컴파일된 결과를 html 출력</li>
		<li>1.선언문 ! 2.스크립트문 3.표현식 = 4.지시자 @ 5.주석</li>
	</ul>

	1. 선언문 [ 전역변수 : 변수선언 , 메소드 선언 ]
	<%!
			선언문 
		%>
	2. 스크립트문[ java 실행코드 ]
	<%
			실행문 
		%>
	3. 표현식 [ 출력 ]
	<%= 객체/메소드/변수 등등 %>

	4. 지시자
	<%@ 페이지 관련속성 %>
	5. 주석
	<% //주석 %>
	<% /*여러주석*/ %>
	<%-- 주석 --%>
	<!-- HTML주석 -->


</body>
</html>