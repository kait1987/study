package Day09;

public class 회원 {
	// 필드 
	String 아이디 ;
	String 비밀번호; 
	String 성명 ;
	String 주소 ;
	
	// 빈 생성자
	public 회원() {
		// TODO Auto-generated constructor stub
	}
	// 모든 필드 생성자 
	public 회원(String 아이디, String 비밀번호, String 성명, String 주소) {
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
		this.성명 = 성명;
		this.주소 = 주소;
	}
	// 메소드 
	public void 회원가입() {
		System.out.println("----> 회원가입 정보입력 ");
			// 중복제거
			int 스위치 = 0;
			while( true ) {

				System.out.print("아이디 : "); String 아이디 = Day09_도서관리프로그램.scan.next();
				
				if( 아이디.equals("N") ) return;
				
				for( int i = 0 ; i< Day09_도서관리프로그램.회원목록.size() ; i++  ) {
											// 리스트내 객체 수 
					if( Day09_도서관리프로그램.회원목록.get(i).아이디.equals(아이디) ) {
									// i번째의 아이디가 현재 위에 입력된 아이디와 동일하면 
						System.out.println("-----> 현재 사용중인 아이디 입니다 [ 다시 입력 : N 종료 ] ");
						스위치 = 1;
						break;
					}
				}
				
				if( 스위치 == 0 ) {
					System.out.print("비밀번호 : "); String 비밀번호 = Day09_도서관리프로그램.scan.next();
					System.out.print("성명 : "); String 성명 = Day09_도서관리프로그램.scan.next();
					System.out.print("주소 : "); String 주소  = Day09_도서관리프로그램.scan.next();
					
					// 객체 생성
					회원 temp = new 회원(아이디, 비밀번호, 성명, 주소);
					// 리스트에 담기 
					Day09_도서관리프로그램.회원목록.add(temp); // 해당 객체 담기   = 리스트명.add(객체명)
					System.out.println("----> 회원가입 완료 ");
					return;
				}
			}
	}
	public void 로그인() {
		System.out.println("----> 로그인 정보입력 ");
		System.out.print("아이디 : "); String 아이디 = Day09_도서관리프로그램.scan.next();
		System.out.print("비밀번호 : "); String 비밀번호 = Day09_도서관리프로그램.scan.next();
		
		for( int i = 0 ; i< Day09_도서관리프로그램.회원목록.size() ; i++  ) {
			
			if( Day09_도서관리프로그램.회원목록.get(i).아이디.equals(아이디) 
					&&Day09_도서관리프로그램.회원목록.get(i).비밀번호.equals(비밀번호)) {
				System.out.println( "----> 로그인 성공 ");
				// 로그인성공시 메뉴 
					
					if( 아이디.equals("admin") ) 관리자메뉴();
					else 일반메뉴( 아이디 ); // 로그인 성공한 회원 아이디

				return; // 로그아웃 
			}
		}
	System.out.println("----> 동일한 회원정보가 없습니다 ");
		
	}
	public void 아이디찾기() {
		// 성명 , 주소 입력받아 반복문을 이용한 리스트에서 동일한 객체 찾기 
		System.out.println("----> 로그인 정보입력 ");
		System.out.print("성명 : "); String 성명 = Day09_도서관리프로그램.scan.next();
		System.out.print("주소 : "); String 주소 = Day09_도서관리프로그램.scan.next();
		
		// for 활용 => 리스트 활용
		// for( int i = 0 ; i<Day09_도서관리프로그램.회원목록.size() ; i++  ){ }
		for( 회원 temp : Day09_도서관리프로그램.회원목록 ) {
			// 임시객체 : 리스트명    => 리스트내 객체 수만큼 하나씩 임시객체 대입 
			if( temp.성명.equals(성명) && temp.주소.equals(주소) ) {
				System.out.println("----> "+성명+"회원님의 아이디명 :  "+temp.아이디);
				return;
			}
		}
		System.out.println("----> 동일한 회원정보가 없습니다. ");
	}
	public void 비밀번호찾기() {
		
		System.out.println("----> 로그인 정보입력 ");
		System.out.print("아이디 : "); String 아이디 = Day09_도서관리프로그램.scan.next();
		System.out.print("성명 : "); String 성명 = Day09_도서관리프로그램.scan.next();
		
		for( 회원 temp : Day09_도서관리프로그램.회원목록 ) {
			if( temp.성명.equals(성명) && temp.아이디.equals(아이디) ) {
				System.out.println("----> "+아이디+"아이디의 비밀번호 :  "+temp.비밀번호);
				return;
			}
		}
		System.out.println("----> 동일한 회원정보가 없습니다. ");
	}
	public void 회원수정() {
		
	}
	public void 내도서목록() {
	
	}
	public void 일반메뉴( String 아이디 ) {
		while( true ) {
			System.out.println("---->"+ 아이디 +"님 회원 메뉴 ----> ");
			System.out.println("1.도서목록 2.대여 3.반납 4.내도서보기 5.회원수정 6.로그아웃");
			int 선택 = Day09_도서관리프로그램.scan.nextInt();
			
			도서 temp = new 도서();
			
			if( 선택 == 1) { temp.도서목록(); }
			if( 선택 == 2) { temp.대여( 아이디 );}
			if( 선택 == 3) { temp.반납( 아이디 );}
			if( 선택 == 4) {}
			if( 선택 == 5) {}
			if( 선택 == 6 ) { System.out.println("----> 로그아웃 처리"); return;}
		}
	}
	
	public void 관리자메뉴() {
		while( true ) {
			System.out.println("----> 관리자 메뉴 ----> ");
			System.out.println("1.도서등록 2.도서수정 3.도서삭제 4.회원목록 5.로그아웃");
			int 선택 = Day09_도서관리프로그램.scan.nextInt();
			
			도서 temp = new 도서(); // 임시 객체
			
			if( 선택 == 1 ) { 
				temp.도서등록();
			}
			if( 선택 == 2 ) {
				temp.도서수정();
			}
			if( 선택 == 3 ) {
				temp.도서삭제();
			}
			if( 선택 == 4 ) { }
			if( 선택 == 5 ) { System.out.println("----> 로그아웃 처리"); return;}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
