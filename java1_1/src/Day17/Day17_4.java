package Day17;

public class Day17_4 { 
	
	public static void main(String[] args) {
		
		// 예외처리 : 예외(오류)발생 했을때 처리 코드 입력
			// *코드상 오류를 제외한 예외처리
				// if : 오류 [일반적인 예상이 되는 오류 ] 차단
			// 1. 예상되지 않는 오류를 처리
			// 2. 경우의 수가 많은 오류 처리 => 다른 코드로 대체
			// 3. try{ 오류가 발생할 것 같은 오류}catch( ){ 대체코드 }
			// 4. 오류가 발생하면 => 프로그램 종료 /// 오류가 발생 했을때 => 예외처리 => 프로그램 정상화 <--사용목적
			// 5. Exception : 예외처리 최상위 클래스
				// 1. ArrayIndexOutOfBoundsException
				// 2. NumberFormatException
				// 3. NullPointerException
		
		
		
		// 예제 1 )
		String[] 배열 = new String[3]; //배열 크기 = 3
		try {
					
		배열[0] = "java";
		배열[1] = "java";
		배열[2] = "java";
		배열[3] = "java";
		}catch (ArrayIndexOutOfBoundsException e) {
			
		System.out.println("예외발생" + e);
		}
		
		//예제 2)
		try {
			String 문자1 = "100";
			String 문자2 = "a100";
			
			System.out.println("문자열 -> 숫자열 변환 :" + Integer.parseInt(문자1));
			System.out.println("문자열 -> 숫자열 변환 :" + Integer.parseInt(문자2));
			
			
		} catch (NumberFormatException e) {
			System.out.println("예외 발생 :" + e);
		}
		
		// 예제 3 ) 메모리가 null 인 경우 예외 발생
		
		try {
			String 문자3 = null;
			System.out.println("문자3 의 정보" + 문자3.toString() );
			
		} catch (NullPointerException e) {
			System.out.println("예외 발생 :" + e);
		}
		
		// 예제 4 ) 모든 예외 잡기
		
		try {
			
			String 문자4 = null;
			System.out.println("문자3 의 정보" + 문자4.toString() );
			
		} catch (Exception e) {
			System.out.println("예외 발생 :" + e);
		}
		
		
		
		
		
		
		
	}

}
