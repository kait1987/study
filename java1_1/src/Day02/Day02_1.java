package Day02; // 패키지명

import java.util.Scanner;

public class Day02_1 { // 클래스 시작 	
	
	// 클래스 정의
	
	public static void main(String[] args) { // main 시작 
	// ??  // ??? //?? // main : 스레드 => 코드를 읽어주는 역활 	
	
//		 실행코드 
//		System.out.println("자바 입니다");
//		// 입력 클래스를 이용한 입력 객체 만들기  
//		Scanner 입력장치 = new Scanner(System.in);
//			// 객체 만들기 : 클래스명 객체이름 = new 생성자명();
//				// new 연산자 : 객체에 메모리 할당 
//					// System.in : 입력장치 
//		// 입력객체의 입력된 값 가져와서 변수에 저장  
//		int 정수 = 입력장치.nextInt();
//				// 입력장치 객체에 저장된 값을 가져오기 
//					// 변수 만들기 : 자료형 변수이름 = 데이터 ;
//		// 변수를 출력 
//		System.out.println("현재 입력한 값은 " + 정수);
		
		
		
		// 변수
		int 정수1 = 0 ; // int형 변수 선언 
		int 정수2 = 10 ; // int형 변수 선언과 데이터 넣어주기 
		System.out.println( 정수1 ); //
		System.out.println( 정수2 );
			// int 정수1 = 123 ; // 변수 선언은 한번만 가능 
		정수1 = 123 ; // 변수는 데이터 변경 가능 
		System.out.println( 정수1);
		
		// 변수 출력  : " " 처리 x
		System.out.println( "정수2 변수의 저장된 값 : " + 정수2);
		
		// 자료형 
		boolean 논리변수 = true;
			// true , false 만 저장 가능 
		// boolean : 1비트 
		System.out.println("boolean형 변수 : " + 논리변수 );
		
		char 문자변수 = 'a';
		// char : 2바이트 : 문자출력 
		System.out.println("char형 변수 : "+문자변수);
		char 문자변수2 = 97;
		System.out.println("char형 변수 : "+문자변수2);
		
		byte 바이트변수 = 100;
		System.out.println("바이트형 변수 : "+바이트변수);
		byte 바이트변수2 = 'a';
		System.out.println("바이트형 변수 : "+바이트변수2);
		// byte : 1바이트 : +-127
		
		short 쇼트변수 = 300;
		System.out.println("쇼트형 변수 : " + 쇼트변수 );
		short 쇼트변수2 = 'a';
		System.out.println("쇼트형 변수 : " + 쇼트변수2);
		// byte : 2바이트 : +-3만정도 
		
		int 인트변수 = 3000;
		System.out.println("인트형 변수 : " + 인트변수 );
			// int 인트변수2 ="abc"; // 문자열은 못받음 
		int 인트변수2 = 'a';
		System.out.println("인트형 변수 : " + 인트변수2);
		// int : 4바이트 : +-3만정도 
		
		long 롱변수 = 999999999999999999L;
		System.out.println("롱형 변수 : "+ 롱변수);
		// long : 8바이트 
		
		float 실수변수 = 10.511111111111111111111f;
		System.out.println("실수형 변수 : " + 실수변수 );
		
		double 실수변수2 = 10.511111111111111111111;
		System.out.println("실수형2 변수 : "+실수변수2);
		
		String 문자열객체 = new String();
		문자열객체 = "안녕하세요";
		System.out.println("문자열 객체 : " + 문자열객체);
		
		String 문자열객체2 = "안녕하세요2";
		System.out.println("문자열 객체2 : "+ 문자열객체2);
		
		// int형 자료형의 클래스 
		Integer 정수3 = 123;
		System.out.println("클래스형 인트객체 : " + 정수3);
		
		// 형 변환 => 클래스/자료형 변경 
			// 큰 상자 => 작은상자   가능 
		char 변환1 = 123;
		int 변환2 = 변환1; // 가능 
		
		float 변환3 = 10.5f;
		double 변환4 = 변환3; // 가능 
		
		// 강제 형변환 
			// 변수명 앞에 ( 자료형/클래스 ) 
		double 변환5 = 10.5;
		float 변환6 = (float)변환5; // 불가능 
		
		
	} // main 끝 
} // 클래스 끝 
