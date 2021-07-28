<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<!--  form 태그 속성 
					1. method : 전송 방식 
						1. get : url에 매개변수 값이 표시 [ 보안 취약 ] [ 속도(캐시:한번 접근후 데이터 저장) ] 
						2. post : url 에 매개변수 값이 표시x [ 보안 안전 ] [ 
					2. action : 전송 위치  [ submit 클릭했을때 ]
						1. URL
						2. 파일명 
		-->
	<form action="get" action=Day10_3_예제1.jsp>
		이름 : <input type="text" name="name"> <br>
		배경색 : <select name="color">
			
			<option value="blue"> 파랭색 </option>
			<option value="red"> 빨강색 </option>
			<option value="orange"> 오렌지색 </option>
			<option value="white"> 기타 </option>
		</select> <br>
		<input type="submit" value="보내기">
	</form>	
</body>
</html>