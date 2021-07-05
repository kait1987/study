package Day14;
import java.net.InetAddress;

public class Day14_1 {
	
	// 네트워크 기초 
			// 1. 네트워크 = 인터넷[ pc <----> pc ]
			// 2. ip = 인터넷주소 = 집주소
				// 128 . 0 . 192 . 2 => 4칸으로 구성[ . 구분 ]  0~255사이의 숫자
			// 3. 도메인 주소 [ DNS ] 
				// IP주소 ---> 문자 [ www.naver.com ]
		
				//  내pc	 ---- 요청 ----->  네이버 서버pc
				//		<--- 데이터 ----
			// pc ip 확인 
				// 1. 시작버튼 => cmd => ipconfig
			// pc port[외부로부터 들어오는 문] 확인 
				// 1. netstat 
	
	public static void main(String[] args) {
		try { // .getLocalHost() 예외 발생 ~
			
			// java에서 ip 주소 확인
			
			InetAddress address = InetAddress.getLocalHost();
											// Local : 로컬 [ 현pc]
			System.out.println("현재 pc의 이름 : " + address.getHostName());
			System.out.println("현재 pc의 ip주소 :" address.getHostAddress());
			
			// 네이버 회사의 ip 주소 보기
			InetAddress address2 = InetAddress.getByName("www.naver.com");
			System.out.println("네이버 서버 pc의 이름 :" + address2.getHostName() );
			System.out.println("현재 pc의 ip주소 :" address2.getHostAddress());
			
			// ip주사가 여러개 일 경우
			InetAddress[] addresses = InetAddress.getAllByName("www.naver.com");
			for (InetAddress address3 : address ) {
				System.err.println("네이버 서버 pc 의 이름" + address3.getHostName() );
				System.out.println("네이버 서버 pc 의 ip 주소" + address3.getHostAddress() );
				}
			
			//구글 회사의 ip주소 보기
			InetAddress address4 = InetAddress.getByName("www.google.com")
			System.err.println("구글 서버pc의 이름 : " + address4.getHostName() );
			System.out.println("구글 서버pc의 ip주소" + address4.getHostAddress() );	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
