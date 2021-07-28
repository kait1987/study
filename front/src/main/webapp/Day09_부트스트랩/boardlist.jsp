<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

		<style type="text/css">
		
			*{text-align: center; !important}
		</style>
		
</head>
<body>

		<%@include file="menu.jsp" %>
		
		<div class="container">
			<table class="table table-stried" style="marker-offset: 100px;">
								<!-- 행바다 구별용 -->
				<thead>
					<tr>
						<th> 번호 </th>
						<th> 대표이미지 </th>
						<th> 제목 </th>
						<th> 작성자 </th>
						<th> 작성일 </th>
						<th> 조회수 </th>
					</tr>
				</thead>
						
					
				<tbody>
					<tr>
						<th> 1 </th>
						<th> 사진위치 </th>
						<th> 제목위치 </th>
						<th> 유재석 </th>
						<th> 2021-07-22 </th>
						<th> 13 </th>
					</tr>
					
					<tr>
						<th> 2 </th>
						<th> 사진위치 </th>
						<th> 제목위치 </th>
						<th> 강호동 </th>
						<th> 2021-07-22 </th>
						<th> 30 </th>
					</tr>
					
				</tbody>
			</table>
<!----------------------------검색 -->	
			<form action="">
				<table style="margin: 0 auto">
					<tr>
						<td>
							<section name="key" class="from-control">
								<option> 제목 </option>
								<option> 내용 </option>
								<option> 작성자 </option>
							</section>		
						</td>
						<td>
							<input type="text" class="from-control" name="keyword" placeholder="검색어 입력">
						</td>
						
						<td>
							<input type="submit" value="검색" class="btn btn-info">
						</td>
					</tr>						
				</table>
			</form>			
			<a href="#" class="btn btn-primary pull-right">글작성</a>
		</div>

</body>
</html>