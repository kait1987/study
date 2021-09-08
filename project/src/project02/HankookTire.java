package project02;

public class HankookTire extends Tire{
	
	// 필드
	// 생성자
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 메소드
	@Override
	public boolean roll() {
		// TODO Auto-generated method stub
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location+ "KumhoTire 수명 : " + (maxRotation-accumulateRotation) + "회" );
			return true;
		}else {
			System.out.println("***" + location + "KumhoTire 펑크 ***");
			return false;
		}
				
	}

}
