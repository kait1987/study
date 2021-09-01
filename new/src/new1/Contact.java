package new1;

import java.util.Scanner;

public class Contact {
	public static void main(String[] args) {
	
		
//		저장정보
//		이름
//		전화번호
//		이메일
//		주소 
//		생일
//		그룹
		
	args = new String[6];
	args[0] = "이름 : 박주성";
	args[1] = "전화번호 : 010-0000-0000";
	args[2] = "이메일 : asdf@asdf.asdf";
	args[3] = "주소 : 서울";
	args[4] = "생일 : 2021-09-01";
	args[5] = "그룹 : 친구";
	
	System.out.println(args[0]);
	System.out.println(args[1]);
	System.out.println(args[2]);
	System.out.println(args[3]);
	System.out.println(args[4]);
	System.out.println(args[5]);
	
	
	System.out.println("----------------------");
	System.out.println("그룸정보변경");
	System.out.println("----------------------");
	System.out.println("이름 : 박주성");
	System.out.println("전화번호 : 010-0000-0000");
	System.out.println("에미일 : asdf@asdf.asdf");
	System.out.println("주소 : 서울 ");
	System.out.println("생일 : 2021-09-01");
	System.out.println("그룹 : 가족");
	System.out.println("---------------------");
	}

}
