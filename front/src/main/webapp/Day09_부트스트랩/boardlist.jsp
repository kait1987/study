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
								<!-- ��ٴ� ������ -->
				<thead>
					<tr>
						<th> ��ȣ </th>
						<th> ��ǥ�̹��� </th>
						<th> ���� </th>
						<th> �ۼ��� </th>
						<th> �ۼ��� </th>
						<th> ��ȸ�� </th>
					</tr>
				</thead>
						
					
				<tbody>
					<tr>
						<th> 1 </th>
						<th> ������ġ </th>
						<th> ������ġ </th>
						<th> ���缮 </th>
						<th> 2021-07-22 </th>
						<th> 13 </th>
					</tr>
					
					<tr>
						<th> 2 </th>
						<th> ������ġ </th>
						<th> ������ġ </th>
						<th> ��ȣ�� </th>
						<th> 2021-07-22 </th>
						<th> 30 </th>
					</tr>
					
				</tbody>
			</table>
<!----------------------------�˻� -->	
			<form action="">
				<table style="margin: 0 auto">
					<tr>
						<td>
							<section name="key" class="from-control">
								<option> ���� </option>
								<option> ���� </option>
								<option> �ۼ��� </option>
							</section>		
						</td>
						<td>
							<input type="text" class="from-control" name="keyword" placeholder="�˻��� �Է�">
						</td>
						
						<td>
							<input type="submit" value="�˻�" class="btn btn-info">
						</td>
					</tr>						
				</table>
			</form>			
			<a href="#" class="btn btn-primary pull-right">���ۼ�</a>
		</div>

</body>
</html>