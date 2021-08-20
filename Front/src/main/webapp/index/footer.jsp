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
	
	<!-- 제품상세페이지 제품수량 -->
	// js 변수선언
		// var 변수명
	var amount;		// 제품 수량 변수 
	var sell_price; // 제품 가격 변수 
	
		// js 메소드를 java에서 호출하는 방법 
			// onload="init()" : 해당 태그가 실행되었을대 메소드 실행 
			// onclick="add()" : 해당 태크를 클릭했을때 메소드 실행
	
	function init() { // 페이지 열렸을때 초기값 메소드 
	// js 메소드 선언 
		// function 메소드명( 인수 ){  }
	
		// 현재수량
		amount = document.viewform.amount.value;
		// 현재 제품 금액
		sell_price = document.viewform.sell_price.value;
		// 현재 제품 재고
		max = document.viewform.max.value;
		// 총금액
		document.viewform.sum.value = sell_price.toString().replace(/\B(?<!\.\d*)(?=(\d{3})+(?!\d))/g, ",");
				// js 정규표현식 
					// replace( 정규표현식[패턴] , "해당패턴의 교체할문자")
						// 3번째 자릿수 마다 , 문자열 교체 
						// /:시작과 끝 
						// /g : 패턴의 검색 방법  [ g = Global ]
							// \B : 문자 시작점 찾기
							// \B( 앞 = 문자존재),(뒤=문자열3글자)
								// (?<!\.\d*) 
									// \d : [ 0~9 ] : 숫자 문자 
									// \d{3} : 숫자 3개 
							
								// ( ?=(\d{3})+(?!\d) )
								 	// 앞 + 뒤 조건 모두 충족 (?=(\d{3}) + ?!\d) )
								 	
	}
	
	function add() { // +버튼 눌렀을때 메소드 실행 
		hm = document.viewform.amount;
		sum  =  document.viewform.sum;
		
		if( hm.value > parseInt(max) ){
			//현재수량이 재고수보다 커지면 중지 
						// 문자열 => 정수형 
						// java : Integer.parseInt(  문자열  );
						// js : parseInt(문자열);
			
			alert("[알림] 재고가 부족합니다 ");
			return;
			
		}
		
		hm.value++; // 현재 수량 증가
		sum.value =  (hm.value * sell_price).toString().replace(/\B(?<!\.\d*)(?=(\d{3})+(?!\d))/g, ","); ;
	}
	
	function del() { // -버튼 눌렀을때 메소드 실행 
		hm = document.viewform.amount;
		sum  =  document.viewform.sum;
		// 제품수량 0보다 크게 설정 
		if( hm.value > 1 ){
			hm.value--; //수량감소
			sum.value =  (hm.value * sell_price).toString().replace(/\B(?<!\.\d*)(?=(\d{3})+(?!\d))/g, ","); ;
		}
		// 1보다 작은경우 어떠한 코드실행X
	}
	
	function addtocart() {
		
		// confirm() : 확인[true] / 취소[false]  메시지 
		if( confirm("상품을 장바구니에 추가하시겠습니까? ") ){
			viewform.submit();
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
<!-- ----------------------아임포트 스크립트-------------------- -->
<script>

	// HTML 해당 ID 호출
	// $(#id)
		// $("check_module").click(함수){}
	$("#check_module").click( function() {
	
    var IMP = window.IMP; // 생략 가능
    IMP.init("{가맹점 식별코드}"); // 예: imp00000000
    
    // IMP.request_pay( { } )
    IMP.request_pay({
    	
    	pg : 'danal', // pg사 이름
    	pay_method : "card" , // 결제 방식
    	
    	name : "jspDJ" , // 홈페이지 회사명
    	amount : parsInt(document.payform.orderpay.value) , //결제액
    	
    	merchant_uid : "merchant_"+new Date().getTime(),
    	
    	
    },function( rsp){
    	console.log(rsp);
    	
    	if ( rsp.success ){ // 결제를 성공했을때
    		var msg = "결제가 완료되었습니다." // 변수
    		
    	}else{ // 결제를 실패했을때 
    		var msg = "결제가 실패했습니다";
    		msg += "오류 : " + rsp.error_msg;
    	}
    	alert(msg);
   	 });
    
    
    });

</script>
</body>
</html>