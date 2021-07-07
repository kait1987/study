package Day02;

import java.util.Scanner;

public class Day02_2 {

	public static void main(String[] args) {
		
		// 예제1 : 2명의 이름과 1교시~ 3교시 까지의 데이터 입력 받아 출력 
			//		System.out.println("===========출석부============");
			//		System.out.println("성명\t1교시\t2교시\t3교시");
			//		System.out.println("유재석\t출석\t결석\t출석");
			//		System.out.println("강호동\t결석\t출석\t출석");
			//		System.out.println("============================");
			//	

		// 입력받아 => 변수에 저장 => 변수를 출력 
		// 1. 입력장치 객체 만들기
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 학생명 : ");
		String 학생명1 = scan.next();
		System.out.print("첫번째 의 1교시 출력여부 : ");
		String 교시1_1 = scan.next();
		System.out.print("첫번째 의 1교시 출력여부 : ");
		String 교시2_1 = scan.next();
		System.out.print("첫번째 의 1교시 출력여부 : ");
		String 교시3_1 = scan.next();
		
		System.out.print("두번째 학생명 : ");
		String 학생명2 = scan.next();
		System.out.print("두번째 의 1교시 출력여부 : ");
		String 교시1_2 = scan.next();
		System.out.print("두번째 의 1교시 출력여부 : ");
		String 교시2_2 = scan.next();
		System.out.print("두번째 의 1교시 출력여부 : ");
		String 교시3_2 = scan.next();
		
		System.out.println("===========출석부============");
		System.out.println("성명\t1교시\t2교시\t3교시");
		System.out.println(학생명1+"\t"+교시1_1+"\t"+교시2_1+"\t"+교시3_1);
		System.out.println(학생명2+"\t"+교시1_2+"\t"+교시2_2+"\t"+교시3_2);
		System.out.println("============================");

		
	}

}
