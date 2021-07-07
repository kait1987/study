package Day10;

public class 계좌 {

	String 계좌번호;
	int 금액;

	public 계좌(String 계좌번호, int 금액) {
		this.계좌번호 = 계좌번호;
		this.금액 = 금액;
	}
	
	public void 입금( int 입금액) {
		this.금액 += 입금액;
		System.out.println("입금 완료");
	}
	public void 출금( int 출금액) {
		this.금액 -= 출금액;
		System.out.println("출금 완료");
	}
}
