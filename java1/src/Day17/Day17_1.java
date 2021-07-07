package Day17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day17_1 {
	
	
	public static void main(String[] args) {
		
		// 컬렉션 프레임워크 : 자료구조 [ 데이터 관리 구조 ]
		
		// Stack 클래스 : LIFO
				// 예) : ctrl+z : 되돌리기
				// 입구/출구 동일 => 가장 나중에 들어온 메모리가 가장 먼저 나감
					// .push( 객체 )  == .add( 객체 )
					// .isEmpty() : 모두 비어 있는지 확인 T / F
					// .pop() : 삭제
		// Queue 클래스 : FIFO
				// 예) : 줄세우기
				// 입구/출구 별도 => 가장 먼저 들어온 메모리가 가장 먼저 나감
					// .offer( 객체 )  == .add( 객체 )
		
		Stack< 동전 > 동전상자 = new Stack<>();
			// <  > : 제네릭 
		동전상자.push( new 동전(100) );
		동전상자.push( new 동전(200) );
		동전상자.push( new 동전(300) );
		System.out.println("동전상자의 동전수 : " + 동전상자.size());
		
		// for( int i = 0 ; i<동전상자.size ; i++ ) {   }
		for( 동전 temp : 동전상자 ) {
			System.out.println("동전 금액: "+temp.동전);
		}
		
		while( !동전상자.isEmpty() ) { // ! isEmpty()
			동전 temp = 동전상자.pop() ;
			System.out.println(" 꺼낸 동전 : " + temp.동전 );
		}
		
		Queue<동전> 동전상자2 = new LinkedList<>();		
		
		동전상자2.offer( new 동전(100) );
		동전상자2.offer( new 동전(200) );
		동전상자2.offer( new 동전(300) );
		
		System.out.println(" 동전상자2 : " + 동전상자2.size());
		
		for( 동전 temp : 동전상자2 ) {
			System.out.println("동전 금액 : "+temp.동전);
		}
		
		while( !동전상자2.isEmpty() ) {
			동전 temp = 동전상자2.poll();
			System.out.println(" 동전 금액 : "+temp.동전);
		}	
		
		
		
	}
}
