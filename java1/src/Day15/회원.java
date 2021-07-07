package Day15;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class 회원 {
	
	String id;
	String password;
	String name;
	String email;
	String phone;
	
	public 회원() {}
	
	public 회원(String id, String password, String name, String email, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	// 회원가입 메소드 
	public void 회원가입() {
		// 1. 입력받기 
		System.out.println("======== 회원가입 =========");
		System.out.println("아이디 : "); String id = Day15_1.scanner.next();
		System.out.println("패스워드 : "); String password = Day15_1.scanner.next();
		System.out.println("이름 : "); String name = Day15_1.scanner.next();
		System.out.println("이메일 : "); String email = Day15_1.scanner.next();
		System.out.println("연락처 : "); String phone = Day15_1.scanner.next();
		// 2. 객체 만들기 
		회원 temp = new 회원(id, password, name, email, phone);
		// 3. 객체를 리스트에 저장하기 
		Day15_1.회원목록.add(temp);
		// 4. 회원가입성공시 성공한 회원에게 메일 보내기 
		메일전송(email , "1" , "0");
	}
	// 비밀번호찾기 메소드 
	public void 패스워드찾기() {
		//1.입력받기
		System.out.println("======== 패스워드찾기 =========");
		System.out.println("아이디 : "); String id = Day15_1.scanner.next();
		System.out.println("이메일 : "); String email = Day15_1.scanner.next();
		//2.해당 아이디와 이메일 찾기 
		for( 회원 temp : Day15_1.회원목록 ) {
			// for 리스트활용 : 리스트내 객체 수 만큼 하나씩 temp 객체 대입 
			if( temp.id.equals(id) && temp.email.equals(email) ) {
				
				메일전송( email , "2" , temp.password );
				
				System.out.println("----> 이메일로 패스워드 전송했습니다.");
				return;
			}
		}
		System.out.println("----> 동일한 회원정보가 없습니다 ");
	}
	// 아이디찾기 메소드 
	public void 아이디찾기() {
		//1.입력받기
		System.out.println("======== 패스워드찾기 =========");
		System.out.println("이름 : "); String name = Day15_1.scanner.next();
		System.out.println("이메일 : "); String email = Day15_1.scanner.next();
		// 2. 이름과 이메일 동일한 회원 찾기 [ 모든 회원 검사 ]
		for( 회원 temp : Day15_1.회원목록) {
			if(temp.name.equals(name) && temp.email.equals(email)) {
				
				메일전송( email , "3" , temp.id );
				System.out.println("----> 이메일로 아이디 전송했습니다.");
				return;
			}
		}
		System.out.println("----> 동일한 회원정보가 없습니다 ");
		
	}
	
	
// 메일전송 메소드 
	public void 메일전송( String email , String type , String re) {
		// SMTP : 간이 우편 전송 프로토콜[규약]
		// 1. 설정 
		String host = "smtp.naver.com"; // 네이버 : smtp.nver.com // 구글 : smtp.gmail.com
		String user ="본인 아이디@~~~.com";
		String password = "본인 비밀번호";
		
		Properties properties = new Properties();
			// 설정 클래스 
		properties.put("mail.smtp.host", host);
				// .put( 키 , 값 ) => 한쌍 
		properties.put("mail.smtp.port", 587 ); // 네이버 : 587
		properties.put("mail.smtp.auth", "true");
		
		// 2. 인증 확인 [ 인증된 회원 => 세션 ]
		Session session = Session.getDefaultInstance(properties , new Authenticator() {
			
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});
		// 3. 메일 작성 
		try {
			MimeMessage message = new MimeMessage( session );
			message.setFrom( new InternetAddress(user)); // 보내는 사람 
			message.addRecipient(Message.RecipientType.TO , new InternetAddress( email ) ); // 받는 사람 
			
			if( type.equals("1")) {
				message.setSubject( "가입 환영합니다"); // 메일 제목 
				message.setText("다양한 이벤트 제공"); // 메일 내용
			}else if( type.equals("2")) {
				message.setSubject( "회원님의 패스워드"); // 메일 제목 
				message.setText("회원님의 패스워드 : "+re); // 메일 내용
			}else {
				message.setSubject( "회원님의 아이디"); // 메일 제목 
				message.setText("회원님의 아이디 : "+re); // 메일 내용
			}
			// 메일 전송 
			Transport.send(message);
		}
		catch (Exception e) {}
	}
}


















