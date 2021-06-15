package Day03;

import java.util.Scanner; // import

public class Day03_1 {
	

	public static void main(String[] args) {
		
		int a = 12 ;
		int b = 24 ;
		int c = 45 ;
		
		// 산술연산자 
		System.out.println("더하기 : " + (a + b) );
		System.out.println("빼기 : " + (a - b) );
		System.out.println("곱하기 " + (a * b) );
		System.out.println("나누기 " + (c / a) );
		System.out.println("나머지 " + (c % a) );
		
		// 대입연산자 
		a += 5 ;
		System.out.println("대입연산자 후 : " + a);
		
		// 비교연산자 => T / F
		System.out.println("초과 : " + ( a>b ) );		// F
		System.out.println("미만 : " + ( a<b ) );		// T
		System.out.println("이상 : " + ( a>=b ) );	// F
		System.out.println("이하 : " + ( a<=b ) );	// T
		System.out.println("같다 : " + ( a==b ) );	// F
		System.out.println("같지않다 : " + ( a!=b ) );	// T
		
		// 논리연산자 => 비교연산자 2개 이상 
		System.out.println("AND : " + ( a>b && c>b ) );		// F T => F
		System.out.println("OR : " + ( a>b || c>b ) );		// F T => T
		
		// 증감연산자 
		System.out.println("후위증가 : " + a++ ); // print 출력후에 증가 
		System.out.println(" 확인 : " + a );
		System.out.println("선위증가 : "+ ++a);  	// print 출력전에 증가
		
		System.out.println("후위감소 : "+ a--); 	// print 출력후에 감소 
		System.out.println(" 확인 : " + a );
		System.out.println("후위감소 : "+ --a); 	// print 출력전에 감소 
		
		
		// 과제1 
		/*
		 * 		*급여 명세서 
		 * [ 조건 ] 입력받기 : 기본급 , 수당 
		 * [ 출력 ] 실수령액 = 기본급 + 수당 - 세금[ 기본급10% ]
		 * 
		 */
		Scanner scan = new Scanner(System.in); // 입력장치 객체 1번만 선언 
		
		System.out.print(" 기본급 입력 : ");
		int 기본급 = scan.nextInt();
		System.out.print(" 수당 입력 : ");
		int 수당 = scan.nextInt();
		int 세금 = (int)(기본급*0.1); // java 기본 실수형 => double
			
		System.out.println(" 실수령액 : " + (  기본급 + 수당 - 세금 ) );
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
		System.out.println(" 금액 입력 : ");
		int 금액 = scan.nextInt();
		System.out.println("십만원권 : " + 금액/100000 + "장");
			금액 -= (금액/100000) * 100000; // 현재금액에서 십만원 제외 
		System.out.println("만원권 : " + 금액/10000 + "장");
			금액 -= (금액/10000) * 10000; // 현재금액에서 만원 제외 
		System.out.println("천원권 : " + 금액/1000 + "장");
			금액 -= (금액/1000) * 1000; // 현재금액에서 천원 제외 
		System.out.println("백원 : " + 금액/100 + "개");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
