package Day01;
import java.util.ArrayList;
import java.util.Scanner;

public class Day01_4 {
	
	public static void main(String[] args) {
		
/* 독서 검색 프로그램
 * 		[도서명]
 * 		1. 된다! 네이버 블로그&포스트
 * 		2. 스프링 부트 실전 활용 마스터
 * 		3. Tucker의 Go 언어 프로그래밍
 * 		4. 혼자 공부하는 C 언어
 *
 * 	1. 검색을 입력받아 검색한 단어가 포함된 도서를 모두 출력하기
 * 	2. 검색한 단어를 새로운 교체할 문자를 입력받아 교체하기
 * 
 * 		
 */
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> 도서목록 = new ArrayList<>();
		도서목록.add("된다! 네이버 블로그&포스트");
		도서목록.add("스프링 부트 실전 활용 마스터");
		도서목록.add("Tucker의 Go 언어 프로그래밍");
		도서목록.add("혼자 공부하는 C 언어");
		
		// 검색 받기
		System.out.println("검색할 도서명 :");
		String 검색어 = scanner.next();
		
		ArrayList<String> 검색결과 = new ArrayList<>();
		
		// 검색어 찾기
			//for(int i =0 ; i<도서목록.size(); i++) {}
		for( String temp : 도서목록) {
			//리스트내 클래스명 : 리스트명
				// 리스트내 객체 수 만큼 temp 에 하나씩 대입
			if(temp.indexOf(검색어) != -1) {
				검색결과.add(temp);
				System.out.println(temp);
			}
							// -1 : 인덱스가 없다
		}
		// 교체할 단어 입력
		System.out.println("교체 단어 : ");
		String 교체단어 = scanner.next();
		System.out.println("새로운 단어 : ");
		String 새로운단어 = scanner.next();
		for( String temp:검색결과) {
			temp.replace(교체단어, 새로운단어);
			System.out.println("교체후" + temp);
		}
		
	}
	

}
