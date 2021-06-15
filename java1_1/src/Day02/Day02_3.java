package Day02;

import java.util.Scanner;

public class Day02_3 {
	
	public static void main(String[] args) {
		

	// 예제2 : 2명의 학생명과 국어 , 수학 , 영어 점수를 입력받아 출력 
	
	// ============ 점수표 ======================
	// 학생명   국어	영어		수학		총점		평균
	// 유재석	   90	 80      70		240		 80
	// 강호동	   100	 70      80		250		 83.3
	// =========================================
	Scanner scan = new Scanner(System.in);
		
	System.out.print("첫번째 학생명 : ");
	String 학생명1 = scan.next();
	System.out.print("첫번째 의 국어 점수 : ");
	int 국어_1 = scan.nextInt();
	System.out.print("첫번째 의 영어 점수 : ");
	int 영어_1 = scan.nextInt();
	System.out.print("첫번째 의 수학 점수 : ");
	int 수학_1 = scan.nextInt();
	
	int 총점_1 = 국어_1 + 영어_1 + 수학_1 ;
	double 평균_1 = 총점_1 / 3 ;
	
	System.out.print("두번째 학생명 : ");
	String 학생명2 = scan.next();
	System.out.print("두번째 의 국어 점수 : ");
	int 국어_2 = scan.nextInt();
	System.out.print("두번째 의 영어 점수 : ");
	int 영어_2 = scan.nextInt();
	System.out.print("두번째 의 수학 점수 : ");
	int 수학_2 = scan.nextInt();
	
	int 총점_2 = 국어_2 + 영어_2 + 수학_2 ;
	double 평균_2 = 총점_2 / 3 ;
	
	System.out.println("===========점수표============");
	System.out.println("성명\t국어\t영어\t수학\t총점\t평균");
	System.out.println(학생명1+"\t"+국어_1+"\t"+영어_1+"\t"+수학_1+"\t"+총점_1+"\t"+평균_1);
	System.out.println(학생명2+"\t"+국어_2+"\t"+영어_2+"\t"+수학_2+"\t"+총점_2+"\t"+평균_2);
	System.out.println("============================");
	
	
	
	
	
	
	
	// 예제3 : 1명의 회원가입 표 만들기 
		//  아이디[S] , 비밀번호[short] , 성명[S] , 이메일[S] 
			// 입력받아 출력하기
	
	//  >>>>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 >>>>>>>>>
	// 아이디		비밀번호		성명		이메일		
	//	qwe		1234		유재석	itdanja@kakao.com

	
	// 과제1 
		/*
		 * 		*급여 명세서 
		 * [ 조건 ] 입력받기 : 기본급 , 수당 
		 * [ 출력 ] 실수령액 = 기본급 + 수당 - 세금[ 기본급10% ]
		 * 
		 */
	
	// 과제2
		/*
		 * 		* 지폐 갯수 세기
		 * 	[조건] 입력받기 : 금액 
		 * 	[출력] 금액에 해당하는 지폐수 세기
		 * 	[ 예 ] : 356789 =>
		 * 			십만원 : 3장
		 * 			만원 : 5장
		 * 			천원 : 6장
		 * 			백원 : 7개 
	 */
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
