package Day18;

import java.util.Scanner;

public class Day18_2 {
	//1. 배열선언 
	public static int[] 대기명단 = new int[10];

	public static void main(String[] args) {
		System.out.println("------프로그램 실행------\n\n");
		Start();
		System.out.println("\n\n------프로그램 종료------ ");
	}
	public static void Start() {
		while( true ) {	
			Scanner scanner = new Scanner(System.in); // 오류처리 : scanner에 있는 문자를 다시 초기화
			System.out.println("====대기명단====");	
		
			// 대기명단 수 
			int 대기팀수 = 0 ;
			for( int i = 0 ; i<10 ; i++) {
				if( 대기명단[i] !=0 ) {
					대기팀수++;
				}
			}
			// 대기명단 출력
			for( int i = 0 ; i<대기팀수 ; i++ ) {
				if( 대기명단[i] == 0 ) { 
					System.out.println("----> 현재 대기명단 없습니다 "); 
				}
				else { 
					System.out.println(  (i+1)+"번째 팀 인원수 : " + 대기명단[i]+"명" );
				}
			}
			System.out.print("1.명단추가 2.명단삭제");
			System.out.print("선택 : "); 
			int 선택 = 0;
			try {
				선택 = scanner.nextInt();	//  예외 발생  => 이유 : scanner에 문자를 입력했을경우 	
			}
			catch (Exception e) {
				System.out.println("---->숫자만 입력가능합니다 ");
			}
			if( 선택 == 1 ) {
				for( int i = 0 ; i<10; i++ ) {
					if( 대기명단[i] == 0 ) {
						System.out.println("인원수 입력 : ");
						대기명단[i] = scanner.nextInt();
						System.out.println("대기번호 : " + (i+1) +"\n\n");
						break;
					}
					// 10팀 모두 입력 했을경우 
					if( (i+1) == 10 ) {
						System.out.println("-----> 대기줄 부족 [ 기다려주세요 ]");
					}
				}
			}
			if( 선택 == 2 ) {
				for( int i = 0 ; i<10 ; i++ ) {
					// 마지막 명단에 null 
					if( (i+1) == 10 ) {
						대기명단[i] = 0;
						break;
					}
					// 한칸씩 당기기 
					대기명단[i] = 대기명단[i+1];
				}
			}
			if( 선택 == 3 ) { return; }
		}
		
	}
}
