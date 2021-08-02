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
		li{
			list-style-type: none;	/*�۸Ӹ� ����*/
		}
		#join{
			margin: 0 auto;		/* �ڽ� ��� ����*/
			border-top: solid 1px #cccccc;
			border-bottom: solid 1px #cccccc;
			padding: 20px;
			width: 600px;
		}
		.cols{
			padding: 5px;
		}
		.cols li{
			display: inline-block;
		}
		.col1{
			width: 150px;
		}
		.col2 input , select {
			width: 200px;
			height: 30px;
		}
		.email input {
			width: 350px;
			height: 100px;
		}
		textarea {
			width: 350px;
			height: 100px;
		}
		.hello{
			vertical-align: top;
		}
		#buttons{
			margin: 0 auto;
			width: 550px;
			text-align: right;
		}
		#buttons button{
			padding: 10px 20px;
			margin-top: 20px;
		}

	</style>





</head>
<body>
	<%@include file="menu.jsp" %>
	<h3> ȸ������ �� </h3>

	<form>
		<ul id ="join">
			<li>  <!-- 1�� -->
				<ul class="cols">
					<li class="col1" > ���̵� </li>
					<li class="col2" > <input type="text"> </li>
				</ul>
			</li>
			
			<li>  <!-- 2�� -->
				<ul class="cols">
					<li class="col1" > ��й�ȣ </li>
					<li class="col2" > <input type="password"> </li>
				</ul>
			</li>
			
			<li>  <!-- 3�� -->
				<ul class="cols">
					<li class="col1"> ��й�ȣ Ȯ�� </li>
					<li class="col2"> <input type="password"> </li>
				</ul>
			</li>
			
			<li>  <!-- 4�� -->
				<ul class="cols">
					<li class="col1"> �̸� </li>
					<li class="col2"> <input type="text"> </li>
				</ul>
			</li>
			<li>  <!-- 5�� -->
				<ul class="cols">
					<li class="col1"> �̸��� </li>
					<li class="col2"> <input type="text"> @ </li> 
					<li> <select>
							<option>�����Է�</option>
							<option>naver.com</option>
							<option>gmail.com</option>
						</select> </li>
				</ul>
			</li>
			
			<li>  <!-- 6�� -->
				<ul class="cols">
					<li class="col1"> �̸��� ���� </li>
					<li > 
						<input type="radio" name="email" checked="checked"> ����� 
						<input type="radio" name="email" > ����
					 </li>
				</ul>
			</li>
			
			<li>  <!-- 7�� -->
				<ul class="cols">
					<li class="col1"> ���� ��� </li>
					<li > 
						<input type="checkbox" name="route1"> ģ����õ
						<input type="checkbox" name="route1"> ���ͳݰ˻�
						<input type="checkbox" name="route1" checked="checked" > ��Ÿ
					 </li>
				</ul>
			</li>	
			
			<li>  <!-- 8�� -->
				<ul class="cols">
					<li class="col1 hello"> �λ縻 </li>
					<li > 
						<textarea rows="" cols=""></textarea>
					 </li>
				</ul>
			</li>		
		</ul>
		
		<div id="buttons">
			<button type="submit">�����ϱ�</button>
			<button type="button">����ϱ�</button>
		</div>
		
	</form>




</body>
</html>