package Day02;

import java.util.Random;

public class Day02_1 {
	
	public static void main(String[] args) {
		
		
		
		//Math : 수학 계산 관련 클래스
			// 1. Math.abs(값)
		int 정수1 = Math.abs(-5); System.out.println(정수1);
		double 실수1 = Math.abs(-5.4); System.out.println(실수1);
		
			// 2. Math.ceil(값) : 소수 첫번째 자리에서 올림
		double 실수2 = Math.ceil(5.3); System.out.println( 실수2);
		double 실수3 = Math.ceil(-5.3); System.out.println( 실수3);
		
			// 3. Math.floor(값) : 소수 첫번째 자리에서 버림
		double 실수4 = Math.floor(5.3); System.out.println(실수4);
		double 실수5 = Math.floor(-5.3); System.out.println(실수5);
		
			// 4. Math.max(값1, 값2) : 더 큰수를 반환
		int 정수2 = Math.max(5, 9); System.out.println(정수2);
		double 실수6 = Math.max(5.3, 2.5); System.out.println(실수6);
		
			// 5. Math.min(값1, 값2) : 저 작은수를 반환
		int 정수3 = Math.min(5, 9); System.out.println(정수3);
		double 실수7 = Math.min(5.3, 2.5); System.out.println(실수7);
		
		// 랜덤
			// 1. Math.random() [fosejadml qusghks => double (0 ~ 1)
		double 실수8 = Math.random(); System.out.println(실수8);
			// 2. Random 클래스 [랜덤의 반환 타입 정하기]
		Random random = new Random();
		double 실수9 = random.nextDouble(); System.out.println(실수9);
		
			// 7. Math.rint(값) : 가까운 정수의 실수 값 [반올림]
		double 실수10 = Math.rint(5.3); System.out.println(실수10);
		double 실수11 = Math.rint(5.7); System.out.println(실수11);
		
			// 8. Math.round(값) : 반올림
		double 실수12 = Math.round(5.3); System.out.println(실수12);
		double 실수13 = Math.round(5.7); System.out.println(실수13);
		
			//9. 소수 셋째자리에서 반올림
		double 실수14 = 12.3456;
					// 1. 자릿수 변경
		double temp = 실수14 * 100; 
		temp = Math.round(temp);
		실수14 = temp / 100.0; System.out.println(실수14);
		
		
		
		
		
	}

}
