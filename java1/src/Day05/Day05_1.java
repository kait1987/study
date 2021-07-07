package Day05;

import java.util.Scanner;

public class Day05_1 {
	
	
	public static void main(String[] args) {
		
		// 예제1 : 369 게임
			// 1. 하나의 정수를 입력받아 해당 정수까지 숫자 출력 
			// 2. 3 혹은 6 혹은 9 가 포함되어 있는 수는 박수 출력 
			// 3. 3-> 박수 13-> 박수 33 -> 박수박수	36-> 박수박수
		
		Scanner scan = new Scanner( System.in);
		
		System.out.println("하나의 정수 : ");int 정수 = scan.nextInt();
		int i = 1; // 반복횟수 
		
		while(true) { // 무한루프 
			
			int j = i / 10;
			
			// 1의 자리의 3 6 9		
			if( i % 10 == 3 || i % 10 == 6 || i % 10 == 9 ) {
				System.out.print("박수" );
				
				// 10의 자리의 3 6 9	
				if( j % 10 == 3 || j % 10 == 6 || j % 10 == 9 ) {
					System.out.print("박수");
				}	
				
			// 10의 자리의 3 6 9
			}else if( j % 10 == 3 || j % 10 == 6 || j % 10 == 9   ) {
				System.out.print("박수");
			}
			else {
				System.out.print(i);
			}
			System.out.println();
			i++; // 반복횟수 1 증가 
			if((정수+1)==i)break; // 반복문 종료 
		}
		
		
		
	}
}
