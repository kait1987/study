package Day10;

public class 신한은행 extends 계좌 {

	int 은행코드 = 01;
	public 신한은행(String 계좌번호, int 금액) {
		super(계좌번호, 금액);
	}
	@Override
	public void 입금(int 입금액) {
		System.out.println("---> 신한은행 입금");
		super.입금(입금액);
	}
	@Override
	public void 출금(int 출금액) {
		System.out.println("---> 신한은행 출금");
		super.출금(출금액);
	}
	
	

}
