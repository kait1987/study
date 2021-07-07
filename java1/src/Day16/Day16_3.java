package Day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day16_3 {
	
	//list 컬렉션 => map
	public static ArrayList < Map< Integer , User> > usermap = new ArrayList<>();
	public static ArrayList < Map< Integer , Board > >  Boardmap = new ArrayList<>();
	
	// map 컬렉션 => list
	public static Map< String  , ArrayList< Map<Integer , User >> > supermap = new HashMap<>();
	
	// set 컬렉션 => map
	public static Set< Map< String , User > > set = new HashSet<>();
	
	// map 컬렉션  => 키 , set컬렉션
	public static Map< String , Set<User> > map2 = new HashMap<>();
	
	public static void main(String[] args) {
		// Map< 회원번호 , User > 
		// Map< 게시물번호 , Board >
			// 여러개 map 관리 하기 위한 list 선언 
				// List => map< k , v >
		supermap.put("user", usermap );
			
			Map< String , User > map = new HashMap<>();
			
			map.put("1", new User() );
			map.put("2", new User() );
		set.add( map );
		System.out.println("깃허브 테스트 ");
	}
	
}
