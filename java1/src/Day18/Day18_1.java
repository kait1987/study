package Day18;

import java.util.Scanner;

public class Day18_1 {
	
	public static void main(String[] args) {
		
		
		// 예외처리 
			// try{   }catch(예외클래스 객체명){ }
			// try{  } : 예외발생 경우의수 
			// catch( ){ } : 예외발생시 코드 
			// finally{ } : 무조건 실행되는 코드 
		
		
		try {
			Scanner scanner = new Scanner(System.in);
			int 선택 = scanner.nextInt();
		}
		catch (Exception e) {
			System.out.println(" 숫자만 입력 가능 ");
		}
		
		// 예외 던지기
			// 선언메소드명() throws 예외클래스명 {   }
		try {
			메소드();
		} catch (Exception e) {
			System.out.println("해당 클래스를 찾지 못했습니다");
		}finally {
			// 예외 와 관련없이 무조건 처리 
			System.out.println("메소드 실행후 결과 -");
		}
		
	}
	
	// 
	public static void 메소드() throws Exception  {
		
		
		Class 클래스찾기 = Class.forName("문자열.class");
						// forname( 찾고자하는 클래스명 ) ;
							// 혹시나 클래스가 없을경우에 대한 예외처리
	}
	

}
