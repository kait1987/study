<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="../index/menu.jsp"%>

	<div class="container">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div align="center">
				<img alt="" src="../img/logo2.png" width="100px;"
					style="margin: 30px;">
			</div>
			<form method="post" action="logincontroller.jsp">
				<input type="text" name="id" maxlength="30" class="form-control"
					placeholder="ID"> <br> <input type="password"
					name="password" maxlength="30" class="form-control"
					placeholder="Password"> <br> <input type="submit"
					value="로그인" class="form-control">
			</form>
		</div>
	</div>

	<%@include file="../index/footer.jsp"%>
</body>
</html>