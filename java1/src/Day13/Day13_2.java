package Day13;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day13_2 {
	
	// 파일 클래스 생성 
	// 예제 : 리스트에 정보를 담고 파일에 저장 / 파일을 읽어와서 리스트에 저장 	
	
	public static ArrayList<user>userlist = new ArrayList<>();
		// public : 접근제한자[모두 접근 가능]
			// static : 메모리 우선할당 [ 프로그램 종료시 초기화]
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		
		// 파일 불러오기 
		userlist = FileUtil.readfile( new File("c:/java/","userlist.txt") );
		
		while(true) {
			user temp = new user();
			temp.signup();
		}
		
		
		
		
	}

}
