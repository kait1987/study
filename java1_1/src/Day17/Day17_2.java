package Day17;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Day17_2 {
	
	public static void main(String[] args) {
		
	
		// 자판기 : Stack 구조 : 3개 제품
			// 1. 콜라 스택[300, 10] 2. 사이다 스택[300, 10] 3. 환타스택[400,10]
			// 2. 동전 [ scanner] 입력받기
			// 3. 제품 선택해서 제품 출력하고 제품 차감
			// 4. 금액부족하면 구매 X 제품수량 X
			// 5. 잔돈 출력
		
		Stack<String> 콜라 = new Stack<>();
		Stack<String> 사이다 = new Stack<>();
		Stack<String> 환타 = new Stack<>();
		// Stack 객체 => List
		List<Stack<String> >제품재고 = new ArrayList<>();
		제품재고.add(콜라);
		제품재고.add(사이다);
		제품재고.add(환타);
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0 ; i<10; i++) {
			제품재고.get(0).push("콜라");
			제품재고.get(1).push("사이다");
			제품재고.get(2).push("환타");
		}
		
		
		while( true) { // 자판기 반복문
			System.out.println("금액 : "); int 금액  = scanner.nextInt();
			
			while (true) { // 제품선택 반복문
				
				System.out.println("현재 남은 금액 : "+금액);
				
				if (콜라.isEmpty() ) {
					System.out.println("1.콜라[가격:200 재고 :매진" );
					}else {
						System.out.println("1.콜라[가격:200 재고 :"+ 제품재고.get(0).size()+"]");
					}
				System.out.println("2.사이다[가격:300 재고 :");
				System.out.println("3.환타[가격:400 재고 :");
				System.out.println("4.금액반환");
				
				int 선택 = scanner.nextInt();
				if ( 선택==1) {
					if(금액 < 200) {System.out.println("금액이 부족합니다.");}
				}
				// 재고부족 차단
				else if(콜라.isEmpty() ) {System.out.println("금액이 부족합니다.");}
				
				else {
					System.out.println("콜라 반환");
					 제품재고.get(0).pop();
					 금액 -=200;
				}
				
				
				if ( 선택 ==2) {}
				if ( 선택 ==3) {}
				if ( 선택 ==4) {System.out.println("잔돈 반환 : "+금액); break;}
				
				
				
			}
		}
	
	
	
	
	
	
	
	
	}
}
