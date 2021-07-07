package Day14;

import java.util.Scanner;

public class Day14_3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작 연도 : "); int 검색연도 = scanner.nextInt();
		System.out.print("시작 월 : "); int 검색월 = scanner.nextInt();
		System.out.print("끝 연도 : "); int 끝연도 = scanner.nextInt();
		System.out.print("끝 월 : "); int 끝월 = scanner.nextInt();
		
		int 시작달 = 1;
		int 마지막달 = 12;
		
		//  시작날짜 > 끝월  제어 
		if( 검색연도 > 끝연도  )System.out.println("검색불가");
		else if( 검색연도 == 끝연도 ) {
			if( 검색월 > 끝월 ) System.out.println("검색불가");
		}
		
		for( int y = 검색연도 ; y<=끝연도 ; y++ ) { 
			// Y는 검색연도 부터 끝 연도 까지 연도가 1씩 증가
			
			// Y 가 끝연도를 만났을때 해당 연도는 끝월 까지만 출력 
			if( 끝연도 == y ) 마지막달 = 끝월;
				
			// Y 가 시작연도와 동일한 경우 시작달 부터 출력 
			if( 검색연도 == y ) 시작달 = 검색월;
			else 시작달 = 1 ;
			
			for( int m = 시작달 ; m<=마지막달 ; m++ ) {
				
				Day14_2.달력검색( y , m); // 메소드호출( 
				
			}
	
		}
		
		
		
	}
	
	

}
