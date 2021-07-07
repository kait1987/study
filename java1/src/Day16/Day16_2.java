package Day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day16_2 {
	
	public static void main(String[] args) {
	
		// Map 컬렉션 
		// 1. HashMap : 동기화X // 단일 스레드
			// 1. map.put( 키 , 값 ) => 키 값 중복불가
			// 2. map.get( 키 ) => 키 대응하는 값 호출 
			// 3. map.keySet() => 모든 키 호출 
		
		// 2. Hashtable : 동기화O // 멀티 스레드 
		
		// 1. 선언 
		Map< String , Integer > map = new HashMap<>();
			
		map.put( "유재석" , 80 );
		map.put( "강호동" , 70 );
		map.put( "신동엽" , 60 );
		
		System.out.println(" map 객체수 : " + map.size() );
		System.out.println(" 강호동 검색 : "+map.get("강호동") );
		map.remove("강호동");
		System.out.println(" 삭제후 map 객체수 : " + map.size() );
		
		for( String key : map.keySet() ) {
			System.out.println( key );
			System.out.println( map.get(key) );
		}
		
		Set<String> setkey = map.keySet(); // 모든 키 호출 => set 저장 
		Iterator<String> iterator = setkey.iterator(); 
		
		while( iterator.hasNext() ) {
			String key = iterator.next();
			System.out.println( key );
			System.out.println( map.get(key) );
		}
		map.clear();
		//
		Map< String , String > map2 = new Hashtable<>();
		map2.put( "qwe", "123");
		map2.put( "qwe", "1234");
		map2.put( "qwe1", "123");
		map2.put( "qwe", "123"); // 키 값은 중복값 허용X // 값은 중복허용O 
		System.out.println(" 객체 수 : "+map2.size() );
		// Map
		ArrayList< Map<String , Integer> > list = new ArrayList<>();
		Map<String, Integer> map3 = new HashMap<>();
		list.add(  map  );
		list.add( map3 );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
