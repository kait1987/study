package Day11;

public class 스마트텔레비전 extends 텔레비전 {
	
	@Override
	public void 실행() {
		System.out.println("스마트텔레비전 실행");
	}
	@Override
	public void 종료() {
		System.out.println("스마트텔레비전 종료");
	}
	@Override
	public void 소음설정(int 소음) {
		super.소음설정(소음);
		// super : 부모클래스의 메소드 호출 
	}
	
}
