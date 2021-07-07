package Day17;

public class Day17_4 {
	
	public static void main(String[] args) {
		
	
		// 예외처리 : 예외(오류)발생 했을때 처리 코드 
			// * 코드상 오류를 제외한 예외처리
				// if : 오류[ 예상되는 오류 ] 차단
			// 1. 예상되지 않는 오류를 처리 
			// 2. 경우의수가 많은 오류 처리 => 다른코드 대체
			// 3. try{  오류가 발생할것 같은 코드  }catch( ){  대체코드  }  
			// 4. 오류 발생하면 => 프로그램 종료 /// 오류 발생했을때 => 예외처리 => 프로그램 정상화
			// 5. Exception : 예외처리 최상위 클래스 
				// 1. ArrayIndexOutOfBoundsException
				// 2. NumberFormatException
				// 3. NullPointerException 
		
		// 예제1 ) 메모리 크기가 부족할경우 예외발생 
		String[] 배열 = new String[3]; // 배열크기 = 3
		try {
			배열[0] = "java";
			배열[1] = "java";
			배열[2] = "java";
			배열[3] = "java"; // 예외 발생 
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생 : " + e );
		}
		// 예제2 ) 자료형 변환 예외발생 
		try {
			String 문자1 = "100"; // 문자
			String 문자2 = "a100"; // 문자
			
			System.out.println("문자열 -> 숫자열 변환 : "+ Integer.parseInt(문자1));
			System.out.println("문자열 -> 숫자열 변환 : "+ Integer.parseInt(문자2)); // 예외발생 
		}
		catch (NumberFormatException e) {
			System.out.println("예외발생 : " + e );
		}
		// 예제3 ) 메모리 null 인경우 예외발생 
		try {
			String 문자3 = null;
			System.out.println(" 문자3 의 정보 " + 문자3.toString() );
		}										// 객체의 정보 반환 
		catch( NullPointerException e){
			System.out.println("예외발생 : " + e );
		}
		// 예제4 ) 모든 예외 잡기 
		try {
			String 문자4 = null;
			System.out.println(" 문자4 의 정보 " + 문자4.toString() );
		}catch (Exception e) {
			System.out.println("예외발생 : " + e );
		}
	}
}
