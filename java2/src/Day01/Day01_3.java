package Day01;

public class Day01_3 {
	
	public static void main(String[] args) {
		
	//문자열 자르기
		String 주민등록번호 = "880420-2541212";
		
		String 앞자리 = 주민등록번호.substring(0,6);
		System.out.println(앞자리);
		
		String 뒷자리 = 주민등록번호.substring(7);
		System.out.println(뒷자리);
	
		//문자열 분리 : split
		String[] 배열 = 주민등록번호.split("-");
		System.out.println(배열[0]);
		System.out.println(배열[1]);
		
		//대 소문자 변환
		String 기존문자 = "Java Programming";
		System.out.println(기존문자.toLowerCase());// 대문자
		System.out.println(기존문자.toUpperCase());// 소문자
		
		
		// 숫자열 => 문자열 // 문자열 => 숫자열
		String 문자 = String.valueOf(10);
		
		System.out.println(문자);		// int=>String
		String 문자2 = String.valueOf(true);	//boolean => String
		System.out.println(문자2);
		String 문자3 = String.valueOf(10.5);	//Dobule => String
		System.out.println(문자3);
		
		int 숫자 = Integer.parseInt(문자); //String => int
		System.out.println(숫자);
		boolean 논리 = Boolean.parseBoolean(문자2); // String => boolean
		System.out.println(논리);
		double 실수 = Double.parseDouble(문자3);
		System.out.println(실수);
		
		
		
		
		
	}

}
