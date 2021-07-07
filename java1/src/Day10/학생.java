package Day10;

public class 학생 extends 사람 {

	int 학년 ; 
	// 생성자 
	public 학생(String 이름, int 나이 , int 학년) {
		super(이름, 나이); // 슈퍼클래스호출 
		this.학년 = 학년;
	}
	// 메소드 재정의
	@Override // 상속받은 클래스의 메소드를 재정의하기 
	public void 정보() {
		System.out.println("학생의 이름은 : " + this.이름);
	}
	// 메소드 
	public void 학생정보() {
		System.out.println( this.이름);
	}
}
