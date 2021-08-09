<%@page import="Dto.UserDto"%>
<%@page import="Dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!--  현재 파일이 포함시키는 파일과 폴더가 동일한 경우 -->
	<%//@include file="../index/menu.jsp" %>
	
	<!-- 현재 파일이 포함시키는 파일과 폴더가 다른경우 -->
	<%@include file="../index/menu.jsp" %>
	
	<%
		UserDao userDao = UserDao.getinstance();
		UserDto userDto = userDao.getuser(loginid);
	%>
	
	<div class="container">
		<!-- 부트스트랩 탑메뉴 --> <!-- nav-justified : 탭 자동 간격 -->
		<ul class="nav navbar-tabs nav-justified">
			
			<li class="nav-item">
				<a class="nav-link" data-toggle="tab" href="#order">주문목록</a>
			</li>
			
			<li class="nav-item">
				<a class="nav-link active" data-toggle="tab" href="#info">회원정보</a>
			</li>
			
			<li class="nav-item">
				<a class="nav-link" data-toggle="tab" href="#infoupdate">회원수정</a>
			</li>
			
			<li class="nav-item">
				<a class="nav-link" data-toggle="tab" href="#infodelete">회원탈퇴</a>
			</li>
			
		</ul>
		
		<div class="tab-content">
			<div class="tab-pane fade" id="order">
				<div>주문목록</div>
			</div>
			<div class="tab-pane fade" id="info">
				<div>
					<table>
						<tr>
							<td> 아이디:<%=loginid %> </td>
						</tr>
						
						<tr>
							<td> 비밀번호:******** </td>
						</tr>
						
						<tr>
							<td> 성명:<%=userDto.getUname() %> </td>
						</tr>
						
						<tr>
							<td> 주소:<%=userDto.getUaddress() %> </td>
						</tr>
						
						<tr>
							<td> 이메일:<%=userDto.getUemail() %> </td>
						</tr>
						
						<tr>
							<td> 포인트:<%=userDto.getUpoint() %> </td>
						</tr>
					</table>
				</div>
			</div>
			<div class="tab-pane fade" id="infoupdate">
				<div>회원수정</div>
			</div>
			<div class="tab-pane fade" id="infodelete">
				<div>회원탈퇴</div>
			</div>
		</div>
	</div>
	<%@include file="../index/footer.jsp" %>
</body>
</html>