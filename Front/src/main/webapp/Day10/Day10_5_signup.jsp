<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


	<form action="post" action="Day10_6signupController.jsp">
		아이디 : <input type="text" name="id"> <br>
		비밀번호 : <input type="password" name="password"> <br>
		비밀번호 확인 : <input type="password" name="passwordconfirm"> <br>
		이름 : <input type="text" name="name"> <br>
		<input type="submit" value="가입하기">
		<input type="reset" value="취소하기"> <br>
	</form>
</body>
</html>