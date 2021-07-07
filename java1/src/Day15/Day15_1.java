package Day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Day16.Board;
import Day16.User;

public class Day15_1 {

	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<회원> 회원목록 = new ArrayList<>();
	
	public static List < Map< Integer , User> > usermap = new ArrayList<>();
	public static List < Map< Integer , Board > >  Boardmap = new ArrayList<>();
	
	public static Map< String , ArrayList<Map<Integer, Object >> > supermap  = new HashMap<>();
	
	public static void main(String[] args) {
		
		
		while(true ) {
			System.out.println("========= 로그인 ==========");
			System.out.println("1.회원가입 2.로그인 5.종료");
			System.out.println("3.비밀번호찾기[id,email] 4.아이디찾기[name,email]");
			int 선택 = scanner.nextInt();
			회원 temp = new 회원();
			if( 선택 == 1 ) { temp.회원가입(); }
			if( 선택 == 2 ) {}
			if( 선택 == 3 ) { temp.패스워드찾기();}
			if( 선택 == 4 ) { temp.아이디찾기();}
	
		}
	
		
	}
		
	


}
