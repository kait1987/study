<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


	<h3> 예제 1</h3>
	
	<%! // 선언문
	
		// 객체 선언
		String 문자 = "문자열 입니다";
		
		
		// 메소드 선언 O
		public String 문자반환(){
			return 문자;
		}
	%>
	
	<% // 스크립트문
	
		// 객체 선언
		String 문자2 = "문자열2 입니다";
		String 문자3 = "문자열3 입니다";
		
		//html에 출력하기
		out.println("현재 객체율 출력" + 문자 + "<br>");
		
		// 메소드 선언 X
		/*
		public String 문자반환(){
			return 문자2;
		}
		*/
	%>
	
	<!-- 표현식 -->
	문자열 출력 :<%=문자 %> <br>
	메소드 출력 :<%=문자반환() %> <br>
	스크립트 출력 :<%=문자2 %> 
	
	<h3> 변수 선언</h3>
	
	<%
		// 스크립트문에서는 객체선언시 전역변수
		String name = "jsp"+ team; %>
		
	<%!
		// 선언문에서 객체 선언시 전역변수
		String team =" 한국팀";
	%>	
	
	 출력결과 : <%=name %>
	 
	 <h3> 메소드 선언 </h3>
	 <%!
	 	int one;
	 	int two = 1;
	 	
	 	public int plus메소드(){
	 		return one+two;
	 	}
	 	String msg;
	 	int three;
	 %>
	 
	 one과 two의 합은 : <%=plus메소드() %> <br>
	 String msg 값은 : <%=msg %> <br>
	 int three 값은 : <%=three %> <br>
	 
	 <h3> 스크립트 </h3>
	 <%!
		int one2;
		String msgone2;
	%>
	
	<%
		int two = 31;
		String msgtwo ="스트립트 예제";
	%>
	
		<%= two +" :  " + msgtwo %> <br>	
		<%=one %> <br>	
		<%=application.getRealPath("/") %> <!--  객체의 메소드도 출력가능 -->
		
	<h3> 스크립트2 </h3>
	
	<%
		float f = 2.3f;
		int i = Math.round(f); // java 클래스도 사용 가능
		
		Date date = new Date();
	%>	
	
	실수 F의 반올림 값은 <%= i %> <br>
	현재 날짜와 시간은 <%= date.toString() %> <br>
	
	<h3> 표현식 </h3>
	<%
		String[] name2 ={ "java" , "jsp" , "android" , "struts"};
	%>
	
	<table border="1">
		<%	for(int j = 0; j< name2.length; j++){
			// <tr> 스크립트문에서 태그 사용 불가
		%>
			<tr>
				<td> <%=j %> </td>
				<td> <%=name2[j] %> </td>
			</tr>
		<% 			
		}
		%>
		
	</table>
	
	<h3> 표현식2 </h3>
	<%
		Date date2 = new Date();
		int 시 = date2.getHours();
		int 값1 = 10;
		int 값2 = 12;
	%>
	
	<%!
		public int 큰값출력( int 값1, int 값2 ){
		
			return 값1>값2 ? 값1 : 값2;
	}
	%>
	지금은 오전일까요? <%= 시<12? "오전":"오후" %> <br>
	둘중 큰 숫자 출력 <%= 큰값출력(값1, 값2) %>
	
	<h3> 제어문 if </h3>
	
	<%
		// jsp에 미리 만들어진 객체  
			// 요청객체 : request 내장객체  [ HttpServletRequest 클래스의 객체 ]
			// 응답객체 
		
		// 요청 인코딩 타입 : EUC-KR 혹은 UTF-8 
		request.setCharacterEncoding("EUC-KR"); 
	
		// 전 페이지로부터 요청 --> name 이름을 갖고 있는 태그로부터 value 값 요청
		String name3 = request.getParameter("name"); 
		String color = request.getParameter("color");
		
		if( color.equals("blue")){ msg="파랑색"; }
		else if( color.equals("red")){ msg="빨강색"; }
		else if( color.equals("orange")){ msg="오렌지색";}
		else{ color = "while"; msg="기타색"; }
	%>
	
		<div style="background-color: <%=color %>">
			<%=name3 %> 님이 좋아하는 색상은 <%=msg %> 입니다
		</div>
</body>
</html>