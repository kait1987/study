package Day06;

public class Day06_2 {
	
	public static void main(String[] args) {
		
		// Day01 : 출력
		// Day02 : 입력
		// Day03 : 변수 / 자료형
		// Day04 : 연산자 / 제어문
		// Day05 : 반복문 
		
		// 배열 : 특정기준[인덱스] 으로 순서대로 저장된 변수 
			// 여러개 변수를 동시에 관리하기 위해서
			// 변수 -> 메모리할당
			// 배열 -> 여러개 변수 -> 여러개 메모리할당
			// 인덱스 : 변수가 배열에 저장되는 순서 
				// **** 0번시작 ~~~
		
		int 정수1 ; // 4바이트 변수
		int 정수2 ; // 4바이트 변수
		int 정수3 ; // 4바이트 변수
		
		// 배열 선언 
		int[] 배열정수 = new int[3]; // int*3 => 12바이트 배열 
		// 배열 호출 
		System.out.println( 배열정수[0] ); // 배열호출
		System.out.println( 배열정수[1] );
		System.out.println( 배열정수[2] );
		//System.out.println( 배열정수[3] ); // 해당 인덱스 없다

		// 값대입 
		배열정수[0] = 10;
		배열정수[1] = 20;
		배열정수[2] = 30;
		System.out.println( 배열정수 ); // 배열의 주소값 
		System.out.println( 배열정수.length ); // 배열의길이
		System.out.println( 배열정수.toString() ); // 배열의 주소값 
		System.out.println( 배열정수[0] );
		
		// 1차원 배열 int[] 배열명 = new int[]
		// 2차원 배열 int[][] 배열명 = new int[행][열]
		
		int[][] 배열정수2 = new int[2][2]; // 2행 2열 
		배열정수2[0][0] = 80;
		배열정수2[0][1] = 90;
		배열정수2[1][0] = 100;
		배열정수2[1][1] = 110;
		System.out.println( 배열정수2.length ); // 행 길이 
		System.out.println( 배열정수2[0].length); // 열 길이 
		System.out.println( 배열정수2[0][0] );
		System.out.println( 배열정수2[0][1] );
		System.out.println( 배열정수2[1][0] );
		System.out.println( 배열정수2[1][1] );
		
		
		
		
		
		
		
		
		
		
		
	}

}
