package Day04;

import java.util.Scanner;

public class Day04_2 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		// 문제1. 3개의 정수를 입력받아 가장 작은 수 출력
		/*
		 * System.out.print("정수1 입력 : "); int 정수1 = scan.nextInt();
		 * System.out.print("정수2 입력 : "); int 정수2 = scan.nextInt();
		 * System.out.print("정수3 입력 : "); int 정수3 = scan.nextInt(); 
		 * int min = 정수1; // 가장 작은 값을 저장하는 변수에 임의 값저장 if( min > 정수2 ) min = 정수2; if( min > 정수3 ) min = 정수3;
		 * System.out.println(" 가장 작은 수는 : " + min );
		 */
		
		// 문제2. 3개의 정수를 입력받아 오름차순으로 다시 저장하기
		/*
		 System.out.print("정수1 입력 : "); int 정수1 = scan.nextInt();
		 System.out.print("정수2 입력 : "); int 정수2 = scan.nextInt();
		 System.out.print("정수3 입력 : "); int 정수3 = scan.nextInt(); 
		 
		 if( 정수1 > 정수2 ) { // 첫번째 값  / 두번째값 비교 => 교환
			 int 임시 = 정수1;
			 정수1 = 정수2;
			 정수2 = 임시;
		 }
		 if( 정수2 > 정수3 ) {	 // 두번째 값  / 세번째 값 비교 => 교환
			 int 임시 = 정수2;
			 정수2 = 정수3;
			 정수3 = 임시;
		 }
		 if( 정수1 > 정수2 ) { // 첫번째 값 / 두번째 값 비교  => 교환
			 int 임시 = 정수1;
			 정수1 = 정수2;
			 정수2 = 임시;
		 }
		 System.out.println(" 오름차순 정렬후 : " + 정수1 +"\t"+ 정수2+"\t" + 정수3 + " 순 입니다 " );
		*/
		
		// 문제3. 아이디 qwe405060 비밀번호가 1234 회원 한명이 존재했을때 
			// 1. 로그인 했을때 아이디와 비밀번호가 동일한 경우에만 로그인 성공 출력 
			// 2. 동일한 아이디가 와 비밀번호가 아닐경우 로그인 입력창 반복실행 
		
		/*
		while( true ) { // 무한반복하기 
			System.out.println(" 로그인 창 ");
			System.out.print(" 아이디 : "); String loginID = scan.next();
			System.out.print(" 비밀번호 : "); String loginPassword = scan.next();
			
			if( loginID.equals("qwe405060") && loginPassword.equals("1234") ) {
				// 입력한 아이디와 패스워드가 동일한경우
				System.out.println("--->로그인 성공");
			}else {
				System.out.println("--->동일한 회원이 없습니다. [ 다시 입력해주세요 ] ");
			}
		}
		*/
		
		// 문제4 : 자판기 만들기 [ 콜라[ 재고:10개]=>500원  , 사이다[ 재고:5개] => 600원 , 환타[ 재고: 7개] => 700원 ]
			// 1. 자판기 프로그램 무한루프 
			// 2. 사용자에게 금액을 입력 받기 
			// 3. 입력받은 금액으로 제품 구매
					// 1. 제품 번호와 갯수 입력받아 구매 
			// 4. 최종 구매 => 재고 감소 , 매출 증가 
		
		int 콜라재고 = 10;
		int 사이다재고 = 5;
		int 환타재고 = 7;
		
		while( true ) { // 전체 코드 반복 
			System.out.println("----- 자판기 프로그램 -----");
			System.out.println("금액을 넣어주세요 : ");
				// 금액 변수
				int 금액 = scan.nextInt();
				int 장바구니금액 = 0 ; 
				int 콜라구매수  = 0 ;	
				int 사이다구매수 = 0 ;
				int 환타구매수 = 0 ;
				
			while( true ) { // 구매 코드 반복 		
				System.out.println("1. 콜라[500원] 2.사이다[600원] 3.환타[700원] 4.결제");
					// 메뉴 선택 변수
					int 선택 = scan.nextInt();
					if ( 선택 == 1 ) { 
						System.out.println(" 콜라 구매개수 : "); int 구매수 = scan.nextInt();
						
						if( 구매수 > 콜라재고 ) System.out.println(" 재고가 부족합니다 ");
						else if( (구매수*500) > 금액  ) System.out.println(" 금액이 부족합니다 ");
						else {
							int 콜라가격 = 구매수 * 500;
								int temp  = 장바구니금액 + 콜라가격;
							if(  temp > 금액  ) System.out.println(" 금액 부족 ");
							else {
								System.out.println(" 장바구니 추가 했습니다 ");
								장바구니금액 += 콜라가격;
								콜라구매수 += 구매수;
							}
						}
					}
					if ( 선택 == 2 ) {
						System.out.println(" 사이다 구매개수 : "); int 구매수 = scan.nextInt();
						
						if( 구매수 > 사이다재고 ) System.out.println(" 재고가 부족합니다 ");
						else if( (구매수*600) > 금액  ) System.out.println(" 금액이 부족합니다 ");
						else {
							int  사이다가격 = 구매수 * 600;
							int temp  = 장바구니금액 +  사이다가격;
							if(  temp > 금액  ) System.out.println(" 금액 부족 ");
							else {
								System.out.println(" 장바구니 추가 했습니다 ");
								장바구니금액 +=  사이다가격;
								사이다구매수 += 구매수;
							}
						}
					}
					if ( 선택 == 3 ) {
						System.out.println(" 환타 구매개수 : "); int 구매수 = scan.nextInt();
						
						if( 구매수 > 환타재고 ) System.out.println(" 재고가 부족합니다 ");
						else if( (구매수*700) > 금액  ) System.out.println(" 금액이 부족합니다 ");
						else {
								int 환타가격 = 구매수 * 700;
								int temp  = 장바구니금액 + 환타가격;
							if(  temp > 금액  ) System.out.println(" 금액 부족 ");
							else {
								System.out.println(" 장바구니 추가 했습니다 ");
								장바구니금액 += 환타가격;
								환타구매수 += 구매수;
							}
						}
					}
					if ( 선택 == 4 ) {
						System.out.println("------->장바구니 ");
						if( 콜라구매수 !=0 ) System.out.println(" 콜라 : "  + 콜라구매수 + " 총 금액 : " + ( 콜라구매수*500) );
						if( 사이다구매수 !=0 ) System.out.println(" 사이다 : "  + 사이다구매수 + " 총 금액 : " + ( 사이다구매수*600) );
						if( 환타구매수 !=0 ) System.out.println(" 환타 : "  + 환타구매수 + " 총 금액 : " + ( 환타구매수*700) );
						
						System.out.println(" 총 금액 : " + 장바구니금액 );
							// 구매후 재고 감소 
							콜라재고 -= 콜라구매수; 
							사이다재고 -= 사이다구매수; 
							환타재고 -= 환타구매수; 
							
						System.out.println(" 잔돈 : " + ( 금액 - 장바구니금액 ));
						
						break; // 반복문 탈출
					}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
