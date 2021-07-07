package Day12;

	// 생성자 , get 메소드 , set메소드 => 자동완성 가능 
	// 마우스 오른쪽클릭 => Source

public class 회원 {
	private String 아이디;
	private String 비밀번호;
	private String 성명;
		
	// 접근 메소드 => setter [ 인수 o , 반환x ]
	public void set아이디( String 아이디 ) {
		// 아이디를 인수로 받아 현재 클래스의 아이디에 대입 
		this.아이디 = 아이디;
	}
	public void set비밀번호( String 비밀번호 ) {
		this.비밀번호 = 비밀번호;
	}
	public void set성명( String 성명 ) {
		this.성명 = 성명;
	}
	
	// 접근 메소드 => getter  [ 인수 x , 반환 o ]
	public String get아이디() {
		return this.아이디;
	}
	public String get비밀번호() {
		return this.비밀번호;
	}
	public String get성명() {
		return this.성명;
	}
	
	// 로그인 
	public void login( String 아이디 , String 비밀번호 ) throws Exception {
		
		if( !아이디.equals("qwe") ) {
			// 예외 만들기 
			throw new Exception("아이디가 다릅니다");
		}
			// ! : 부정 연산자 : True => False
		if( !비밀번호.equals("qwe") ) {
			// 예외만들기 
			throw new Exception("비밀번호가 다릅니다");
		}
		System.out.println("로그인 성공 ");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
