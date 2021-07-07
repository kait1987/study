package Day11;

public interface ATM {
	public void 메뉴();
	public void 계좌등록();
	public void 예금();
	public void 출금();
	public void 잔고();
	public int 계좌찾기();
	public default void 종료() {
		System.out.println("-----> ATM 종료");
	};
}
