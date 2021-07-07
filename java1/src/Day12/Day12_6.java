package Day12;

import java.util.Scanner;

public class Day12_6 {
	
	
	public static void main(String[] args) {
	
		// 문제1 : 회원가입
			//1. member 클래스를 생성해서 필드 정의
			//2. 모든 필드를 private 선언 : 아이디 , 비밀번호 , 성명 
			//3. 아이디 , 비밀번호 , 성명  입력받기 
			//4. 객체 생성하여 public 메소드를 통한 저장 
			//5. pubilc 메소드 필드 호출 
		
		Scanner scan = new Scanner(System.in);
		
		// 입력 
		System.out.print("아이디 입력 :"); String 아이디 = scan.next();
		System.out.print("비밀번호 입력 :"); String 비밀번호 = scan.next();
		System.out.print("성명 입력 :"); String 성명 = scan.next();
		
		// 메소드를 통한 저장 
		회원 회원 = new 회원();
			//회원.아이디 = 아이디; // 접근 제한 
		회원.set아이디(아이디); // 메소드를 통한 접근 하기 
		회원.set비밀번호(비밀번호);
		회원.set성명(성명);

		// 메소드를 통한 호출 
		System.out.println(" 회원아이디 : " + 회원.get아이디() );
		System.out.println(" 회원비밀번호 : " + 회원.get비밀번호() );
		System.out.println(" 회원성명 : " + 회원.get성명() );
		
		// 문제2 : 로그인 
			// 1. 아이디와 비밀번호를 입력받아 동일한경우 로그인 성공 출력 
			// 2. 동일하지 않는 경우 예외처리 발생시켜 로그인 실패 출력	
		try {
			회원.login( 아이디 , 비밀번호);
		}
		catch (Exception e) {
			System.out.println("로그인실패");
			System.out.println("실패사유 : " + e);
		}
		
	
		
	}
}
