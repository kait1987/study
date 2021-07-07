package Day08;

public class 회원 {
	
	// 필드 
	String 아이디;
	String 비밀번호;
	String 성명;
	int 나이;
	
	// 생성자 : 객체의 초기값 : 객체가 생성될때 기본값
	//생성자1 : 빈 생성자 
	public 회원() {
		// 빈 생성자 
	}
	
	// 생성자2 : 아이디만 받는 생성자 
	public 회원( String new아이디 ) {
		아이디 = new아이디;
		// 해당 클래스의 필드와 인수의 필드명이 다를경우 this 생략
		
	}
	// 생성자3 : 모든 필드를 받는 생성자 
	public 회원( String 아이디 , String 비밀번호 , String 성명 , int 나이 ) {
		
		this.아이디 = 아이디;
		// 현재클래스의변수 = 생성자로 들어온 인수의 변수
		this.비밀번호 = 비밀번호;
		this.성명 = 성명;
		this.나이=나이;
			// this.필드명 : 현재 클래스내에서 선언된 필드 
		
	}
	// 메소드 : 함수 
	public void 회원정보() {
		System.out.println( this.아이디);
		System.out.println( this.비밀번호);
		System.out.println( this.성명);
		System.out.println( this.나이);
	}
	
	
	

}
