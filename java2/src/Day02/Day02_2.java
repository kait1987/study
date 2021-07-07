package Day02;

import java.util.ArrayList;
import java.util.Random;

public class Day02_2 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		// ArrayList<Integer> 차량목록 = new ArrayList<>();
		//int[] 차량번호 = new int[10];
		String[] 차량번호 = new String[10];
		ArrayList<String> 홀수차량 = new ArrayList<>();
		ArrayList<String> 짝수차량 = new ArrayList<>();
		
		// 난수 생성
		for (int i = 0 ; i<10; i++) {
			
//			차량번호[i] = random.nextInt(10000);
//			System.out.println(String.format("%04d", random.nextInt(10000) ) ); 
			차량번호[i] = String.format("%04d", random.nextInt(10000))	;		
						// random.nextInt() : int 범위
						// random.nextInt(10) : int 범위 0 ~ 9
						// random.nextInt(1000) : int 범위 0 ~ 999
			
				// String.format(
			
						// 형식문자
							// %d : 정수
								// %숫자d : 데이터가 차지하는 자릿수
								// %0숫자d : 공백이면 0 채우기
						
		}
		
		// 배열 출력
		for (int i = 0 ; i<10; i++) {
			int 끝번호 = Integer.parseInt(차량번호[i].substring(3));
			if( 끝번호 % 2 == 1) 홀수차량.add(차량번호[i]);
			else 짝수차량.add(차량번호[i]);
		}
		// 홀수차량
		System.out.println("---홀수차량 목록----");
		for(String temp : 홀수차량) {System.out.println(temp);}
		// 짝수차량
		System.out.println("---짝수차량 목록----");
		for(String temp : 짝수차량) {System.out.println(temp);}
		
		
	}

}
