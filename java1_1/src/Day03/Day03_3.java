package Day03;

import java.util.Scanner;

public class Day03_3 {
	
	
	public static void main(String[] args) {
		
/*	
		// IF
		
		// 예제1 
		if( 3 > 1 ) System.out.println("3이크다"); // 출력O
		
		if( 3 > 5 ) System.out.println("3이크다"); // 출력X
		
		// 예제2 
		if( 3 > 1 ) { // if s
			System.out.println("참 입니다 ");
			System.out.println("3이 크다 ");
		} // if e
		
		// 예제3 
		if( 3 > 5 ) {
			System.out.println("3크다 ");
		}else {
			System.out.println("5가 크다");
		}
		
		// 예제4 
		if( 3 > 5 ) {
			System.out.println("3크다5");
		}
		else if( 3 > 4 ) {
			System.out.println("3크다4");
		}
		else if( 3 > 3 ) {
			System.out.println("3크다3");
		}
		else if( 3 > 2 ) {
			System.out.println("3크다2");
		}else {
			System.out.println("T가 없다 ");
		}
*/		
		Scanner scan = new Scanner(System.in);
/*		
		// 예제5 : 하나의 점수를 입력받아 80점 이상이면 합격출력 아니면 탈락 
		System.out.println(" 점수 입력 : ");
		int 점수 = scan.nextInt();
		
		if( 점수 >=80 ) System.out.println("합격");
		else System.out.println("불합격");
		
		// 예제6 : 하나의 점수를 입력받아 
		//			90점 이상이면 A
		//			80점 이상이면 B
		//			70점 이상이면 C
		//			60점 이상이면 D
		//			그외 탈락
		System.out.println("점수 입력 : ");
		int 점수2 = scan.nextInt();
		
		if( 점수2 >= 90 )System.out.println(" A등급 ");
		else if( 점수2 >= 80 )System.out.println(" B등급 ");
		else if( 점수2 >= 70 )System.out.println(" C등급 ");
		else if( 점수2 >= 60 )System.out.println(" D등급 ");
		else System.out.println("탈락");
*/		
		// 예제 7 : 하나의 점수 와 성별 를 입력받아 
		//			90점 이상이면 
						// 남자이면 A - 1 출력 
						// 여자이면 A - 2 출력 
		//			80점 이상이면 B
						// 남자이면 B - 1 출력 
						// 여자이면 B - 2 출력 
		//			70점 이상이면 C
						// 남자이면 C - 1 출력 
						// 여자이면 C - 2 출력 
		//			60점 이상이면 D
						// 남자이면 D - 1 출력 
						// 여자이면 D - 2 출력
		//			그외 탈락
		System.out.println("점수 입력 : ");
		int 점수3 = scan.nextInt();
		System.out.println("성별 입력 : ");
		String 성별 = scan.next();
		
		if( 점수3 >= 90 ) {
			if( 성별.equals("남자") ) { // 문자열 비교시 == 사용불가 
					//  문자열 비교 메소드 : .equals
				System.out.println(" A-1 ");
			}else {
				System.out.println(" A-2 ");
			}
		}
		else if( 점수3 >= 80 ) {
			if( 성별.equals("남자") )System.out.println(" B-1 ");
			else System.out.println(" B-2 ");
		}
		else if( 점수3 >= 70 ) {
			if( 성별.equals("남자") )System.out.println(" C-1 ");
			else System.out.println(" C-2 ");
		}
		else if( 점수3 >= 60 ) {
			if( 성별.equals("남자") )System.out.println(" D-1 ");
			else System.out.println(" D-2 ");
		}
		else {
			System.out.println("탈락");
		}

	}
}
