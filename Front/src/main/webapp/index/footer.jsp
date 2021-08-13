<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<script type="text/javascript">
<!-- 제품등록 유효성 검사-->
	function productcheck() {
		
		if( productform.name.value.length < 5) {
			alert("삼풍명( 최소 5글자 이상 입력해주세요)");
			return false;			
		}
		// 가격 입력이 없거나 뭍자가 포함되어 있으면 X
		if( productform.price.value.length == 0) || isNaN( productform.price.value) ){
			alert("가격은 숫자로 입력해주세요");		// isNaN( 숫자 ) : false		숫자가 아니면 true 반환
			return false;							// isNaN("숫자") : false => 숫자반환 
		}											// isNaN(숫자+문자) : true
		// 가격 음수 제한
		if( productform.price.value <0 ){
			alret("가격은 양수로만 입력해주세요");
			return false;
		}
		
		//재고 입력이 없거나 문자가 포함되어 있으면 X
		if( productform.stock.value.length == 0) || isNaN( productform.stock.value) ){
			alert("가격은 숫자로 입력해주세요");		// isNaN( 숫자 ) : false		숫자가 아니면 true 반환
			return false;							// isNaN("숫자") : false => 숫자반환 
		}											// isNaN(숫자+문자) : true
		
		// 재고 음수 제한
		if( productform.stock.value < 0 ){
			alret("가격은 양수로만 입력해주세요");
			return false;
		}
	}

	<!-- 회원가입 유효성 검사 -->
	
	function signupcheck() {
		// 메소드 정의
		if ( !signupform.id.value){ // id의 값이 null 이면
			alert("아이디를 입력해주세요");
			return false;
		}
		// id는 영문/숫자만 사용가능
		// 정규표현식
			// ^ : 문자 시작 지점
				// $ : 문자 종료지점
				// [ ] : 허용범위
		var regx = /^[a-zA-Z0-9]*$/;
			// var : js 변수 선언 자료형
			
		if ( !regx.test( signupform.id.value) ){
			// 정규표현식이 포함 되어 있지 않으면
			alert("아이디는 영문 혹은 숫자만 가능 합니다.");
			return false;
		}
		if ( !signupform.password.value ){
			alert("패스워드 입력해주세요.");
			return false;
		}
		if (  signupform.password.value != signupform.passwordcheck.value ){
			alert("패스워드가 동일하지 않습니다");
			return false;
		}
		if ( !signupform.name.value ){
			alert("이름을 입력해주세요.");
			return false;
		}
	}
</script>


<!-- 다음 주소 API js -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
    function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample4_postcode').value = data.zonecode;
                document.getElementById("sample4_roadAddress").value = roadAddr;
                document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
                
                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
                if(roadAddr !== ''){
                    document.getElementById("sample4_extraAddress").value = extraRoadAddr;
                } else {
                    document.getElementById("sample4_extraAddress").value = '';
                }

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';

                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                    guideTextBox.style.display = 'block';
                } else {
                    guideTextBox.innerHTML = '';
                    guideTextBox.style.display = 'none';
                }
            }
        }).open();
    }
</script>
</body>
</html>