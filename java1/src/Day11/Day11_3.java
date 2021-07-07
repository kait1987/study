package Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Day11_3 {
	
	// main 밖에서 선언 : 
	public static ArrayList<계좌> 계좌목록 = new ArrayList<>();
		// static : 메모리 우선할당 => 프로그램실행시 할당/프로그램종료시 초기화
			// 사용목적 : 프로그램 전체 사용되는 메모리
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ATM atm = null ; // 인터페이스 생성 
		atm = new 계좌();
		while(true) {
			System.out.println("1.신한은행 2.국민은행 3.농협은행 4.종료");
			System.out.print("선택"); int 선택 = scan.nextInt();
			if( 선택 == 1 ) {
				System.out.println("----->신한은행 연결");
				atm = new 신한은행();
				atm.메뉴();
			}
			if( 선택 == 2 )
			if( 선택 == 3 )
			if( 선택 == 4 ) { atm.종료(); return; }
		}
		
	}

}
