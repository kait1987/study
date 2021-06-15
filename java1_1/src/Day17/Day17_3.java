package Day17;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day17_3 {
	
	public static Queue<String> 종점역 = new LinkedList<String>();
	public static Queue<String> 용산역 = new LinkedList<String>();
	public static Queue<String> 서울역 = new LinkedList<String>();
	public static Queue<String> 구로역 = new LinkedList<String>();
	
	public static ArrayList<Queue<String> > 전철현황 = new ArrayList<>();
	
	public static void main(String[] args) {
	
		
	// Queue
		// 1. 전철 밀어내기
		// 2. 역 : 종점역 -> 용산 -> 서울 -> 구로 서클
		// 3. 종점역 : 전철 3개의 객체
		// 4. 3초마다 하나씩 역 이동
	
		전철현황.add(종점역); 전철현황.add(용산역); 전철현황.add(서울역); 전철현황.add(구로역);
		
		전철현황.get(0).offer("전철1");
		전철현황.get(0).offer("전철2");
		전철현황.get(0).offer("전철3");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(" ==== 현재 전철역 상황 ====");
			전철역현황();
			
		}
		
		System.out.println("현재 종점역의 전철 수" + 전철현황.get(0) );
		
		try {
			System.out.println("3초 후 ~~~~");
			Thread.sleep(3000); // 밀리초 시간 지연
			String temp = 전철현황.get(0).poll();
			전철현황.get(1).offer(temp);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("현재 종점역의 전철 수 : "+ 전철현황.get(0));
		System.out.println("현재 용산역 전철 수 : "+ 전철현황.get(1) ); 
	
	
	
	}// 메인 메소드 끝
	
	public static void 전철역현황() {
		
	}

}
