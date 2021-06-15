package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
//		 로또 판별기
//		 1. 배열사용
//		 2. 1~45 숫자 6개 입력 받기 / 중복값 x
//		 3. 난수[ 추첨번호 6개 생성] / 중복값 x
//		 4. 입력받은 수와 추첨번호 비교
//		 5. 6개 모두 동일하면 1등 
//		 	5개 모두 동일하면 2등
//		 	4개 모두 동일하면 3등
//		 	3개 모두 동일하면 4등
//		 	2개 모두 동일하면 5등
//		 	0~1개 이면 꽝
		
		// 로또 판별기
		
		// 준비 = 배열 생성 [1.본인. 2.추첨번호]
		int [] 로또 = new int[6];
		int [] 추첨번호 = new int[6];
		
		// 1.입력받기
		
		for (int i = 0 ; i<=5 ; i++) {
			while(true) {// 정상적인 입력 할때 무한 루프
				int 스위치 = 0;
			//i 는 0부터 5까지 1 씩 증가 반복
				System.out.print((i+1)+"번째 1~45 사이의 숫자 입력 : ");
				int temp = scan.nextInt();
			// 1~45 제어
					if (temp <0 || temp > 45 ) System.out.println("1~45");
						System.out.println("1~45 사이만 가능합니다.");
						스위치 = 1; // 비정상
						
			// 중복값 제거 [ 기존 배열에 이미 있는 수]
				for ( int j = 0 ; j<=5 ; j++) {
					if(로또[j] == temp ) {
						System.out.println("이미 존재하는 수 입니다.");	
						스위치 = 1; // 비정상
					}
				}
				// 정상입력
				if(스위치 == 0 ) {로또[i] = temp;}
			
	}
		
		//확인
		System.out.println("선택하신 번호 : "); 
		for (int i = 0 ; i<=5 ; i++) {
				System.out.println(로또[i]+" ");
		}
		
		//추첨번호 -> 난수 6개 생성
		for (int i = 0 ; i<=5 ; i++) {
			while(true) {// 정상적인 입력 할때 무한 루프
				int 스위치 = 0;
			//i 는 0부터 5까지 1 씩 증가 반복
				Random random = new random();
				int temp = random.nextInt(45)+i;
			// 1~45 제어
					if (temp <0 || temp > 45 ) 
						System.out.println("1~45 사이만 가능합니다.");
						스위치 = 1; // 비정상
						
			// 중복값 제거 [ 기존 배열에 이미 있는 수]
				for ( int j = 0 ; j<=5 ; j++) {
					if(로또[j] == temp ) {
						System.out.println("이미 존재하는 수 입니다.");	
						스위치 = 1; // 비정상
					}
					
				}
			로또[i] = temp;
		}
			
	}
		
		// 추첨 결과 [ 배열 비교]
		for (int i =0 ; i<=5 ; i++) {
			
			for (int j = 0 ; j<=5 ; j++ ) {
				if( 로또 [i] == 추첨번호[j] ) 당첨개수++;
			}
		}// i가 1번 실행할때마다 J는 6번 실행 => 총 실행 횟수 => 36번 
		
		if( 당첨개수 == 6) System.out.println( " 당첨결과 : 1등 ");
		if( 당첨개수 == 5) System.out.println( " 당첨결과 :2등 ");
		if( 당첨개수 == 4) System.out.println( " 3등 ");
		if( 당첨개수 == 3) System.out.println( " 4등 ");
		if( 당첨개수 == 2) System.out.println( " 꽝 ");
		if( 당첨개수 == 1) System.out.println( " 꽝 ");
	}

}
