package Day17;

import java.util.Stack;

public class Day17_1 {
	public static void main(String[] args) {
	
		// 컬렉션 구조 : 자료구조 [ 데이터 관리 구조]
		
		// Stack 클래스 : LIFO
				// 예) 
				// 예) 입구/출구 동일
		
		
		Stack < 동전 > 동전상자 = new Stack<>();
			// < > 제네릭
		
		동전상자.push( new 동전(100) ) ;
		동전상자.push( new 동전(200) ) ;
		동전상자.push( new 동전(300) ) ;
		System.out.println("동전상자의 동전수 : " + 동전상자.size());
		
		//for (int i = 0 ; i<동전상자.size ; i++) { }
		for (동전 temp : 동전상자 ) {
			System.out.println(" 동전금액 : "+ temp.동전);			
		}
		
		while( !동전상자.isEmpty() ) {
			동전 temp = 동전상자.pop();
			System.out.println( " 꺼낸 동전 : "+ temp.동전);			
		}
		
		Queue<동전> 동전상자 2 = new Linkedlist<>();
		
		
		동전상자2.offer (new 동전(100) );
		동전상자2.offer (new 동전(200) );
		동전상자2.offer (new 동전(300) );
		
		System.out.println(" 동전상자2 : "+ 동전상자2.size() );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
