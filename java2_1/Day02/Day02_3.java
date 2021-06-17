package Day02;

public class Day02_3 { 
		
		// 제네릭
			
	public static void main(String[] args) {
	
		// 제네릭 :  < >
			// 1. 객체 생성시 => 자주 변경되는 자료형을 사용할 때
			// 2. 
		box 상자 = new box();
		상자.setObject("사과박스");
		String name = (String)상자.getObject();
		System.out.println(name);
		
		상자.setObject(new Apple() );
		Apple apple = (Apple)상자.getObject();
		System.out.println(apple);
		
	///////////////////////////////////////////////////
		box2<String> 상자2= new box2<>();
		상자2.set("사과박스");
		String name2 = 상자2.get();
		System.out.println(name2);
		
		box2<Integer> 상자3 = new box2<>();
		상자3.set(10);
		int 값 = 상자3.get();
		System.out.println(값);
		
		box2<Apple> 상자4 = new box2<Apple>();
		상자4.set(new Apple() );
		System.out.println(상자4.get() );
		
		
		/////////////////////////////////////////////
		
		// 멀티 제네릭
		제품 < 텔레비전, String> 제품1 = new 제품<>();
		제품1.setKind(new 텔레비전());
		제품1.setModel("스마트텔레비전");
		
		System.out.println("제품1 : " + 제품1.getKind() + 제품1.getModel() );
		
		제품<자동차, String > 제품2 = new 제품<>();
		제품2.setKind(new 자동차());
		제품2.setModel("디젤자동차");
		
		System.out.println("제품2 : " + 제품2.getKind() + 제품2.getModel() );
		
	
	}

}
