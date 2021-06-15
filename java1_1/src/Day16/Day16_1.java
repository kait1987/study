package Day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Day16_1 {
	
	public static void main(String[] args ) {
		
		
		
		// 컬렉션 프레임워크
			// 1. List 컬렉션
				// 1. ArrayList 클래스 : 동기화X
				// 2. Vector 클래스 : 동기화 O
				// 3. LickedList 클래스 : 삽입/삭제 용이
		
			// 2. Set 컬렉션 : 순서가 없는 저장 // 중복허용 X
				// 1. Hashset 클래스
					// Iterator 인터페이스 이용한 요소 접근
		
			// 3. Map 컬렉션 : 키, 값 => 한쌍
		
		
		
		
		// 1. 선언
		java.util.List<User> list = new Vector<>();
			// 인터페이스 : 추상메소드 [ 정의하지 않는 메소드]
				// 인터페이스 혼자서 할 수 있는 기능 x
		
		Vector<User> list2 = new Vector<>();
			// < > 제네릭 : 해당 클래스에 클래스 넣기
		// 2. 메소드
		User user = new User();// 객체생성
		list.add( user );
				// <클래스>의 객체
		list.add(new User()); // 중복허용
		
		list.remove(0); // 첫번째 객체 삭제
		System.out.println(list.size()); // 리스트내 객체 수
		
		for (User temp : list) {
					// list내 객체가 하나씩 Temp 대입
			System.out.println(temp);
		}
		
		
		//
		List<String> list3 = new ArrayList<String>();
		List <String> list4 = new LinkedList<>();
		
		Long 시작;
		Long 끝;
		시작 = System.nanoTime(); // 현재시간[나노] 메소드
		for( int i = 0 ; i<10000 ;i++ ) {
			list3.add(0, String.valueOf(i));
								//	String.valueof(숫자) = > 문자
		}
		끝 = System.nanoTime();
		System.out.println("ArrayList 10000개 삽입 걸린시간 :" + (끝-시작)+ "ns");
		
		
		//HashSet 클래스
		//1. 선언
		Set<String > set = new HashSet<>();
		HashSet<String > set2 = new HashSet<>();
		
		//2. 메소드
		set.add("java");
		set.add("java"); // 중보제거
		set.add("c");
		set.add("database");
		System.out.println(" set의 객체수 : "+ set.size());
		set.remove("c"); // 객체삭제
		System.out.println(" set의 객체수 : "+ set.size());
		//
		for (String temp : set) {
			System.out.println(temp);
			
		}
		
		//get??? ------->Iterator
		Iterator<String> iterator = set.iterator();
			//Iterator : 순서 없는 컬렉션에 모든 객체 순호 ㅣ인터페이스
				// null 부터 시작 next() 매소드 다음으로 이동
		while(iterator.hasNext()) {
					// hasNext() : 다음요소가 있는지 여부 확인 T / F 
			String temp = iterator.next(); // 다음요소 호출
			System.out.println(temp);
			
		}
		set.clear();
		
		
		
		
		
		
		
		
		
	}

}
