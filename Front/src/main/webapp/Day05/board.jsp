<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
h3 {
	text-align: center;
}

table {
	border-top: solid 3px black;
	width: 600px;
	margin: 0 auto;
}

td {
	border-bottom: solid 1px #cccccc;
	padding: 10px;
}

input {
	width: 500px;
	height: 30px;
}

textarea {
	width: 500px;
	height: 100px;
	resize: none; /* 크기조절 기능제거 */
}

#buttons {
	width: 600px;
	text-align: right;
	margin: 0 auto;
}

button {
	padding: 5px 20px;
	margin-left: 10px;
	margin-top: 30px;
}
</style>
</head>
<body>

	<%@include file="menu.jsp"%>

	<h3>고객 센터</h3>

	<form>
		<table>
			<tr>
				<td>이름</td>
				<td>홍길동</td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td>글내용</td>
				<td><textarea rows="" cols=""></textarea>
			</tr>
			<tr>
				<td>파일</td>
				<td><input type="file"></td>
			</tr>
		</table>

		<div id="buttons">
			<button>저장하기</button>
			<button>목록보기</button>
		</div>
	</form>

</body>
</html>