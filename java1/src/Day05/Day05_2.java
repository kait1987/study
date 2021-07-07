package Day05;

import java.util.Scanner;

public class Day05_2 {
	
	
	public static void main(String[] args) {

		
		// for문 
			// if 문 , for문 , while ()  => ; [x]
		for( int i = 0 ; i<10 ; i++ ) {
			// i가 0부터 10미만까지 1씩 증가하면서 반복 
			System.out.println( i );
			// 1. 초기값 검사 => 2. 조건문 검사 => 3. 코드 실행 
			// 4. 증감식 => 조건문 검사 [ T ] => 코드 실행 
			// 4. 증감식 => 조건문 검사 [ T ]=> 코드 실행 
			// 4. 증감식 => 조건문 검사 [ T ]=> 코드 실행 
			// 4. 증감식 => 조건문 검사 [ T ]=> 코드 실행 
			// 4. 증감식 => 조건문 검사 [ T ]=> 코드 실행 
			// 4. 증감식 => 조건문 검사 [ F ]=> 반복문 탈출 
		}
		// 예제1 : 1 ~ 50 까지 출력 
		for( int i = 1 ; i<=50 ; i++ ) { System.out.println(i);}
		
		// 예제2 : 1 ~ 50 까지 3씩 증가 
		for( int i = 1 ; i<=50 ; i+=3) { System.out.println(i); }
		
		// 예제3 : 1 ~ 50 까지 누적합계
		int 합계 = 0 ;
		for( int i = 1 ; i<=50 ; i++ ) { 합계 += i; }
		System.out.println( " 1~50의 누적합계 : " + 합계);
		
		// 예제4 : 1 ~ 50 까지의 3배수의 누적합계
		int 합계2 = 0;
		for( int i = 1 ; i<=50 ; i++ ) { 
			if( i%3 == 0 ) 합계2 += i;
		}
		System.out.println(" 1~50의 3배수 합계 : " + 합계2);
		
		// 예제5 : 2단 구구단 
		for( int i = 1 ; i<10 ; i++ ) {
			// i는 1부터 10미만까지 1씩 증가 반복 
			System.out.println( " 2 X "+i+" = " + (2*i) );
		}
		// 예제6 : 구구단 [ for 중첩 ] = for() {  for(){ }  } 
			// for 안에 for => 첫번째 for 1번 반복 => 두번째 for 모든 반복
			// 1. 단수는 2단 ~ 9단
			// 2. 곱는 1 ~ 9 
				// * 단수 한개당 곱 9번 실행 
		for( int 단 = 2 ; 단<10 ; 단++ ) { // 단 2 ~ 9 => 8번 반복 
			for( int 곱 = 1 ; 곱<10 ; 곱++ ) { // 곱 1~9 => 9번 반복
				System.out.println( 단 +" X " + 곱 +" = "+ (단 * 곱) );
			}
		}  // for의 총 반복횟수 => 72번
		
		Scanner scan = new Scanner(System.in);
		
		// 예제7 : 입력한 정수만큼 별[*] 출력 
		int 정수 = scan.nextInt();
		for( int i = 1 ; i<=정수 ; i++ ) {System.out.print("*");}
		
		// 예제8 : 입력한 정수만큼 별[*] 출력 [ * 5개 마다 줄바꿈 ]
		int 정수2 = scan.nextInt();
		for( int i = 1 ;i<=정수2 ; i++ ) {
			System.out.print("*");
			
			// i 가 5의 배수마다 줄바꿈
			if( i % 5 == 0 ) System.out.println();
		}
		// 예제9 : 입력한 줄수 만큼 별[*] 출력 [ for중첩]
			/* 	 예) 5
			 * 		*			줄 = 1		별 = 1 
			 * 		**			줄 = 2		별 = 1 2 
			 * 		***			줄 = 3 		별 = 1 2 3 
			 * 		****		줄 = 4		별 = 1 2 3 4 
			 * 		*****		줄 = 5 		별 = 1 2 3 4 5 
			 * 					줄++			별++		별<=줄
			 */
				// 1. 줄바꿈 for 문 
				// 2. 별 for 문
		int 줄수1 = scan.nextInt();
		for( int i = 1 ; i<=줄수1 ; i++ ) { // i 는 1부터 입력한[줄수] 까지 1씩 증가 
			//별찍기 
			for( int s = 1 ; s<=i ; s++  ) { // s 는 1부터 i까지 1씩 증가 
				System.out.print("*");
			}
			//줄바꿈
			System.out.println();
		}
		// 예제10 : 입력한 줄수 만큼 별[*] 출력 [ for중첩 ]
			/*		예) 5
			 * 		*****		i = 1	s = 1 2 3 4 5 	5-1 => 4+1		5
			 * 		****		i = 2	s = 1 2 3 4 	5-2	=> 3+1		4
			 * 		***			i = 3	s = 1 2 3 		5-3	=> 2+1		3
			 * 		**			i = 4	s = 1 2 		5-4 => 1 +1		2
			 * 		*			i = 5	s = 1			5-5	=> 0 +1		1
			 * 					i++		최대줄수-현재줄수 + 1
			 */
		
		int 줄수2 = scan.nextInt();
		for( int i = 1 ; i<=줄수2 ; i++ ) {
			
			//별찍기
			for( int s = 1 ; s<=줄수2-i+1 ; s++ ) {
				System.out.print("*");
			}
			//줄바꿈
			System.out.println();
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
	}

}
