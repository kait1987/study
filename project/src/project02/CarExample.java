package project02;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞쪽 HankookTire로 교체");
			}
		}
	}

}
