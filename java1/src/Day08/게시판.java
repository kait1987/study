package Day08;

import java.util.Scanner;

public class 게시판 {
	Scanner scan = new Scanner(System.in);
	// 필드
		// int 번호;  // => 리스트 등록 순서 => 리스트 인덱스
		String 제목;
		String 내용;
		String 작성자;
		int 조회수;
	// 생성자 : 생성자의 이름은 클래스명과 동일하게 생성
		// 1. 빈생성자
		public 게시판() {		
		}
		// 2. 모든 필드를 받는 생성자 
		public 게시판( String 제목 , String 내용 , String 작성자 , int 조회수 ) {

			this.제목 = 제목;  // 인수로 들어온 번호를 현재클래스의 번호에 넣어주기 
			this.내용 = 내용;
			this.작성자 = 작성자;
			this.조회수 = 조회수;
		}
	// 메소드 
		// 1. 게시물등록
		public void 게시물등록() {
			System.out.println("----->게시물 등록 ");
			System.out.print("제목 : "); String 제목 = scan.next();
			System.out.print("내용 : "); String 내용 = scan.next();
			System.out.print("작성자 : "); String 작성자 = scan.next();	
			// 객체 생성 : 입력값을 생성자의 인수로 넣어주기 
				// 게시물 번호 : 리스트의 저장된 총 객체수의 +1
			게시판 temp = new 게시판( 제목, 내용, 작성자, 0);
			// 여러 게시물 관리해주는 리스트에 저장 
			Day08_2.게시물목록.add(temp);
		}
		// 2. 게시물 출력 
		public void 게시물출력() {
			System.out.println(this.제목+"\t\t\t"+this.작성자+"\t"+this.조회수);
		}
		// 2. 게시물삭제 
		public void 게시물삭제( int 번호 ) { // int 보낸 변수를 int로 받기 
			System.out.println("-----> 삭제 진행중 ");
			Day08_2.게시물목록.remove(번호);
			System.out.println("-----> 게시물 삭제 완료");
		}
		// 3. 게시물조회수 증가
		public void 게시물조회수() {
			this.조회수++; // 1 증가 
		}
		// 4. 해당 게시물 상세보기 
		public void 게시물보기( int 번호 ) { // 인수 받기 
			게시판 temp = Day08_2.게시물목록.get(번호); // 1번 게시물 => 0번 인덱스 가져오기 
			temp.게시물조회수(); // 게시물 조회수 증가
			System.out.println("------> 게시물 상세페이지 ");
			System.out.println(" 제목 : "+ temp.제목 +"    조회수 : "+ temp.조회수);
			System.out.println(" 내용 " + temp.내용);
		}

}
