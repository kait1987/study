package DAO;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	
	
	Connection conn; // DB와 연결해주는 인터페이스 선언
	private static MemberDAO memberDAO = new MemberDAO();
	
	private static MemberDAO getMemberDAO() {
		return memberDAO;
	}
	
	
	
	public MemberDAO() {
		// TODO Auto-generated constructor stub
		
		try {
			Class.forName("com.mysql.cj.jdc.Driver")
			// 클래스 찾기
				// mySQL 드라이버 이름 : 
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?severTime=UTC", "root", "1234"l);
			
			System.out.println("연동");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			}
	
	
	
	
	}
	
	
	//회원가입 apthem
	public int setmember( Member temp) {
		
		// SQL 질의문
		String SQL = "insert into member(id,password,name,email)"+"values(?,?,?,?)";
			// 테이블에 데이터 추가
			// 1. 모든 필드에 값 넣을경우 => 필드명 생략
				// insert into 테이블명 values(값1, 값2, 값3, 값4)
			// 2. 특정 필드에만 값을 넣을경우	=> 플드명 넣기
				// insert into 테이블명(필드명1, 필드명2, 필드명3, 필드명4) values(값1, 값2, 값3, 값4)
				// ? : 매개변수
		// SQL DB로 보내기
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			// PreparedStatement : 연결된 DB조작 하는 인터페이스
				// 매게변수에 데이터 넣기
				// setString( ?순서 , 데이터)
					pstmt.setString(1, temp.getId() );
					pstmt.setString(2, temp.getpPassword() );
					pstmt.setString(3, temp.getName() );
					pstmt.setShort(4, temp.getEmail() );
	
					//SQL 실행
					pstmt.executeUpdate();
					// 회원가입 성공시 1 변환	
					return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		//회원가입 실패시 0 바환
		return 0;
		
				
		}
		
}

 
