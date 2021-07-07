package Day03;

import java.util.Arrays;
import java.util.Scanner;

import Day02.코스;


public class Day03_1 {
	
	
	
//	여러명의 이름 , 나이 입력받아 명단 배치하기 
//	
//			<유아>	유치원 명단  [ 나이가 8미만이면 ] 
//			<학생>	초등학생 명단 [ 나이가 8이상이면 ] 
//<사람>		<학생>	중학생 명단 [ 나이가 14세 이상이면 ]
//			<학생>	고등학생 명단 [ 나이가 17세 이상이면 ] 
//			<성인>	대학생 명단 [ 나이가 20세 이상이면 ] 
//			<성인>	직장인 명단 [ 나이가 25세 이상이면 ]
	
	
	
	public static Scanner scanner = new Scanner(System.in);
	public static 명단<유아> 유아명단 = new 명단<> ("유아명단");
	
	public static void main(String[] args) {
		
		while (true) {
			
			System.out.println("고객 명단 관리");
			System.out.println("-----> 현재 명단 ------>");
				명단출력(유아명단);
			System.out.println("-----> 명단 추가------->");
			System.out.println("이름 : "); String 이름 = scanner.next();
			System.out.println("나이 : "); int 나이 = scanner.nextInt();
			
			if (나이 <8) {
				유아 temp = new 유아(이름, 나이);
				System.out.println("---------> 고객님은 유아 입니다.");
				유아명단.add(temp);
			}
			else if(나이 >=8 ) { }
			else if(나이 >=14 ) { }
			else if(나이 >=17 ) { }
			else if(나이 >=20 ) { }
			else if(나이 >=25 ) { }
			else {System.out.println("------> 나이 입력 오류"); }
		
		}
	}// main 끝
	// 학생 목록 // ?: 와일드카드
	public static void 명단출력 (명단 <?> course) {
		System.out.println(course.get명단명() + "명단 인원 :" 
				+ Array.toString( course.get고객목록() )); 
		
	}

}
