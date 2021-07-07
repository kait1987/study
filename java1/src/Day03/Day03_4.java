package Day03;

import java.util.Scanner;

public class Day03_4 {
	
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	//	과제1 : 2개의 정수를 입력받아 더 큰수 출력 
	System.out.print(" 두개의 정수 입력 : ");
	int 정수1  = scan.nextInt();
	int 정수2 = scan.nextInt();
	
	if( 정수1 > 정수2 )System.out.println( " 큰수는 : "+ 정수1);
	else if( 정수1 < 정수2 ) System.out.println(" 큰수는 : "+정수2);
	else System.out.println(" 두 수는 같다 ");
	
	//	과제2 : 3개의 정수를 입력받아 가장 큰수 출력 
		
	//	과제3 : 4개의 정수를 입력받아 가장 큰수 출력 
	
	//  3일차 수업 정리 
		// 1. 연산자 : 산술 , 대입 , 비교 , 논리 , 증감
		// 2. if : 제어문
	}
}
