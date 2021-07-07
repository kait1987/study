package Day11;

public class 신한은행 extends 계좌 {
	//필드 
	int 은행코드 = 01; // 식별용
	// 생성자
	public 신한은행() {}
	public 신한은행(String 계좌번호, int 금액) {
		super(계좌번호, 금액);
	}
	
	@Override
	public void 메뉴() {
		super.메뉴();
	}
	@Override
	public void 계좌등록() {
		System.out.println("----->신한은행 계좌등록");
		System.out.println(" 계좌번호 : ");
		String 계좌번호 = Day11_3.scan.next();
		// 리스트에 넣기 
		Day11_3.계좌목록.add(  new 신한은행(계좌번호, 0));
		System.out.println("----->신한은행 계좌등록 완료");
	}
	@Override
	public void 예금() {
		// TODO Auto-generated method stub
		super.예금();
	}
	@Override
	public void 출금() {
		// TODO Auto-generated method stub
		super.출금();
	}
	@Override
	public void 잔고() {
		// TODO Auto-generated method stub
		super.잔고();
	}

}
