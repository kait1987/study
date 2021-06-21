package Day03;

public class Day03_2 {
	
	public static void main(String[] args) {
		// 람다식
			// 1. 익명함수[ 이름없는 함수 ] 
			// 2. 단순표현
			// 3. 멀티스레드 4
			// 4. (인수) -> { 실행코드; return;};
				// (  ) -> 실행코드;
				
		// 예제1 
			// 인터페이스의 추상메소드를 정의 
		// 1. 인수x 반환x
		함수인터페이스 fi ; // 인퍼에스객체
		fi = () -> {
			String str = "메소드 실행1";
			System.out.println(str);
		};
		fi.메소드();
		
		fi = () -> {System.out.println("메소드 실행2");};
		fi.메소드();
		
		// 2. 인수o 반환x
		함수인터페이스2 fi2;
		fi2 = (X) -> {
			int 결과 = X * 5 ;
			System.out.println("결과 :" +결과);
		};
		fi2.메소드(3);
		
		fi2 = (X) -> {System.out.println(X*5); };
		fi2.메소드(3);
		
		// 3. 인수o 반환o
		함수인터페이스3 fi3;
		fi3 = ( x , y ) -> {
			int 결과 = x+y;
			return 결과;
		};
		System.out.println(fi3.메소드(3, 5) );
		
		fi3 = ( x , y ) -> {return x+y;};
		System.out.println(fi3.메소드(3, 5) );
		
		fi3 = ( x , y ) -> x+y;
		System.out.println(fi3.메소드(3, 5) );
		
		fi3 = ( x , y ) -> sum(x, y);
		System.out.println(fi3.메소드(3, 5) );
		
		
	}//main 끝
	
	public static int sum(int x, int y) {return(x+y); }
		

	

}
