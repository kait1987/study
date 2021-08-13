package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dto.Member;


public class MemberDao {
	
	private Connection conn;
	private ResultSet rs;
	
	private static MemberDao instance = new MemberDao();
	
	public static MemberDao getinstance() {
		return instance;
	}
	
	public MemberDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspweb?serverTimezone=UTC", "root", "1234");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
// 1. 회원가입 메소드
	
	public int signup(Member member) {
		
		// 1. SQL 작성
		String SQL = "insert into member(mid , mpassword, mname, memail, mphone, maddress)" +"values(?,?,?,?,?,?)";
		
		// 2. SQL 조작
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, member.getMid() );
			statement.setString(2, member.getMpassword() );
			statement.setString(3, member.getMname() );
			statement.setString(4, member.getMemail() );
			statement.setString(5, member.getMphone() );
			statement.setString(6, member.getMaddress() );
			
			
			
		// 3. SQL 실행
			statement.executeUpdate();
			return 1;
			
		} catch (Exception e) {}
			return 0;
	}
	// 2. 로그인 메소드
	public int login( String mid , String mpassword ) {
		
		String SQL ="select * from member where mid =? and mpassword = ? ";
		
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			statement.setString(1, mid );
			statement.setString(2, mpassword );
			
			rs = statement.executeQuery();
			
			if( rs.next() ) { return 1; }
		}
		catch (Exception e) {}
		return 0 ;
	}
		
	
	
	
}
