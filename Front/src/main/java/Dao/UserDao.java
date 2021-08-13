package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dto.UserDto;

public class UserDao {
	
	Connection connection;	// SQL 연결 인터페이스
	ResultSet resultSet;	// SQL 결과 순회 인터페이스
	
	public static UserDao instance = new UserDao(); 	// 현재 클래스에 현재객체 선언;
	public static UserDao getinstance() {
		return instance;
	}

	public UserDao() {
		try {
			// SQL 드라이버 : SQL 마다 다름
			Class.forName(" com.mysql.cj.jbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspweb?serverTimezone=UTC", "root" , "1234" );
		} catch (Exception e) {	}
		
	}
	// 회원 가입 메소드	
	public int usersignup ( UserDto dto) {
		
		String SQL = "insert into user(uid,upassword,uname,uaddress,uemail,upoint) values(?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			
			preparedStatement.setString(1, dto.getUid());
			preparedStatement.setString(2, dto.getUpassword());
			preparedStatement.setString(3, dto.getUname());
			preparedStatement.setString(4, dto.getUaddress());
			preparedStatement.setString(5, dto.getUemail());
			preparedStatement.setInt(6, dto.getUpoint());
			
			preparedStatement.executeUpdate();
			return 1;
						
		} catch (Exception e) {	}
			return 0;
	}
	
	// 로그인 메소드
	public int userlogin( String uid, String upassword) {
		
		String SQL = "select * from user where uid =? and upassword = ? ";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setString(1, uid);
			preparedStatement.setString(2, upassword);
			
			resultSet = preparedStatement.executeQuery();
			
			if( resultSet.next()) {
				return 1;
			}
			return 2;
		} catch (Exception e) {
			return 0;
		}
	}
	
	// 모든 회원 조회
	
	// 개별회원 조회[인수 :아이디 /반환 : 아이디의 모든 정보 출력[ 비밀번호 제외 ] 
	
	public UserDto getuser( String uid) {
		
		String SQL = "SELECT * from user where uid=?";
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setString(1, uid);
			
			resultSet = preparedStatement.executeQuery();
			
			if( resultSet.next()) {
				UserDto userDto = new UserDto(
						resultSet.getInt(1), 
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getString(6),
						resultSet.getInt(7) );
				return userDto;
			}
		} catch (Exception e) { }
		return null;
	}
	// 회원수정 메소드
	public int userupdate( int nno, UserDto userDto) {
		String sql = "update user set upassword=? , uname=? , uaddress=? , uemail =? , where uno = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userDto.getUpassword() );
			preparedStatement.setString(2, userDto.getUname() );
			preparedStatement.setString(3, userDto.getUaddress() );
			preparedStatement.setString(4, userDto.getUemail() );
			preparedStatement.setInt(5, nno );
			preparedStatement.executeUpdate();
			return 1;
		} catch (Exception e) { }
		return 0;
	}
	
	// 회원수정 메소드
	
	public int userdelete( int uno, String password) {
		
		String SQL = "delete from user where uno=? and upassword=?";
						// 로그인된 회원번호와 비밀번호가 동일한경우 
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, uno);
			preparedStatement.setString(2, password);
			preparedStatement.executeUpdate();
			return 1;
		} catch (Exception e) { }
		return 0;
	}
}
