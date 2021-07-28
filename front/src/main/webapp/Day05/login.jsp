<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		h3{
			text-align: center;
		}
		form{
			width: 400px;
			margin: 0 auto;  /* 가로 가운데 정렬 */
		}
		input {
			width: 150px;	/* 입력상자의 가로길이 */ 
			height: 25px;	/* 입력상자의 세로길이 */ 
		}
		button {
			padding: 25px;
			margin-left: 15px;
		}
		table{
			margin-top: 50px;
		}
	</style>
</head>
<body>
		<%@include file="menu.jsp" %>
			<h3> 로그인 폼</h3>
		<form>
		
			<table>
				<tr>
					<td> 아이디 </td>
					<td> <input type="text"> </td>
					<td rowspan="2"> <button>로그인</button> </td>
				</tr>
				<tr>
					<td> 비밀번호 </td>
					<td> <input type="password"> </td>
				</tr>
			</table>
		</form>

</body>
</html>