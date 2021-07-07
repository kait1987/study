package Day14;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Day14_4 {
	

	public static void main(String[] args) {	
		// 이메일 api :
			// 메일 보내기 프로토콜[규약] : SMTP
			// 다운로드 : 
		// java에서 메일 보내기 [ 네이버 ] 		
		String host = "smtp.naver.com";  // 메일 회사 호스트명 [ 해당 사이트내에서 확인 ]  
		String user = "본인아이디";			// 관리자 아이디 
		String password = "본인패스워드"; 	// 관리자 비밀번호
		
		Properties properties = new Properties(); // 설정 
		
		properties.put("mail.smtp.host", host); // 
		properties.put("mail.smtp.port", 587 ); // port : 메일회사 smtp port
		properties.put("mail.smtp.auth", "true"); // 인증 검사 
		
		// 인증 확인 
		Session session = Session.getDefaultInstance(properties , new Authenticator() {
			// java.mail
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});
		try {
			// 메일 작성 
			MimeMessage message = new MimeMessage( session ); 
			message.setFrom( new InternetAddress(user)); // 보내는 사람 
			message.addRecipient( Message.RecipientType.TO , new InternetAddress("받는사람 이메일") ); // 받는 사람 
			message.setSubject("java에서 메일보내기"); // 메일 제목 
			message.setText("안녕하세요"); // 메일 내용
		
			Transport.send(message);  // 메일 전송 
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
