package Day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Day08_2 {
	
	
	// List : 컬렉션(수집) 프레임워크(미리 만들어진 클래스)
	public static ArrayList< 게시판 > 게시물목록 = new ArrayList<>();
	// main 밖에서 생성하기  => main 밖에서도 사용하기 위해서 
	public static Scanner scan = new Scanner(System.in);
		// static : main 스레드가 코드읽어주는데 main 밖에 있으면 못읽음 
			// => static : static 선언시 스레드 별개로 코드 실행시 먼저 메모리 할당
	
	public static void main(String[] args) {
		// 게시판 클래스 
			// 1. 필드 : 상태
				// 1. 게시물번호 , 게시물제목 , 게시물내용 , 게시물작성자 , 조회수 등 
			// 2. 생성자[필수x] : 객체생성시 초기값
				// 1.빈생성자 , 특정필드만 받는 생성자 , 모든필드를 받는 생성자 등
			// 3. 메소드 : 행동 [ 실행코드 ] : 반복적으로 사용되는 코드 묶음
				// 1. 게시물등록 , 게시물삭제 , 게시물조회수증가 ,  게시물보기 등	
		while(true) {
			System.out.println("==== 게시판 커뮤니티 ====");
			// 모든 게시물 출력 
				System.out.println("번호\t제목\t\t\t작성자\t조회수");
				// 반복문을 이용한 리스트에 객체 모두 꺼내기 
				for( int i = 0 ; i<게시물목록.size() ; i++ ) {	
					게시판 temp = 게시물목록.get(i);
					System.out.print(i+"\t"); 
					temp.게시물출력();
				}
			System.out.println("1.글쓰기 2.게시물보기 3.게시물삭제 "); 
			System.out.print("선택 : "); int 선택 = scan.nextInt();
			
			if( 선택==1) {
				게시판 temp = new 게시판();
				temp.게시물등록();
			}
			if(선택==2) {
				System.out.println("->게시물번호 : "); int 번호 = scan.nextInt();
				게시판 temp = new 게시판();
				temp.게시물보기( 번호 ); 
				// 메소드 호출하면서 인수 넣기 
			}
			if(선택==3) {
				System.out.println("->삭제진행 => 게시물번호 : "); int 번호 = scan.nextInt();
				게시판 temp = new 게시판();
				temp.게시물삭제( 번호 );
				// 메소드를 호출하는데 번호 int변수와 같이 가기 
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
}
