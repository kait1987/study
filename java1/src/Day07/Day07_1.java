package Day07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day07_1 {
	
	
	public static void main(String[] args) {
	
		// 학생 점수 관리 프로그램 
			// 1. 1차원배열 사용 
			// 2. 메뉴 < while(true) >
				// 1. 학생 수 	=> 배열크기가 선언 
				// 2. 점수 입력 	=> 학생 수 만큼 점수 입력
				// 3. 통계 		=> 1등 학생의점수 , 전체평균점수 , 내림차순 정렬 출력 
				// 4. 종료 		=> 무한종료
		
		Scanner scan = new Scanner(System.in);
		Integer[] 점수 = null ; // 배열 선언만 => 메모리할당 X
				// new : 메모리 할당 
		while(true) {
			
			System.out.println(" ===학생관리 프로그램===");
			System.out.println("1.학생수 2.점수입력 3.통계 4.종료"); int 선택 = scan.nextInt();
			if(선택==1) {
				System.out.print(" --> 학생수 : "); int 인원수 = scan.nextInt();
				점수 = new Integer[인원수]; // 입력한 수만큼 메모리할당
			}
			if(선택==2) {
				// 배열의 수만큼 반복해서 점수를 입력받기
				for( int i=0 ; i<점수.length ; i++ ) {
					System.out.print((i+1)+"번쨰 학생의 점수 입력 : ");
					점수[i] = scan.nextInt();
				}
				System.out.println("-->모든 학생의 점수를 입력받았습니다. ");
			}
			if(선택==3) {
				//  Arrays : 배열 클래스
					// .sort(배열명) : 정렬(오름차순) 메소드
				Arrays.sort(점수); // 오름차순 
				Arrays.sort( 점수 , Collections.reverseOrder() ); // 오름차순 => 반대 => 내림차순
									// 클래스만 reverseOrder 메소드 사용가능 => int => Integer
				for( int i = 0 ; i<점수.length ; i++ ) {
					System.out.println( (i+1)+"등 점수는: "+ 점수[i]);
				}
				// 가장 높은 점수 
				int max = 0 ; 
				int sum = 0 ;
					for( int i = 0 ; i<점수.length ; i++ ) {		
						// 누적합계
						sum += 점수[i];
						// 가장 높은점수 교체 
						if( max < 점수[i] ) {
							max = 점수[i];
						}
					}
				System.out.println(" 가장 높은 점수는 : " + max );
				System.out.println(" 전체 점수의 평균은 : " + sum/점수.length);
			}
			if(선택==4) { break; }
		}
		
	}
}
