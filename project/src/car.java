

public class car {
	public Car() {
		System.out.println("Car의 기본생성자 입니다.");
	}

	public class Bus extends Car {
		public Bus() {
			System.out.println("Bus의 기본 생성자 입니다.");
		}
	}
	
	public class BusExam{
		public static void main(String[] args) {
			Bus b = new Bus();
		}
	}
}
