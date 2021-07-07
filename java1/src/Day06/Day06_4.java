package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_4 {
	
	
	public static void main(String[] args) {
		
		
		// 로또 판별기 
		
		// 준비 = 배열 생성 [ 1.본인 2.추첨번호 ]
		int [] 로또 = new int[6];
		int [] 추첨번호 = new int[6];
		Scanner scan =new Scanner(System.in);
		
		
		// 1. 입력받기 
		for( int i = 0 ; i<=5 ; i++ ) {
			
			while( true ) { // 정상적인 입력 할떄까지 무한루프 
				
				int 스위치 = 0; // 정상입력인지 아닌지 판단 변수
				
				// i는 0부터 5까지 1씩 증가반복
				System.out.print( (i+1)+"번째 1~45 사이의 숫자 입력 :");
				int temp = scan.nextInt();
				// 1~45 제어
					if( temp <= 0 || temp > 45 ) {
						System.out.println(" 1~45 사이만 가능합니다"); // 다시 입력 
						스위치 = 1; // 비정상
					}
				// 중복값 제거 [ 기존 배열에 이미 있는 수 ]
					for( int j = 0 ; j<=5 ; j++  ) {
						if( 로또[j] == temp ) {
							System.out.println("이미 존재하는 수 입니다"); // 다시 입력
							스위치 = 1; // 비정상
						}
					}
				// 정상입력 
				if( 스위치 == 0 ) { 로또[i] = temp; break; }
			}
		}
		
		// 확인 
		System.out.print(" 선택하신 번호 : ");
		for( int i = 0 ; i<=5 ; i++ ) {
			System.out.print( 로또[i]+"  ");
		}
		
		// 추첨번호 => 난수 6개 생성 
		for( int i = 0 ; i<=5 ; i++ ) {
			
			while( true ) { // 정상적인 입력 할떄까지 무한루프 
				int 스위치 = 0; // 정상입력인지 아닌지 판단 변수
				// i는 0부터 5까지 1씩 증가반복
				Random random = new Random();
				int temp = random.nextInt(45)+1; // 0~44 +1  => 1~45
				// 1~45 제어
					if( temp <= 0 || temp > 45 ) {
						스위치 = 1; // 비정상
					}
				// 중복값 제거 [ 기존 배열에 이미 있는 수 ]
					for( int j = 0 ; j<=5 ; j++  ) {
						if( 추첨번호[j] == temp ) {
							스위치 = 1; // 비정상
						}
					}
				// 정상입력 
				if( 스위치 == 0 ) { 추첨번호[i] = temp; break; }
			}
		}
		// 추첨확인
		System.out.print("\n로또 추첨 당첨번호 : ");
		for( int i = 0 ; i<=5 ; i++ ) {
			System.out.print( 추첨번호[i]+"  ");
		}
		
		
		// 추첨 결과 [ 배열 비교 ] 
		int 당첨개수 = 0;
		for( int i =0 ; i<=5 ; i++ ) {
			for( int j = 0 ; j<=5 ; j++ ) {	
				if( 로또[i] == 추첨번호[j] ) 당첨개수++;
			}
		} // i가 1번 실행할때마다 j는 6번씩 실행  => 총 실행횟수 => 36번
		
		if( 당첨개수 == 6 ) System.out.println(" 당첨결과 : 1등 ");
		if( 당첨개수 == 5 ) System.out.println(" 당첨결과 : 2등 ");
		if( 당첨개수 == 4 ) System.out.println(" 당첨결과 : 3등 ");
		if( 당첨개수 == 3 ) System.out.println(" 당첨결과 : 4등 ");
		if( 당첨개수 == 2 ) System.out.println(" 당첨결과 : 5등 ");
		if( 당첨개수 == 1 ) System.out.println(" 당첨결과 : 꽝 ");
		if( 당첨개수 == 0 ) System.out.println(" 당첨결과 : 꽝 ");

	}
	
	
	

}
