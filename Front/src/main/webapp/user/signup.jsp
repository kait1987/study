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

		<div class="row">
			<div class="col-lg-4">
				<!-- 여백 -->
			</div>
			<div class="col-lg-4">
				<div align="center">
					<img alt="" src="../img/logo2.jpg" width="100px;"
						style="margin: 30px;">
				</div>
				<form name="signupform" method="post" action="signupcontroller.jsp"
					onsubmit="return signupcheck()">
					<div class="col-lg-8">
						<label>User ID*</label> <input type="text" class="form-control"
							maxlength="30" name="id">
					</div>
					<div class="col-lg-4">
						<button class="form-control" style="margin-top: 23px;">중복체크</button>
					</div>

					<div class="col-lg-12">
						<label>Password*</label> <input type="password"
							class="form-control" maxlength="30" name="password">
					</div>


					<div class="col-lg-12">
						<label>Password Check*</label> <input type="password"
							class="form-control" maxlength="30" name="passwordcheck">
					</div>


					<div class="col-lg-12">
						<label>Name*</label> <input type="text" class="form-control"
							maxlength="30" name="name">
					</div>


					<div class="col-lg-12">
						<label>Phone</label> <input type="text" class="form-control"
							maxlength="30" name="phone">
					</div>



					<div class="col-lg-12">
						<label>Email</label> <input type="email" class="form-control"
							maxlength="30" name="email">
					</div>

					<div class="col-lg-8">
						<label> Address </label> <input type="text" id="sample4_postcode"
							placeholder="우편번호" name="address1" class="form-control">
					</div>
					<div class="col-lg-4">
						<input type="button" style="margin-top: 23px;"
							onclick="sample4_execDaumPostcode()" value="주소 검색"
							class="form-control">
					</div>
					<div class="col-lg-6">
						<input type="text" id="sample4_roadAddress" placeholder="도로명주소"
							name="address2" class="form-control">
					</div>
					<div class="col-lg-6">
						<input type="text" id="sample4_jibunAddress" placeholder="지번주소"
							name="address3" class="form-control">
					</div>
					<div class="col-lg-12">
						<input type="text" id="sample4_detailAddress" placeholder="상세주소"
							name="address4" class="form-control">
					</div>

					<div class="col-lg-12" style="margin-top: 20px;">
						<input type="submit" value="회원가입" class="form-control">
					</div>
				</form>
			</div>
		</div>

	</div>

	<%@include file="../index/footer.jsp"%>

</body>
</html>