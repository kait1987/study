package Day11;

public class 계좌 implements ATM {
	// 필드 
	String 계좌번호; // 식별용
	int 금액;
	// 빈 생성자
	public 계좌() {}
	// 필드 존재 생성자
	public 계좌(String 계좌번호, int 금액) {
		this.계좌번호 = 계좌번호;
		this.금액 = 금액;
	}
	@Override
	public void 메뉴() {
		while( true ) {
			System.out.println("----->메뉴");
			System.out.println("1.계좌등록 2.예금 3.출금 4.잔고 5.종료");
			int 선택 = Day11_3.scan.nextInt();
			if( 선택 == 1 ) 계좌등록();
			if( 선택 == 2 ) 예금();
			if( 선택 == 3) 출금();
			if( 선택 == 4 ) 잔고();
			if( 선택 == 5 ) return;
		}
	}
	@Override
	public void 계좌등록() {
		System.out.println("-----> 계좌등록");
	}
	@Override
	public void 예금() {
		System.out.println("-----> 예금");
		int result = 계좌찾기(); // 메소드 반환 
		if( result == -1 ) return;
		else {
			System.out.println("-----> 예금 할 금액 : ");
			int 금액 = Day11_3.scan.nextInt();
			Day11_3.계좌목록.get(result).금액 += 금액; 
			System.out.println("-----> 예금 성공 ");
		}
	}
	
	@Override
	public void 출금() {
		System.out.println("-----> 출금");
		int result = 계좌찾기(); // 메소드 반환 
		if( result == -1 ) return; // 메소드 종료 
		else {
			System.out.println("-----> 출금 할 금액 : ");
			int 금액 = Day11_3.scan.nextInt();
			// 조건 : 예금보다 더 큰 금액을 출금x 
			if( Day11_3.계좌목록.get(result).금액 < 금액 ) {
				System.out.println("-----> 예금액이 부족합니다 ");
				return; // 메소드 종료 
			}
			Day11_3.계좌목록.get(result).금액 -= 금액; 
			System.out.println("-----> 출금 성공 ");
		}
	}
	@Override
	public void 잔고() {
		System.out.println("-----> 잔고");	
		int result = 계좌찾기(); // 메소드 반환 
		if( result == -1 ) return;
		else {
			System.out.println("-----> 현재 잔고 : " 
					+ Day11_3.계좌목록.get(result).금액);
		}
		
	}
	
	@Override
	public int 계좌찾기() {
		System.out.println(" 계좌번호 : ");
		String 계좌번호 = Day11_3.scan.next();
		// for활용 => 리스트for문 
		for( int i = 0 ; i<Day11_3.계좌목록.size() ; i++ ) {
			계좌 temp = Day11_3.계좌목록.get(i);
			if( temp.계좌번호.equals(계좌번호) ) {
				return i ; // 반환값이 0 이상이면 계좌번호 찾기 성공 
			}
		}
		System.out.println("-----> 동일한 계좌번호가 없습니다 ");
		return -1; // 반환값이 -1 이면 계좌번호 찾기 실패 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
