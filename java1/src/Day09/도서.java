package Day09;

public class 도서 {
	
	String ISBN;
	String 도서명;
	String 저자;
	boolean 대여;
	String 대여회원; // 필드 추가 
	
	public 도서() {
		// TODO Auto-generated constructor stub
	}
	public 도서(String iSBN, String 도서명, String 저자) {
		ISBN = iSBN;
		this.도서명 = 도서명;
		this.저자 = 저자;
		this.대여 = true;
	}
	
	public void 도서등록() {
		System.out.println("-----> 도서등록 ");
		// 중복 제거 
			while( true ) {
				int 스위치 = 0; 
				System.out.println(" ISBN : "); String ISBN = Day09_도서관리프로그램.scan.next();		
				
				if( ISBN.equals("N") ) return;
				
				for( 도서 temp : Day09_도서관리프로그램.도서목록) {
					// 임시객체 : 리스트명  => 리스트내 객체 수 만큼 반복 
					if( temp.ISBN.equals(ISBN) ) {
						System.out.println("----> 동일한 ISBN 이 있습니다 [ N : 종료 ] ");
						스위치 = 1;
						break; // for문 탈출 
					}
				}
				if( 스위치 == 0 ) {
					System.out.println(" 도서명 : "); String 도서명 = Day09_도서관리프로그램.scan.next();		
					System.out.println(" 저자 : "); String 저자 = Day09_도서관리프로그램.scan.next();	
					Day09_도서관리프로그램.도서목록.add( new 도서(ISBN, 도서명, 저자) );
					return;
				}
			}
	}
	public void 도서목록() {
		System.out.println("-----> 도서목록");
		System.out.println(" ISBN\t\t도서명\t\t저자\t\t대여여부");
		for( 도서 temp : Day09_도서관리프로그램.도서목록 ) {
			System.out.println(temp.ISBN+"\t\t"+temp.도서명+"\t\t"+temp.저자+"\t\t"+temp.대여);
		}
	}
	public void 도서삭제() {
		
	}
	public void 도서수정() {
		
	}
	public void 대여( String 아이디 ) {
		
		System.out.println("-----> 도서대여 ");
		System.out.println(" 도서명 : "); String 도서명 = Day09_도서관리프로그램.scan.next();		
		
		for( 도서 temp : Day09_도서관리프로그램.도서목록 ) {
			if( temp.도서명.equals(도서명) ) {

				// 대여여부 판단 
				if(temp.대여) { // 대여가 true 
					System.out.println("-----> 대여가능 ");
					System.out.println("--> 1.대여신청 2.취소"); int 선택 = Day09_도서관리프로그램.scan.nextInt();
					
					if( 선택 == 1 ) {
						System.out.println( temp.도서명 + " 의 도서를 대여합니다 ");
						temp.대여 = false; // 대여 할 경우 
						temp.대여회원 =  아이디;
					}
					if( 선택 == 2 ) {
						return; 
					}
					
				}else { // 대여가 false
					System.out.println("-----> 대여불가능");
				}
			}
		}
	}
	public void 반납( String 아이디 ) {
		
		System.out.println("-----> 도서반납 ");
		System.out.println(" 도서명 : "); String 도서명 = Day09_도서관리프로그램.scan.next();		
		
		for( 도서 temp : Day09_도서관리프로그램.도서목록 ) {
			if( temp.도서명.equals(도서명) ) {

				// 대여여부 판단 
				if( !temp.대여 ) { // 반납은 : !부정 연산자 사용시 :  false => true  
					System.out.println("-----> 반납 가능 ");
					System.out.println("--> 1.반납신청 2.취소"); int 선택 = Day09_도서관리프로그램.scan.nextInt();
					
					// 대여회원일 경우만 반납 
					if( temp.대여회원.equals(아이디 )) {
						if( 선택 == 1 ) {
							System.out.println( temp.도서명 + " 의 도서를 반납합니다 ");
							temp.대여 = true; // 반납 할 경우 
							temp.대여회원 = null; 
						}
						if( 선택 == 2 ) {
							return; 
						}
					}else {
						System.out.println("-----> 반납 권한이 없습니다");
						return;
					}
				}else { // 대여가 false
					System.out.println("-----> 반납 불가능");
				}
			}
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
