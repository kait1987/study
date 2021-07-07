package Day15;

import java.util.ArrayList;
import java.util.List;

public class Day15_2 {
	
	
	public static void main(String[] args) {
		
		// 컬렉션 프레임워크 : 메모리 관리 클래스 집합
			// 컬렉션 : 수집
			// 프레임워크 : 미리 만들어진 프로그램
		// 1. List 컬렉션 
			// 1. ArrayList , 2. Vector , 3.LinkedList
				// 1. 배열과 차이점 : 배열[고정메모리] / list[가변메모리]
					// 배열 : int[] 배열명 = new int[10] => 10개 int형 메모리 우선 할당 
				// 2. 인덱스 사용 : 저장되는 순서 [0:시작~~ ]
				// 3. 추가,삭제시 : 인덱스 자동 변경 
				// 4. 자주 사용되는 메소드 
					// 1. 리스트명.add("객체명")
					// 2. 리스트명.get(인덱스번호)
					// 3. 리스트명.remove(인덱스번호)
					// 4. 리스트명.size()
					// 5. 리스트명.clear() 
				// 5.  ArrayList vs Vector : 동기화x:단일스레드  /  동기화o:멀티스레드
				// 6.  ArrayList vs LinkedList : 검색용이 / 삽입,삭제 용이
		
		// 예1) ArrayList 클래스 
			// 1. 선언 
			List< String > list = new ArrayList<>();
			ArrayList< String> list2 = new ArrayList<>();
			// 인터페이스/클래스명 < 리스트에 들어가는 클래스명 > 리스트명 = new ArrayList<생략가능>();
			
			// 2. 메소드
				// 1. 리스트에 객체 추가하기 
				list.add("java"); // 리스트에 객체 넣기 
				//list.add(123); // 리스트에 선언된 클래스만 넣기 가능 
				list.add("python");
				list.add("database");
				list.add("c++");
				// 2. 리스트에 객체 호출하기 
				System.out.println( list.get(0) );
				// 3. 리스트에 객체 삭제하기 
				list.remove(0); // 삭제된 인덱스 뒤로 한칸씩 당겨짐
				System.out.println(list.get(0) );
				// 4. 리스트내 객체수 
				System.out.println( list.size() );
				// 5. 반복문 활용1
				for( int i = 0 ; i<list.size() ; i++ ) {
					System.err.println(  list.get(i)  );
				}
				// 6. 반복문 활용2
				for( String temp : list ) {
					System.out.println( temp );
				}
				// 7. 객체 모두 삭제 
				list.clear();
		// 2. Set 컬렉션 
		// 3. Map

	}
}
