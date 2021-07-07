package Day02;

public class Day02_4 {
	public static void main(String[] args) {
		
		box2 < Integer > 상자1 = 연결.<Integer>메소드(100);
		
		int 값= 상자1.get();
		System.out.println(값);
		
		
		//box2<String> 상자2 = 연결.<String>메소드("유재석");
		box2<String> 상자2 = 연결.메소드("유재석");
		String name = 상자2.get();
		System.out.println(name);
		
		
		
		
	}

}
