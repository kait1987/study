package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // 입력장치 객체 1번만 선언 
/*			
		//예제1 : 하나의 정수를 입력받아 7의 배수인지 확인 => T 혹은 F 출력  
		System.out.print("7의 배수를 찾을 정수 입력 : ");
		int 정수1 = scan.nextInt();
		boolean 결과 = 정수1 % 7 == 0 ;
			// 배수 구하기 : 값 % 수 == 0 이면 값은 그 수의 배수 
		System.out.println("예제1 결과 : " + 결과);
		
		//예제2 : 하나의 정수를 입력받아 홀수 인지 확인 
		System.out.print("홀수/짝수 판단할 정수 입력 : ");
		int 정수2 = scan.nextInt();
		boolean 결과2 = 정수2 % 2 == 0 ; // 짝수 
			// 홀수/짝수 구하기 : 값 % 2 == 0 이면 짝수  == 1 이면 홀수 
		System.out.println("예제2 짝수 판단 : " + 결과2 );
		
		//예제3 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 
		System.out.print(" 7의배수 이면서 짝수 찾을 정수 입력 : ");
		int 정수3 = scan.nextInt();
		boolean 결과3 = 정수3 % 7 == 0 && 정수3 % 2 == 0 ;
		System.out.println("예제3 결과 : " + 결과3 );
				
		//예제4 : 두개의 정수를 입력받아 더 큰수 확인 
		System.out.print(" 두개의 정수 입력 : ");
		int 정수4 = scan.nextInt();
		int 정수4_2 = scan.nextInt();
		boolean 결과4 = 정수4 > 정수4_2 ; 
		System.out.println(" 첫번째 값이 더 크다 : " + 결과4 );
		
		// 예제5 : 반지름을 입력받아 원 넓이 출력하기 
			// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
		System.out.print(" 반지름을 입력 : ");
		int 반지름 = scan.nextInt();
		double 원넓이 = 반지름 * 반지름 * 3.14 ; 
		System.out.println("원넓이는 : " + 원넓이 );
		
		//예제6: 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
			// 예) 54.5   84.3 이면    64.285714%
		System.out.print(" 두 개의 실수 입력 : ");
		double 실수1 = scan.nextDouble();
		double 실수2 = scan.nextDouble();
		double 결과6 = (실수1 / 실수2) * 100 ;
		System.out.println("결과6 : " + 결과6 +"%" );
		System.out.printf("결과6 : %.1f ㄴ%%" , 결과6); // 형식 출력 


			
//		예제7 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
			//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
		System.out.println("윗변 밑변 높이 순으로 입력: ");
		int 윗변 = scan.nextInt();
		int 밑변 = scan.nextInt();
		int 높이 = scan.nextInt();
		double 사다리꼴 = ( 윗변 * 밑변 ) * 높이 /2;
		System.out.println(" 사다리꼴 넓이 : " + 사다리꼴 );
*/		
	
//		예제8 : 키를 정수를 입력받아 표준체중 출력하기
//			//표준체중 계산식 = > (키 - 100) * 0.9
//
//		예제9 :  키와 몸무게를 입력받아 BMI 출력하기
//			//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
//
//		예제10 : inch 를 입력받아 cm 로 변환하기
		
//		예제11 : 중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여
			//소수 둘째 자리 까지 점수 출력하기
			//	// 중간고사 반영비율 => 30 %
			//	// 기말고사 반영비율 => 30 %
			//	// 수행평가 반영비율 => 40 %
		
//		예제12: 연산 순서 나열 하고 x와 y값 예측하기
			//int x = 10;
			//int y = x-- + 5 + --x;
			//printf(" x의 값 : %d , y의값 :  %d ", x, y)

	}
}
