package domain;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Member {
	
	private String id;
	private String password;
	private String name;
	private String email;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String password, String name, String email) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	// 메일전송 메소드 [ activation , mail 라이브러리 추가  ]
	public void emailsend( String email , int type , String msg) {
						// 받는사람메일주소	,  메일구분[가입,아이디찾기,비밀번호찾기] , 메일내용의 변수 
		// 1. 설정 
		String host = "smtp.naver.com";
		String admin = "관리자 이메일@주소";
		String password = "관리자이메일패스워드";
		
		Properties properties = new Properties(); // java.util 패키지 
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.post", 587 );
		properties.put("mail.smtp.auth", "true");
		
		// 2. 인증 확인 [ 인증된 회원 => 세션 ] 
			// module-info 에 사용할 라이브러리 추가 
		Session session = Session.getDefaultInstance(properties , new Authenticator() {
			
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(admin, password);
			}	
		});
		// 3. 메일 작성
		try {
			MimeMessage message = new MimeMessage( session );
			message.setFrom( new InternetAddress(admin) );
			message.addRecipient( Message.RecipientType.TO , new InternetAddress( email));
		
			if( type == 1 ) { } // type이 1이면 회원가입 감사 메일 
			else if( type == 2 ) { // type 2이면 아이디찾기 메일 
				message.setSubject(" NINK 홈페이지 " );
				message.setText(" 회원님의 아이디 찾기 : " + msg);
			}
			else if( type == 3 ) {	// type 3이면 비밀번호찾기 메일  
				message.setSubject(" NINK 홈페이지 " );
				message.setText(" 회원님의 비밀번호 찾기 : " + msg);
			
			} 
		// 4. 메일 전송
		Transport.send(message);
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
