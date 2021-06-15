package Day05;

import java.util.Scanner;

public class Day05_2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 반복문
		
			// 1. for 문 (조건) 중첩 for, 리스트와 사용할때 용이함
				//for (int i = 0 ; i <10 ; i += 3)
				// for (시작값 ; 조건문 ; 증감식)
		
			// 2. while 문 (조건) => 무한루프
				
				// int i = 0 ; 시작값
				
				// while(i<10) { // 조건문
				//		 i ++; //증감식
				//		}
		
		
			// 3. do ~ while 문 : 1번 먼저 실행 후 검사
				/*
				  do {
				  } while(조건문)
				  */
		
		
		//for 문
			//if 문, for 문, while() => ; (X)
		for (int i = 0 ; i<10 ; i ++) {
			//i 가 0 부터 10미만까지 1씩증가하면서 반복
			System.out.println(i);
			// 1. 초기값 검사 => 2. 조건문 검사 => 3. 코드를 실행
			// 4. 증감식 => 조건문 검사 [T] => 코드 실행
			// 4. 증감식 => 조건문 검사 [T] => 코드 실행
			// 4. 증감식 => 조건문 검사 [T] => 코드 실행
			// 4. 증감식 => 조건문 검사 [T] => 코드 실행
			// 4. 증감식 => 조건문 검사 [F] => 반복문 탈출
			
			}
		// 예제 1 : 1 ~  50 까지 출력
		for (int i = 1 ; i <=50 ; i++) {System.out.println(i);}
		
		// 에제 2 1 ~ 50 까지 3씩 증가
		for (int i = 1 ; i <=50 ; i+=3) {System.out.println(i);}
		
		// 예제 3 1 ~ 50 까지 누적합계
		int 합계 = 0;
		for (int i = 1 ; i <= 50 ; i++) {합계 = i;}
		System.out.println("1~50의 누적합계 : " + 합계);
		
		// 예제 4 : 1~50까지의 3배수의 누적합계
		int 합계2 = 0;
		for(int i = 1 ; i <=50 ; i++) {
			if( i%3 == 0) 합계2 +=i;
			}
		System.out.println("1~50의 3배수 합계: " + 합계2);
		
		
	//예제 5 : 2단 구구단
		for (int i = 1 ; i<10 ; i++) {
			// i는 1 부터 10 미만까지 1씩 증가 반복
			System.out.println("2 X "+i+" = " +(2*i) );
			
		}
		// 예제 6 : 구구단 [for 중첩] = for () { for(){}
			// 1. 단수는 2단 ~ 9단
			// 2. 곱는 1 ~ 9
				// * 단수 한개당 곱 9번 실행
		for (int 단 = 2 ; 단<10 ; 단++) { // 단 2~ 9 => 8번 반복
			for (int 곱 = 1 ; 곱<10 ; 곱++) { // 곱 1~9 => 9번 반복
				System.out.println(단 +" X " + 곱+ " = "+(단 * 곱));
			}
		}// for의 총 반복횟수는 72번
		
		//예제 7 : 입력한 정수 만큽 별[*] 출력
		
		int 정수 = scan.nextInt();
		
		for (int i = 1 ; i <=정수 ; i++) {
			System.out.println("*");}
		
		
		
		
		//에제 8 : 입력한 정수만큽 별[*] 출력 [* 5개 마다 줄바꿈]
		int 정수2 = scan.nextInt();
		for( int i = 1 ;i<=정수2 ; i++ ) {
			System.out.println("*");
			
			// i가 5의 배수 마다 줄 바꿈 
			if(i % 5 == 0) System.out.println();
		}
		
		
		//예제 9 : 입력한 정수만큽 별[*] 출력 [for 중첩]
			/*예) 5
			 * 	 *						줄 = 1 			별 = 1
			 * 	 **						줄 = 2 			별 = 1 2
			 * 	 ***					줄 = 3 			별 = 1 2 3 
			 * 	 ****					줄 = 4 			별 = 1 2 3 4
			 * 	 *****					줄 = 5 			별 = 1 2 3 4 5
			 * 							줄++				별++			별<=줄
			 */
				// 1. 줄바꿈 for 문
				// 2. 별 for 문
					
		int 줄수1 = scan.nextInt();
		for(int i = 1; i<=줄수1 ; i++) { // i 는 1부터 입력한 [줄수]까지  1씩 증가
			
			for (int s = 1 ; s<i ; s++) { // s는 1부터 i까지 1씩 증가
				System.out.print("*");
			}
			// 줄바꿈	
			System.out.println("");
			}
		
		// 예제 10 : 입력한 줄 수 만큼 별[*] 출력 [for 중첩]
			/*예) 5
			 * 	 *****					i = 1 		s = 1 2 3 4 5 		5-1 => 4+1		5
			 * 	 ****
			 * 	 ***
			 * 	 **
			 * 	 *
			 * 
			 */
		
		int 줄수2 = scan.nextInt();
		for (int i = 1; i<줄수2 ; i ++) {
			for (int j=1 ; j<=줄수2-i ; j++) {
				System.out.print("*");
				
			}
			System.out.println();		
		}
		
		
		
		// 예제 11 : for줄수() {for()공백{} for()별{} }
		int 줄수3 = scan.nextInt();
		for (int i = 1; i<=줄수3 ; i++) {
			
			// 공백이찍기
			
			for (int b= 1 ; b<=줄수3-i ; b++)	 {System.out.print(" ");
			
			// 별찍기
			
			for(int s = 1 ; s<=i; s++) {System.out.println("*");
			}
			
			// 줄바꿈
		}
		System.out.println();
		
		
		// 예제 12
		int 줄수4 = scan.nextInt();
		
		for ( int i = 1 ; i<=줄수4 ; i++) {
			
			//공백찍기
			for( int b = 1 ; b<=i-1 ; b++) { System.out.println(" ");}
			//별찍기
			for (int s = 1 ; s<=줄수4-i+1 ; s++) {System.out.println("*");}
			
			System.out.println();
		}
			
		// 예제 13	
/*	  1
	 333
	55555 	
   7777777		
  999999999
 
 
 		*/
		
		// 예제 14
		/*  	  *
		 *   	 ***
		 *  	*****
		 *     *******
		 *    *********
		 *    
		 */
		
		// 예제 15
			
	}		
}
