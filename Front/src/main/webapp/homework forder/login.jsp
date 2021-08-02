<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h3> 로그인 페이지 </h3>
	
	<form method="post" action="logincontroller.jsp">
		아이디 : <input type="text" name="id"> <br>
		비밀번호 : <input type="password" name="password"> <br>
		<input type="submit" value="login">
	</form>

</body>
</html>